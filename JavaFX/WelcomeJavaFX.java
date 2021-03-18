
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.paint.Color;

public class WelcomeJavaFX extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	public  void start(Stage primaryStage) throws Exception {
		Group root=new Group();
		Scene scene=new Scene(root);
		primaryStage.setTitle("welcome");
		scene.setFill(Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
