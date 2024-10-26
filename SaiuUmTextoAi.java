package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SaiuUmTextoAi extends Application {
	@Override
	public void start(Stage palco3) {
		
		Text texto = new Text();		//criando um objeto texto
		texto.setFont(new Font(45));	//deifinindo a fonte do texto
		texto.setX(150);				//ajustando a posição do texto
		texto.setY(150);		
		texto.setText("JavaFx no Senai");
		
		Group raiz = new Group();
		ObservableList lista = raiz.getChildren();
		lista.add(texto);
		
		Scene cena = new Scene(raiz, 600, 300);
		palco3.setTitle("Isso ai");
		palco3.setScene(cena);
		palco3.show();
		
	}

	public static void main(String[] args) {
		launch();
	}

}
