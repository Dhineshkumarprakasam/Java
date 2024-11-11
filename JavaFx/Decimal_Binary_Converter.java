import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class app extends Application
{
    public String calculate(int deci) {
        if (deci == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (deci > 0) {
            int remainder = deci % 2;
            binary.append(remainder);
            deci /= 2;
        }
        binary.reverse();
        return binary.toString();
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Decimal to Binary");
        GridPane root = new GridPane();
        root.setPadding(new Insets(10,10,10,10));
        root.setVgap(20);
        root.setHgap(20);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setHeight(250);
        primaryStage.setWidth(250);
        primaryStage.setResizable(false);

        Button b1 = new Button("Click Me");
        root.add(b1,0,1);
        GridPane.setHalignment(b1, HPos.CENTER);

        TextField tf1 = new TextField();
        root.add(tf1,0,0);

        Label l1 = new Label();
        root.add(l1,0,2);

        b1.setOnAction(e->
        {
            String data = tf1.getText();
            String ans = calculate(Integer.parseInt(data.trim()));

            l1.setText("Ans : "+ans);
        });
        
        primaryStage.show();
    }
    public static void main(String args[])
    {
        launch(args);
    }

}
