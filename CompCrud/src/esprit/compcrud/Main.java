/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.compcrud;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Maya
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
FXMLLoader fxmlLoader=new FXMLLoader (Main.class.getResource ("Main.fxml"));
Parent root =fxmlLoader.load ();
       
        /*Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));*/
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
