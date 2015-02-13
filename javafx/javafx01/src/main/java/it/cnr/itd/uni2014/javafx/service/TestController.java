package it.cnr.itd.uni2014.javafx.service;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.concurrent.Service;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class TestController implements Initializable {
	@FXML
	private Label exception;

	@FXML
	private Button startButton;

	@FXML
	private Button exceptionButton;

	@FXML
	private Label title;

	@FXML
	private Label message;

	@FXML
	private Label totalWork;

	@FXML
	private Label running;

	@FXML
	private Button cancelButton;

	@FXML
	private ProgressBar progressBar;

	@FXML
	private Label progress;

	@FXML
	private Label state;

	@FXML
	private Label value;

	@FXML
	private Label workDone;

	@FXML
	private TextField numberOfItems;

	public Model model;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		model = new Model();
		final ReadOnlyObjectProperty<Worker.State> stateProperty = model.worker
				.stateProperty();
		progressBar.progressProperty().bind(model.worker.progressProperty());
		title.textProperty().bind(model.worker.titleProperty());
		message.textProperty().bind(model.worker.messageProperty());
		running.textProperty().bind(
				Bindings.format("%s", model.worker.runningProperty()));
		state.textProperty().bind(Bindings.format("%s", stateProperty));
		totalWork.textProperty().bind(
				model.worker.totalWorkProperty().asString());
		workDone.textProperty()
				.bind(model.worker.workDoneProperty().asString());
		progress.textProperty().bind(
				Bindings.format("%5.2f%%", model.worker.progressProperty()
						.multiply(100)));
		value.textProperty().bind(model.worker.valueProperty());
		exception.textProperty().bind(Bindings.createStringBinding(() ->
			{
				final Throwable exception = model.worker.getException();
				if (exception == null)
					return "";
				return exception.getMessage();
			}, model.worker.exceptionProperty()));
		model.numberOfItems.bind(Bindings.createIntegerBinding(() ->
			{
				final String text = numberOfItems.getText();
				int n = 250;
				try {
					n = Integer.parseInt(text);
				} catch (NumberFormatException e) {
				}
				return n;
			}, numberOfItems.textProperty()));
		startButton.disableProperty().bind(
				stateProperty.isEqualTo(Worker.State.RUNNING));
		cancelButton.disableProperty().bind(
				stateProperty.isNotEqualTo(Worker.State.RUNNING));
		exceptionButton.disableProperty().bind(
				stateProperty.isNotEqualTo(Worker.State.RUNNING));

		startButton.setOnAction(actionEvent ->
			{
				model.shouldThrow.getAndSet(false);
				((Service) model.worker).restart();
			});
		cancelButton.setOnAction(actionEvent ->
			{
				model.worker.cancel();
			});
		exceptionButton.setOnAction(actionEvent ->
			{
				model.shouldThrow.getAndSet(true);
			});
	}

}
