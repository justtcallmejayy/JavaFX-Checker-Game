import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Write a description of class Green here.
 *
 * @author Jay Choksi
 * @version v101
 */
public class Green {
    private double x;
    private double y;
    private Color strokeColor;
    private Color fillColor;

    private boolean isSelected;

    private int matrixRow;
    private int matrixCol;

    private int squareNumber;

    public Green(double x, double y, Color stroke, Color fill) {
        this.x = x;
        this.y = y;
        strokeColor = stroke;
        fillColor = fill;
        isSelected = false;


        matrixRow = 0;
        matrixCol = 0;
        squareNumber = 0;
    }




    public void setSquareNumber(int num) {
        squareNumber = num;
    }

    public void setRowCol(int row, int col) {
        matrixRow = row;
        matrixCol = col;
    }

    public int getRow() {
        return matrixRow;
    }
    public int getCol() {
        return matrixCol;
    }

    public void draw(GraphicsContext gc) {

        Circle c = new Circle(15, strokeColor, fillColor, x, y);
        c.draw(gc);

    }



    public String toString() {
        String str = "";

        str += "S";
        str += String.format("%d - ", squareNumber);
        str += String.format("x: %f  y: %f  ", x, y);

        str += String.format("row: %d  col: %d  %d", matrixRow, matrixCol);

        return str;
    }
}