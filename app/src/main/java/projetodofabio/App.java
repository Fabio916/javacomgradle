/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package projetodofabio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
        
    }

	@Override
	public void start(Stage palco) throws Exception {
		// TODO Auto-generated method stub
		palco.setTitle("Eu naoooo seiiii javafx AINDAaa!");
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/telaprincipal.fxml"));
		Parent conteudo = fxmlLoader.load();
		Scene cena = new Scene(conteudo);
		
		palco.setScene(cena);
		palco.show();
	}
}
