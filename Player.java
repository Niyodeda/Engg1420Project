/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javafx.scene.shape.*;
import com.sun.javafx.tk.Toolkit;
import java.sql.Time;
import javax.swing.*;
import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.AnimationTimer;
public class Player {
public void CHide(Circle circle,Pane root){
    root.getChildren().remove(circle);
    
} 
public void lHide(Line line,Pane root){
    root.getChildren().remove(line);
    
} 
public void rHide(Rectangle rect,Pane root){
    root.getChildren().remove(rect);
    
}
public void CShow(Circle circle,Pane root){
    root.getChildren().addAll(circle);
    
} 
public void lShow(Line line,Pane root){
    root.getChildren().addAll(line);
    
} 
public void rShow(Rectangle rect,Pane root){
    root.getChildren().addAll(rect);
    
} 
   public void CJump(Circle circle,Pane root,int x,int y){
       circle.setCenterX(circle.getCenterX()+x);
       circle.setCenterY(circle.getCenterY()+y);
} 
public void lJump(Line line,Pane root,int x,int y){
    line.setStartX(line.getStartX()+x);
    line.setStartY(line.getStartY()+y);
    line.setEndX(line.getEndX()+x);
    line.setEndY(line.getEndY()+y);
} 
public void rJump(Rectangle rect,Pane root,int x,int y){
    rect.setX(rect.getX()+x);
    rect.setY(rect.getY()+y);
}  
public void CChange(Circle circle){
        Random r=new Random();
    circle.setFill(Color.color(r.nextInt(), r.nextInt(),r.nextInt()));
} 
public void lChange(Line line){
        Random r=new Random();
    line.setFill(Color.color(r.nextInt(), r.nextInt(),r.nextInt()));
} 
public void rChange(Rectangle rect){
    Random r=new Random();
    rect.setFill(Color.color(r.nextInt(), r.nextInt(),r.nextInt()));
    
    
}
}
