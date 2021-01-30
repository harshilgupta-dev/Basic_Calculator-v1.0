package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;


public class Controller {
    public TextField firstNumberTextField,secondNumberTextField,resultTextField;
    public void calculateAdd(ActionEvent actionEvent) {
        double first = Double.parseDouble(firstNumberTextField.getText());
        double second = Double.parseDouble(secondNumberTextField.getText());
        resultTextField.setText(String.valueOf(first + second));
    }

    public void calculateSubtract(ActionEvent actionEvent) {
        double first = Double.parseDouble(firstNumberTextField.getText());
        double second = Double.parseDouble(secondNumberTextField.getText());
        resultTextField.setText(String.valueOf(first - second));
    }

    public void calculateMultiply(ActionEvent actionEvent) {
        double first = Double.parseDouble(firstNumberTextField.getText());
        double second = Double.parseDouble(secondNumberTextField.getText());
        resultTextField.setText(String.valueOf(first * second));
    }

    public void calculateDivision(ActionEvent actionEvent) {
        double first = Double.parseDouble(firstNumberTextField.getText());
        double second = Double.parseDouble(secondNumberTextField.getText());
        resultTextField.setText(String.valueOf(first / second));
    }
}




