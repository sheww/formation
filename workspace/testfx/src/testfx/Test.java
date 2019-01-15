package testfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Test extends Application{
	public static void main(String[] args) {
        Application.launch(Test.class, args);

	}
	    private void init(Stage primaryStage) {
	        Group root = new Group();
	        primaryStage.setResizable(false);
	        primaryStage.setScene(new Scene(root, 400,100));
	 
	        double y = 15;
	        final double SPACING = 15;
	        ProgressBar p1 = new ProgressBar();
	        p1.setLayoutY(y);
	 
	        y += SPACING;
	        ProgressBar p2 = new ProgressBar();
	        p2.setPrefWidth(350);
	        p2.setLayoutY(y);
	 
	        y += SPACING;
	        ProgressBar p3 = new ProgressBar();
	        p3.setPrefWidth(500);
	        p3.setLayoutY(y);
	
	 
	   
	        root.getChildren().addAll(p1,p2,p3);
	    }
	 
	    public double getSampleWidth() { return 400; }
	 
	    public double getSampleHeight() { return 100; }
	 
	    @Override public void start(Stage primaryStage) throws Exception {
	        init(primaryStage);
	        primaryStage.show();
	    }
}
