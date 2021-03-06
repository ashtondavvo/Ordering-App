package main;

import client.Client;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
	
	private Parent root;
	private Scene scene;
	
	public static void main(String args[]){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = FXMLLoader.load(getClass().getResource("/files/App.fxml"));
		scene = new Scene(root, 1280, 720);
		
		primaryStage.setTitle("Beacon App Demo"); // Set the title of the window
		primaryStage.setScene(scene);
		primaryStage.show();
	
		Client client = new Client();
		//client.run();
		
	}
}
