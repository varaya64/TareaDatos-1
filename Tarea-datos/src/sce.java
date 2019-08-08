import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class sce extends Application {
	
	Stage window;
	Scene scene1, scene2 ;
	
	public static void main( String[] args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage) {
		window = primaryStage;
		
		Label label1 = new Label("Welcome to the first scene");
		Button button1 = new Button("Go to scene 2");
		button1.setOnAction(e -> window.setScene(scene2));
		
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		
		Button button2 = new Button("Go to scene 2");
		button2.setOnAction(e -> window.setScene(scene1));
		
		VBox layout2 = new VBox(20);
		layout2.getChildren().addAll(label1, button1);
		scene2 = new Scene(layout2, 600, 300);
		
		window.setScene(scene1);
		window.setTitle("Tittle Here");
		window.show();
		
	}
	
	
	
}