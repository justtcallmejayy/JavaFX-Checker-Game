import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;

import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;

public class Board  {
  private double topX;
  private double topY;
  private double width;
  private int numSquares;
  private Color fillColor1;
  private Color fillColor2;

  private GraphicsContext gc;
  
  private ArrayList<Rectangle> grid;


  public Board(double topX,
               double topY,
               double width,
               int numSquares,
               Color fillColor1,
               Color fillColor2) {
      this.topX = topX;
      this.topY = topY;
      this.width = width;
      this.numSquares = numSquares;
      this.fillColor1 = fillColor1;
      this.fillColor2 = fillColor2;
      
      
      this.grid = new ArrayList<Rectangle>();
  }

  
  public int gridSize( ) {
      return grid.size();
  }
  
  
  public double getSquareTopLeftX( int squareNumber ) {
     return grid.get(squareNumber).getTopLeft_x(); 
  }
  
  public double getSquareTopLeftY( int squareNumber ) {
     return grid.get(squareNumber).getTopLeft_y(); 
  }
  
  public double getSquareCenterX( int squareNumber ) {
     return grid.get(squareNumber).getTopLeft_x() + 20.0; 
  }
  
  public double getSquareCenterY( int squareNumber ) {
     return grid.get(squareNumber).getTopLeft_y() + 20.0; 
  }    
  
 
  
  public int getSquareIndex( double x, double y) {
      int result = -1;
      double tx, ty, w, h, dx, dy;
      Rectangle r;
      for (int i=0; i< grid.size(); i++) {
          
          tx = grid.get(i).getTopLeft_x();
          ty = grid.get(i).getTopLeft_y();
          
          w = grid.get(i).getWidth();
          h = grid.get(i).getLength();
          
          dx = Math.abs( x - tx );
          dy = Math.abs( y - ty );
          

          
          if (dx < w && dy < h) {
              
              return i;
          }
      }
      return result;
  }
  
  
  

  public void draw(GraphicsContext gc) {
      Color c;
      int count=0;

      for (int row=0;row < numSquares; row++) {
          for (int col=0; col < numSquares; col++) {
              
              
              if (count % 2 == 0)
                  c=fillColor1;
              else
                  c=fillColor2;
                  
              Rectangle r = new Rectangle(width,width);
              r.setTopLeft_x(topX+(col*width));
              r.setTopLeft_y(topY+(row*width));
              r.setFillColor(c);
       
              r.draw(gc);
              count++;
           
              grid.add(r);
              
          }
          count++;
      }
      
      
      



  }

      
}
