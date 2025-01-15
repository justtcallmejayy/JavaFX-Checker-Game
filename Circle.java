

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class is the same as Circle, but properly encapsulated.
 *
 * @author Sam Scott, Dave Slemon
 *
 */
public class Circle {
    /**
     * The radius of  the circle
     */
    private double radius;


    /**
     * The fill Color of the circle
     */
    private Color fillColor;



    /**
     * The border Color of the circle
     */
    private Color borderColor;



    /**
     * The x-coordinate of the center
     */
    private double x;



    /**
     * The y-coordinate of the center
     */
    private double y;




    /**
     * Default constructor:  Creates a Blue circle of radius 100 @ (100,100)
     */
    public Circle() {
        this(100,Color.BLACK, Color.BLUE,100,100);
    }





    /**
     * Constructor: Create a circle given a radius and center position (x, y)
     * @param radius the initial radius
     * @param x the circle's center x value
     * @param y the circle's center y value
     */
    public Circle(double radius, double x, double y) {
        this(radius,Color.BLACK, Color.BLUE,x,y);
    }





    /**
     * Constructor: Create a circle given a radius, center (x,y) and fill colour
     *
     * @param radius the initial radius
     * @param x the circle's center x value
     * @param y the circle's center y value
     * @param fillColor the colour filling the circle
     */
    public Circle(double radius, Color fillColor, double x, double y) {
        this(radius,fillColor, fillColor,x,y);
    }





    /**
     ** Constructor: Create a circle given a radius, center (x,y) and border and fill colour
     * @param radius the initial radius
     * @param x the circle's center x value
     * @param y the circle's center y value
     * @param borderColor the bprder colour of the circle
     * @param fillColor the colour filling the circle
     */
    public Circle(double radius, Color borderColor, Color fillColor, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }





    /**
     * Computes the circle's area.
     *
     * @return The area of the circle.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }




    /**
     * Test whether two circles are equal.
     *
     * @param other The other circle.
     * @return True if the location and radius are the same.
     */
    public boolean equals(Circle other) {
        return (this.x == other.x && this.y == other.y && this.radius == other.radius);
    }





    /**
     * Draws the circle on a GraphicsContext object.
     *
     * @param gc The GraphicsContext to draw on.
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(fillColor);
        gc.setStroke(borderColor);
        gc.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        gc.strokeOval(x - radius, y - radius, radius * 2, radius * 2);
    }





    /**
     * Returns the radius of the circle
     *
     * @return The circle's radius.
     */
    public double getRadius() {
        return radius;
    }





    /**
     * Allows for changing the current radius to a new radius
     *
     * @param radius The new radius for the circle.
     */
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("ERROR! Radius must be greater than 0. Not changed.");
        } else {
            this.radius = radius;
        }
    }





    /**
     * Allows for a change in the circle's center position.
     *
     * @param x The x coord of the circle's center
     * @param y The y coord of the circle's center
     */
    public void setCenter(double x, double y) {
        if (x <= 0 || y <= 0) {
            System.out.println("ERROR! x & y must be greater than 0. Not changed.");
        } else {
            this.x = x;
            this.y = y;
        }
    }




    /** Allows for changing the border and fill colours of the circle
     *
     * @param borderColor The circle's border colour
     * @param fillColor The circle's fill colour
     */
    public void setColor(Color borderColor, Color fillColor) {
        this.borderColor = borderColor;
        this.fillColor   = fillColor;
    }


    /**
     * Determines whether or not this circle is inside another one. This circle
     * is considered "inside" the other if its center is inside the other
     * circle.
     *
     * @param other The other Circle
     * @return True if the this circle is "inside" the other one.
     */
    public boolean isInside(Circle other) {
        if (distance(other) < other.radius) {
            return true;
        }
        return false;
    }





    /**
     * Compute the distance from the the center of another circle to the center
     * of the circle.
     *
     * @param other The other circle.
     * @return Distance between the centers of the two circles.
     */
    private double distance(Circle other) {
        return Math.sqrt((this.x - other.x) * (this.x - other.x)
                + (this.y - other.y) * (this.y - other.y));
    }





    /**
     * @return A String representation of a Circle4
     */
    @Override
    public String toString() {
        return "Circle: radius " + radius + ", location (" + x + "," + y + ")";
    }



}