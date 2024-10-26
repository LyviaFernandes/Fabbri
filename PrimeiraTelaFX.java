package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public class PrimeiraTelaFX extends Application {
	@Override
	public void start(Stage palco1) throws Exception {	//cria o método start
		Group raiz = new Group();						//Group vai preparar a Scene graph, que vai agrupar os nós da aplicação
		Scene cena = new Scene(raiz, 600, 300);			// Criar objeto cena que recebe raiz e tamanho definido
		cena.setFill(Color.DARKRED); 					//Definir a cor do objeto cena
		palco1.setTitle("Exemplo com JavaFX");			//Definir o titulo da janela
		palco1.setScene(cena); 							//Definir a cena a ser exibida
		palco1.show(); 									//Exibir a janela
	}
	public static void main(String[] args) {
		launch();

	}

}
