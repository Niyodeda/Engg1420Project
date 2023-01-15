
import com.sun.javafx.tk.Toolkit;
import java.sql.Time;
import javax.swing.*;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.AnimationTimer;


//public class FXapplication extends JPanel {
//    
//Time t = new Timer(5, this);
//    
//    
//
//
//}
public class FXapplication extends Application {
public Rectangle[] rectt;
public Circle[] circle;
public Line[] line;
FileReader m = new FileReader();
//Player P = new Player();
Rectangle r;
Pane root;

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {
         root = new Pane();
        Timeline timer = new Timeline();
         // makes new filereader class//
        m.readfile(); // reads file //
        

        ///Creating Java Rectangle Array
        System.out.println("The size of the arraylist of rectangle is: " + m.rectangle.size()); //sizes of the arraylist of rectangle
        rectt = new Rectangle[m.rectangle.size()]; //creates an array of java.rect whiich
        for (int i = 0; i < m.rectangle.size(); i++) { //creating the rectangles in the java rectangle
            rectt[i] = new Rectangle(m.rectangle.get(i).x, m.rectangle.get(i).y, m.rectangle.get(i).width, m.rectangle.get(i).length);
            System.out.println("Values of rectangle " + i + "in the java rectangle array: X" + m.rectangle.get(i).x + " Y" + m.rectangle.get(i).y + " width" + m.rectangle.get(i).width + " length" + m.rectangle.get(i).length);
            
            }

        //Creating Java Circle Array
       System.out.println("The size of the arraylist of rectangle is: " + m.rectangle.size());
       circle = new Circle[m.circle.size()];
        for (int i = 0; i < m.circle.size(); i++) { //creating the rectangles in the java rectangle
            circle[i] = new Circle(m.circle.get(i).x, m.circle.get(i).y, m.circle.get(i).r,Color.rgb(m.circle.get(i).red,m.circle.get(i).green,m.circle.get(i).blue));
        }

        //Creating Java Line Array
        System.out.println("The size of the arraylist of rectangle is: " + m.line.size());
        line = new Line[m.line.size()];
        for (int i = 0; i < m.line.size(); i++){
            line[i] = new Line(m.line.get(i).startX, m.line.get(i).startY, m.line.get(i).endX, m.line.get(i).endY);
        }

        r = new Rectangle(40, 200, 60, 60);
        r.setFill(Color.LIGHTSALMON);

        

//       timer.setCycleCount(4); //number of cycles
//       timer.setAutoReverse(true);
//            KeyValue kv = new KeyValue(rectt[0].translateXProperty(), 200);
//            KeyValue kh = new KeyValue(rectt[0].translateYProperty(), -40);
//           KeyFrame kfx = new KeyFrame(Duration.millis(1000), kv);
//            KeyFrame kfy = new KeyFrame(Duration.millis(1000), kh);
//           timer.getKeyFrames().addAll(kfx, kfy);
       //root.getChildren().add(rectt[0]);
       //root.getChildren().add(r);
           
//            timer.play();
            
       MyTimer t = new MyTimer();
       t.start();

        

        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Timeline");
        stage.setScene(scene);
        stage.show();
    }

    private class MyTimer extends AnimationTimer {
        
        int frame =0; // Current frame
        int frames = m.f; // Max frames
        int FPS = m.FPS;// FPS
        Effects E = new Effects();

        public void handle(long now){
            frame++;
            
            System.out.println("frame number: "+frame);
            if(frame == m.circle.get(0).startshow){
                root.getChildren().add(circle[0]);   
            };
            if(frame == m.rectangle.get(0).starthide){
                root.getChildren().remove(circle[0]);
            };
            
            if(frame == m.rectangle.get(0).startshow){
                root.getChildren().add(rectt[0]);   
            };
            if(frame == m.rectangle.get(0).startjump){
                rectt[0].setTranslateY(E.yJump());
                rectt[0].setTranslateX(E.xJump());
                
            };
            
         
            
            if(frame > frames) {
                stop();
                System.exit(0);
            }
            try {
                Thread.sleep(950 / FPS);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
