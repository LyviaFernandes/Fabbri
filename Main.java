package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage palco) {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		Label l = new Label("Olá, JavaFx" + javafxVersion + ", rodando no Java" + javaVersion + ".");
		Scene cena = new Scene(new StackPane(l), 640, 480);
		palco.setScene(cena);
		palco.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
