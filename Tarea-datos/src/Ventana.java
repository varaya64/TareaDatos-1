import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Scanner;

public class Ventana extends Application {
	
	Stage stage;
	Scene scene;
	ArrayList<String> archivo = new ArrayList<String> ();
	
	
	public static void main (String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception { //es una ventana
		
		stage = primaryStage;
		stage.setTitle("Lector de Archivos");
		Button subirAr = new Button("Subir");
		subirAr.setOnAction(e -> leerArchivo());
		StackPane contenedor = new StackPane();
		contenedor.getChildren().add(subirAr);
		Scene informacion = new Scene(contenedor, 1000, 700);
		stage.setScene(informacion);
		stage.show();
		
	}
	
	public void leerArchivo(){
		String nombreArchivo = "archivo.csv";
		File abrir = new File(nombreArchivo);
		mat();
		
		try {
			Scanner leer = new Scanner(abrir);
			
			while(leer.hasNext()) {
				String linea = leer.next();
				this.archivo.add(linea);
				System.out.println(linea);
			}

		}
		
		catch(FileNotFoundException i) {
			System.out.println("Archivo no encontrado");
	
		}

	}
	
	public void mat() {
		System.out.println("El botón funciona");

	
	}
}
