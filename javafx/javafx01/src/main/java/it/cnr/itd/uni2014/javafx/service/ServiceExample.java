package it.cnr.itd.uni2014.javafx.service;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ServiceExample extends Application {
	private Model model;
	private View view;

	public static void main(String[] args) {
		launch(args);
	}

	public ServiceExample() {
		model = new Model();
	}

	@Override
	public void start(Stage stage) throws Exception {
		view = new View(model);

		stage.setTitle("Service Example");
		stage.setScene(new Scene(view));
		stage.show();
	}

}