import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import	javafx.scene.image.Image;
import javafx.scene.image.*;
import java.io.FileInputStream;

public class JavafxImage extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		FileInputStream fis= new FileInputStream("path");
		/** In the valve of path put path of image **/
		Image image =new Image(fis);
		ImageView iv=new ImageView(image);
		iv.setFitHeight(500);
		iv.setFitWidth(500);
		iv.setPreserveRatio(true);
		Group root=new Group(iv);
		Scene scene=new Scene(root);
		primaryStage.setTitle("JavaFx image loading ");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
}
