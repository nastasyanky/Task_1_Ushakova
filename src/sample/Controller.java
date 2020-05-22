package sample;


import Procent.Proc;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label label_0;
    public Label label_1;
    public Label label_2;
    public Label label_3;
    public Button button_1;
    public Button button_2;
    public Button button_3;
    public TextField tf_1;
    public Button r_1;
    public Button r_2;
    public Button r_3;

    int pr1=10;
    int pr2=25;
    int pr3=65;


    public void r_1(ActionEvent actionEvent) {
        double i = Double.parseDouble(tf_1.getText());
        Proc p= new Proc();
        p. Prox(i,pr1);
        label_1.setText(String.valueOf(p.getS()));

    }
    public void r_2(ActionEvent actionEvent) {
        double i = Double.parseDouble(tf_1.getText());
        Proc p= new Proc();
        p. Prox(i,pr2);
        label_2.setText(String.valueOf(p.getS()));

    }
    public void r_3(ActionEvent actionEvent) {
        double i = Double.parseDouble(tf_1.getText());
        Proc p= new Proc();
        p. Prox(i,pr3);
        label_3.setText(String.valueOf(p.getS()));

    }




}
