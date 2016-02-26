package jz.jzfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Hallo");
		StackPane root = new StackPane();
		root.setId("root");
		Button b = new Button();
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				System.out.println("hallo");
			}
			
		});
		b.setText("Hallo");
		b.getStyleClass().add("hallo");
		Scene s = new Scene(root, 500, 500);
		s.getStylesheets().add(Test.class.getResource("test.css").toExternalForm());
		root.getChildren().add(b);
		stage.setScene(s);
		stage.show();
	}
	
}
