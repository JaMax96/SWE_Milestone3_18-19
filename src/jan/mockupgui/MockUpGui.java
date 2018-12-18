package jan.mockupgui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MockUpGui extends Application{
	public static void main(String[] args) {
        launch(args);
    }
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		
		
		
		
		Scene scene = new Scene(pane, 400,400);
		primaryStage.setTitle("Warehouse");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
