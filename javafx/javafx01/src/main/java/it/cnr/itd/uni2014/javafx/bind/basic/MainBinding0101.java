package it.cnr.itd.uni2014.javafx.bind.basic;



import java.text.NumberFormat;
import java.util.Formatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;

public class MainBinding0101 extends Application {
	@Override
	public void start(Stage stage) {
		
		TextField t=new TextField();
		
		
		
		
		BorderPane root = new BorderPane();
		Slider slider = new Slider();
		slider.setMax(100);

		t.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getInstance());
		
		
		Scene scene = new Scene(root, 500, 500, Color.BLACK);
		final Rectangle r = new Rectangle(25, 25, 250, 250);
		r.setFill(Color.BLUE);
		root.setTop(t);
		root.setCenter(r);
		root.setBottom(slider);
		r.scaleXProperty().bind(Bindings.divide(slider.valueProperty(), 100));
		r.scaleYProperty().bind(Bindings.divide(slider.valueProperty(), 100));
		r.visibleProperty().bind(
				Bindings.greaterThan(slider.valueProperty(), 50));
		stage.setTitle("JavaFX Scene Graph Demo");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
