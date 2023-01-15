/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
 
public class CCircle extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }
 
    @Override
    public void start(Stage stage)
    {
        // Create the Circle
        Circle circle = new Circle(10, 10, 40, Color.BURLYWOOD);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2.0);
 
        // Create the HBox
        HBox root = new HBox();
        // Add the children to the HBox
        root.getChildren().addAll(circle);
 
        // Set Spacing of the HBox
        root.setSpacing(10);
        // Set Style for the HBox
        root.setStyle
        (
            "-fx-padding: 10;" +
            "-fx-border-style: solid inside;" +
            "-fx-border-width: 2;" +
            "-fx-border-insets: 5;" +
            "-fx-border-radius: 5;" +
            "-fx-border-color: blue;"
        );
         
        // Create the Scene
        Scene scene = new Scene(root, 600, 600);
        // Add the Scene to the Stage
        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("A JavaFX Circle Example");
        // Display the Stage
        stage.show();
        
    }
}