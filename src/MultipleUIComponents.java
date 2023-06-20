import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MultipleUIComponents extends Application {

    FlowPane flowPane;
    BorderPane borderPane;
    GridPane gridPane;
    HBox hbox1, hbox2;
    VBox mainLayout, vbox1, vbox2;
    StackPane stackPane;
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    Label nameLabel, titleLabel, ageLabel, descriptionLabel, flowPaneLabel, gridPaneLabel, borderPaneLabel, stackPaneLabel, vboxLabel, hboxLabel;
    TextField nameTextField, titleTextField, ageTextField, descriptionTextField;
    Rectangle rectangle;
    Scene scene;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        borderPaneLabel = new Label("BorderPane for 2 Buttons");
        borderPaneLabel.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 12));
        borderPane = new BorderPane();
        hbox1 = new HBox();
        hbox1.setSpacing(10);
        hbox1.setPadding(new Insets(10));
        btn1 = new Button("Button 1");
        btn2 = new Button("Button 2");
        hbox1.getChildren().addAll(borderPaneLabel, btn1, btn2);
        borderPane.setTop(hbox1);
        
        gridPaneLabel = new Label("GridPane for Name and Age");
        gridPaneLabel.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 12));
        gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        nameLabel = new Label("Name: ");
        nameLabel.setFont(Font.font("Arial", 18));
        nameTextField = new TextField();
        nameTextField.setPromptText("NAME");
        ageLabel = new Label("Age:");
        ageLabel.setFont(Font.font("Arial", 18));
        ageTextField = new TextField("");
        ageTextField.setPromptText("AGE");
        gridPane.add(gridPaneLabel, 0,0);
        gridPane.add(nameLabel,0,1);
        gridPane.add(nameTextField,1,1);
        gridPane.add(ageLabel,0,2);
        gridPane.add(ageTextField,1,2);

        vboxLabel = new Label("VBox for Label and TextField");
        vboxLabel.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 12));
        vbox1 = new VBox();
        vbox1.setSpacing(10);
        vbox1.setPadding(new Insets(10));
        titleLabel = new Label("Title: ");
        titleLabel.setFont(Font.font("Arial", 18));
        titleTextField = new TextField();
        titleTextField.setPromptText("Title");
        vbox1.getChildren().addAll(vboxLabel, titleLabel,titleTextField);

        hboxLabel = new Label("HBox for 2 Buttons");
        hboxLabel.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 12));
        hbox2 = new HBox();
        hbox2.setSpacing(10);
        hbox2.setPadding(new Insets(10));
        btn3 = new Button("Button 3");
        btn4 = new Button("Button 4");
        hbox2.getChildren().addAll(hboxLabel, btn3, btn4);

        vbox2 = new VBox();
        vbox2.setSpacing(10);
        vbox2.setPadding(new Insets(10));

        vbox2.getChildren().addAll(gridPane, vbox1, hbox2);

        flowPaneLabel = new Label("FlowPane for Description and 2 Buttons");
        flowPaneLabel.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 12));
        flowPaneLabel.setPadding(new Insets(8));
        flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10));
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        descriptionLabel = new Label("Description: ");
        descriptionLabel.setFont(Font.font("Arial", 18));
        descriptionTextField = new TextField("");
        descriptionTextField.setPromptText("Description");
        btn5 = new Button("Button 5");
        btn6 = new Button("Button 6");
        flowPane.getChildren().addAll(flowPaneLabel, descriptionLabel, descriptionTextField, btn5, btn6);

        stackPaneLabel = new Label("StackPane for the Rectangle");
        stackPaneLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 12));
        stackPaneLabel.setPadding(new Insets(8));
        stackPane = new StackPane();
        stackPane.setPadding(new Insets(10));
        rectangle = new Rectangle(200,70, Color.CHOCOLATE);
        stackPane.getChildren().addAll(rectangle, stackPaneLabel);

        mainLayout = new VBox();
        mainLayout.setSpacing(10);
        mainLayout.setPadding(new Insets(10));
        mainLayout.getChildren().addAll(borderPane, vbox2,flowPane,stackPane);

        scene = new Scene(mainLayout, 400, 700);
        primaryStage.setTitle("Mutltiple UI Components");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
