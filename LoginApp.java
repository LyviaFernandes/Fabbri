package aula10;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {
	@Override
	public void start(Stage estagio) throws Exception {
		AnchorPane painel = new AnchorPane();
		painel.setPrefSize(400, 300);
		TextField txLogin = new TextField();
		txLogin.setText("Digite aqui seu login");
		PasswordField txSenha = new PasswordField();
		txSenha.setPromptText("Digite aqui sua senha");
		
		Button btEntrar = new Button("Entrar");
		Button btSair = new Button("Sair");
		
		painel.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
		//nosso primeiro CSS
		painel.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, red 0%, purple 100%);");
		
		Scene cena = new Scene(painel);
		estagio.setTitle("Java com Fx");
		estagio.setScene(cena);
		estagio.show();
		
		txLogin.setLayoutX((painel.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txSenha.setLayoutX((painel.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(100);
		btEntrar.setLayoutX((painel.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((painel.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);
	}
	public static void main(String[] args) {
		launch();
	}

}
