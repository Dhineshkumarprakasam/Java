import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.text.Font;


public class app extends Application
{
    public static void main(String args[])
    {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);

        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10,10,10,10));
        root.setAlignment(Pos.CENTER);

        Label l1 = new Label("Welcome");
        l1.setFont(Font.font("Arial", FontWeight.BOLD,22));

        Label l2 = new Label("User Name : ");
        l2.setFont(Font.font("Calibri",16));

        Label l3 = new Label("Password  : ");
        l3.setFont(Font.font("Calibri",16));


        TextField t1 = new TextField();
        TextField t2 = new TextField();

        Button b1 = new Button("Sign In");
        b1.setOnAction(event ->
                {
                    System.out.println(t1.getText());
                    System.out.println(t2.getText());
                }
                );
        GridPane.setHalignment(b1, HPos.RIGHT);

        root.add(l1,1,1);

        root.add(l2,1,2);
        root.add(t1,2,2);

        root.add(l3,1,3);
        root.add(t2,2,3);

        root.add(b1,2,4);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
