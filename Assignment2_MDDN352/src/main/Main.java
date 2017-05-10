package main;

import files.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import server.Server;

public class Main extends Application{
	
	
	private Parent root;
	private Scene scene;
	private Controller controller;
	private static Server server;
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// load the GUI in from the FXML file
		root = FXMLLoader.load(getClass().getResource("/files/Server.fxml"));
		scene = new Scene(root, 1280, 720);
		
		primaryStage.setTitle("Beacon App Server"); // Set the title of the window
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void startServer() {
		server = new Server();	
	}

	public static void main(String[] args) {
        launch(args);
      
    }

	public static void serverListen() {
		//server.readConnection();
		server.readConnection();
	}

	
	
}
