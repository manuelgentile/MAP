package it.cnr.itd.uni2014.javafx.service;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ServiceExampleFXML extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));

		stage.setTitle("Service Example");
		stage.setScene(new Scene(root));
		stage.show();
	}

}