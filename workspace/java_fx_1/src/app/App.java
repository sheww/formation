package app;

import metier.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	   public void start(final Stage primaryStage)
	   {
		  // On instancie une pile de string de taille 10
	    final Pile<String> pile = new Pile<String>(10);
	    final TextField tf = new TextField ();
	    final Label lbl = new Label();
	    final ListView<String> listView = new ListView<String>();
	    final ObservableList test = FXCollections.observableArrayList();
	    Button btnEmpiler = new Button();
	    Button btnDepiler = new Button();
	    primaryStage.setTitle("Fenetre PileFX");
	    tf.setLayoutX(70);
	    tf.setLayoutY(10);
	    btnEmpiler.setLayoutX(70);
	    btnEmpiler.setLayoutY(50);
	    btnEmpiler.setText("Empiler");
	    btnEmpiler.setOnAction(new EventHandler<ActionEvent>() {
	    	// On ajoute l'action en cas de clic sur le bouton
	     public void handle(ActionEvent event) {	      
	        try {
				pile.empiler(tf.getText());
				test.addAll(pile.getL().toString());
			    listView.setItems(test);

			} catch (PilePleineException e) {
				// On affiche l'excpetion dans une petite fenetre
				final Stage dialog = new Stage();
	            dialog.initModality(Modality.APPLICATION_MODAL);
	            dialog.initOwner(primaryStage);
	            VBox dialogVbox = new VBox(20);
	            dialogVbox.getChildren().add(new Text(e.toString()));
	            Scene dialogScene = new Scene(dialogVbox, 300, 200);
	            dialog.setScene(dialogScene);
	            dialog.show();
			}
	     }
	   });
	   
	    lbl.setLayoutX(70);
	    lbl.setLayoutY(150);
	    btnDepiler.setLayoutX(70);
	    btnDepiler.setLayoutY(100);
	    btnDepiler.setText("Dépiler");
	    btnDepiler.setOnAction(new EventHandler<ActionEvent>() {
	    // On ajoute l'action pour le dépilement 
	     public void handle(ActionEvent event) {
	       try {
	    	   lbl.setText(pile.depiler());
	    	   test.addAll(pile.getL().toString());
	    	   listView.setItems(test);
	       } catch (PileVideException e) 
	       {
	    	   //On affiche l'exception dans une petite fenetre
	    	   final Stage dialog = new Stage();
	           dialog.initModality(Modality.APPLICATION_MODAL);
	           dialog.initOwner(primaryStage);
	           VBox dialogVbox = new VBox(20);
	           dialogVbox.getChildren().add(new Text(e.toString()));
	           Scene dialogScene = new Scene(dialogVbox, 300, 200);
	           dialog.setScene(dialogScene);
	           dialog.show();
	       }
	     }
	   });
	    // On ajoute les modules dans la fenetre et on l'affiche
	    Group root = new Group();
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.setTranslateY(300);
        listView.setPrefWidth(500);
	    root.getChildren().add(listView);
	    root.getChildren().add(btnEmpiler);
	    root.getChildren().add(btnDepiler);
	    root.getChildren().add(lbl);
	    root.getChildren().add(tf);
	    // On declare la taille de la fenetre
	    primaryStage.setScene(new Scene(root, 300, 250));
	    primaryStage.show();
	   }

	/**
	 * @param args the command line arguments
	 */
	// On lance la fonction launch
	public static void main(String[] args) {
		launch(args);
	}
}