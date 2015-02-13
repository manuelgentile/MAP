package it.cnr.itd.uni2014.javafx.workertask;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WorkerAndTaskExample extends Application {
	private Model model;
	private View view;

	public static void main(String[] args) {
		launch(args);
	}

	

	@Override
	public void start(Stage stage) throws Exception {
		model = new Model();
		view = new View(model);
		stage.setTitle("Worker and Task Example");
		stage.setScene(new Scene(view));
		stage.show();
	}

	

}