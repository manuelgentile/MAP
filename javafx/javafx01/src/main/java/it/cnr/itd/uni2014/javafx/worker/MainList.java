package it.cnr.itd.uni2014.javafx.worker;

import java.util.Random;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainList extends Application {
	private Task<Boolean> copyWorker;
	private int numFiles=1;

	@Override
	public void start(Stage primaryStage) {
		primaryStage
				.setTitle("BackgroundProcesses: Chapter 4 Background Processes");
		// ... Layout and UI controls code here
		final Label label = new Label("Files Transfer:");
		final ProgressBar progressBar = new ProgressBar(0);
		final ProgressIndicator progressIndicator = new ProgressIndicator(0);
		// ... Layout and UI controls code here
		final Button startButton = new Button("Start");
		final Button cancelButton = new Button("Cancel");
		final TextArea textArea = new TextArea();
		// ... Layout and UI controls code here
		// wire up Start button
		GridPane grid = new GridPane();
		grid.add(label, 0, 0);
		grid.add(progressBar, 0, 1);
		grid.add(progressIndicator, 0, 2);
		grid.add(startButton, 0, 3);
		grid.add(cancelButton, 1, 3);
		grid.add(textArea, 0, 4);

		Scene scene = new Scene(grid);

		startButton.setOnAction((ActionEvent event) ->
			{
				startButton.setDisable(true);
				progressBar.setProgress(0);
				progressIndicator.setProgress(0);
				textArea.setText("");
				cancelButton.setDisable(false);
				copyWorker = createWorker(numFiles);
				// wire up progress bar
				progressBar.progressProperty().unbind();
				progressBar.progressProperty().bind(
						copyWorker.progressProperty());
				progressIndicator.progressProperty().unbind();
				progressIndicator.progressProperty().bind(
						copyWorker.progressProperty());
				// append to text area box
				copyWorker.messageProperty().addListener(
						(ObservableValue<? extends String> observable,
								String oldValue, String newValue) ->
							{
								textArea.appendText(newValue + "\n");
							});
				new Thread(copyWorker).start();
			});
		// Cancel button will kill worker and reset.
		cancelButton.setOnAction((ActionEvent event) ->
			{
				startButton.setDisable(false);
				cancelButton.setDisable(true);
				copyWorker.cancel(true);
				// reset
				progressBar.progressProperty().unbind();
				progressBar.setProgress(0);
				progressIndicator.progressProperty().unbind();
				progressIndicator.setProgress(0);
				textArea.appendText("File transfer was cancelled.");
			});
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Task<Boolean> createWorker(final int numFiles) {
		return new Task<Boolean>() {
			@Override
			protected Boolean call() throws Exception {
				for (int i = 0; i < numFiles; i++) {
					long elapsedTime = System.currentTimeMillis();
					copyFile("some file", "some dest file");
					elapsedTime = System.currentTimeMillis() - elapsedTime;
					String status = elapsedTime + " milliseconds";
					// queue up status
					updateMessage(status);
					updateProgress(i + 1, numFiles);
				}
				return true;
			}
		};
	}

	private void copyFile(String src, String dest) throws InterruptedException {
		// simulate a long time
		Random rnd = new Random(System.currentTimeMillis());
		long millis = rnd.nextInt(1000);
		Thread.sleep(millis);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
