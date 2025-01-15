import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;


/**
 * This class creates and can display a rectangle on the canvas.
 *
 * @author Dave Slemon
 * @version v101
 */
public class Rectangle {
    //static variable
    public static int nextRectId;

    //instance variables
    private double length;
    private double width;
    private double topLeft_x;
    private double topLeft_y;
    private Color fillColor;
    private Color borderColor;




    /**
     *
     * It is a constructor.
     *
     */
    public Rectangle() {

        this(20, 40);
    }




    /**
     *
     * It is a constructor.
     *
     * @param length  the length.
     * @param width  the width.
     */
    public Rectangle(double length, double width) {

        this(length, width, Color.YELLOW, Color.RED, 50, 100);
    }





    /**
     *
     * It is a constructor.
     *
     * @param length  the length.
     * @param width  the width.
     * @param fillColor  the fill color.
     * @param borderColor  the border color.
     * @param x  the x.
     * @param y  the y.
     */
    public Rectangle(double length, double width, Color fillColor, Color borderColor, double x, double y) {

        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        topLeft_x = x;
        topLeft_y = y;

        nextRectId = nextRectId + 1;
    }


    /**
     *
     * Gets the length
     *
     * @return the length
     */
    public double getLength() {

        return length;
    }


    /**
     *
     * Sets the length
     *
     * @param length  the length.
     */
    public void setLength(double length) {

        this.length = length;
    }


    /**
     *
     * Gets the width
     *
     * @return the width
     */
    public double getWidth() {

        return width;
    }


    /**
     *
     * Sets the width
     *
     * @param width  the width.
     */
    public void setWidth(double width) {

        this.width = width;
    }


    /**
     *
     * Gets the top left_x
     *
     * @return the top left_x
     */
    public double getTopLeft_x() {

        return topLeft_x;
    }


    /**
     *
     * Sets the top left_x
     *
     * @param topLeft_x  the top left_x.
     */
    public void setTopLeft_x(double topLeft_x) {

        this.topLeft_x = topLeft_x;
    }


    /**
     *
     * Gets the top left_y
     *
     * @return the top left_y
     */
    public double getTopLeft_y() {

        return topLeft_y;
    }


    /**
     *
     * Sets the top left_y
     *
     * @param topLeft_y  the top left_y.
     */
    public void setTopLeft_y(double topLeft_y) {

        this.topLeft_y = topLeft_y;
    }


    /**
     *
     * Gets the fill color
     *
     * @return the fill color
     */
    public Color getFillColor() {

        return fillColor;
    }


    /**
     *
     * Sets the fill color
     *
     * @param fillColor  the fill color.
     */
    public void setFillColor(Color fillColor) {

        this.fillColor = fillColor;
    }


    /**
     *
     * Gets the border color
     *
     * @return the border color
     */
    public Color getBorderColor() {

        return borderColor;
    }


    /**
     *
     * Sets the border color
     *
     * @param borderColor  the border color.
     */
    public void setBorderColor(Color borderColor) {

        this.borderColor = borderColor;
    }



    /**
     *
     * Draw
     *
     * @param gc  the gc.
     */
    public void draw(GraphicsContext gc) {

        gc.setFill(fillColor);
        gc.fillRect(topLeft_x, topLeft_y, width, length);


        gc.setStroke(borderColor);
        gc.strokeRect(topLeft_x, topLeft_y, width, length);

    }




    /**
     *
     * To string
     *
     * @return String
     */
    public String toString() {

        return "Rectangle #" + nextRectId + ": " + "length = " + length + "  width = " + width;
    }


}