
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minaawad
 */ //bruhf
public class Line_Our extends Shape {
   int startX, startY, endX, endY, Border_Thickness, Red, Green, Blue ;

    //constructor for line

    public Line_Our(int startX, int startY, int endX, int endY, int Red, int Green, int Blue, int Border_Thickness) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.Border_Thickness = Border_Thickness;
        this.Red = Red;
        this.Green = Green;
        this.Blue = Blue;
    }
    
    public Line_Our(int startX, int startY, int endX, int endY, int Red, int Green, int Blue, int Border_Thickness, int startjump, int startshow,int starthide) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.Border_Thickness = Border_Thickness;
        this.Red = Red;
        this.Green = Green;
        this.Blue = Blue;
        this.starthide = starthide;
        this.startjump = startjump;
        this.startshow = startshow;
    }

    
    
    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void setBorderthickness(double borderthickness) {
        this.borderthickness = borderthickness;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    //colors are R, G, B 
    //don't know if it should be in String 
    
    Line_Our()
    {
        
    }
    
    public void Line()
    {
        
    }
}
