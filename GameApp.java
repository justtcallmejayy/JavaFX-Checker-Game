import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.canvas.GraphicsContext;

/**
 * Use this template to create Apps with Graphical User Interfaces.
 *
 * @author JAY CHOKSI
 */
public class GameApp extends Application {

    // TODO: Instance Variables for View Components and Model
    private Board board;


    private GraphicsContext gc;

    private TextField rowBox;
    private TextField colBox;
    private Button removeButton;
    private Label footer;

    // TODO: Private Event Handlers and Helper Methods
    public void mousePressed(MouseEvent me) {
        int i = board.getSquareIndex(me.getX(), me.getY());


        double x = board.getSquareCenterX(i);
        double y = board.getSquareCenterY(i);

        //System.out.println("mrow="+board.getRow(i) + " ccol=" + board.getCol(i) );

        Green g = new Green(x, y, Color.BLUE, Color.LIGHTGREEN);
        g.setSquareNumber(i);
        // g.setRowCol(board.getRow(i), board.getCol(i));

        g.draw(gc);


    }

    public void refresh() {

        board.draw(gc);


    }

    public void removeHandler(ActionEvent e) {

        int row = Integer.parseInt(rowBox.getText());
        int col = Integer.parseInt(colBox.getText());


        refresh();
    }


    /**
     * This is where you create your components and the model and add event
     * handlers.
     *
     * @param stage The main stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 500); // set the size here
        stage.setTitle("Grid Game"); // set the window title here
        stage.setScene(scene);
        // TODO: Add your GUI-building code here

        // 1. Create the model 75,45
        board = new Board(75, 45, 40, 8, Color.web("lightgray"), Color.web("lightgray"));


        // 2. Create the GUI components
        Canvas canvas = new Canvas(500, 400);
        rowBox = new TextField("0");
        colBox = new TextField("0");
        removeButton = new Button("Remove");
        footer = new Label();

        //gc = new GraphicsContext();
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0, 0, 500, 400);

        board.draw(gc);

        // 3. Add components to the root
        root.getChildren().addAll(canvas, rowBox, colBox, removeButton, footer);
        // 4. Configure the components (colors, fonts, size, location)
        rowBox.relocate(10, 450);
        colBox.relocate(180, 450);
        removeButton.relocate(350, 450);
        footer.relocate(10, 480);
        // 5. Add Event Handlers and do final setup
        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, this::mousePressed);
        removeButton.setOnAction(this::removeHandler);

        // 6. Show the stage
        stage.show();
    }

    /**
     * Make no changes here.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}