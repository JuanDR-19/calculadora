package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class CalculadoraController implements Initializable {
	
	@FXML 
	private TextField Num1;
	@FXML 
	private TextField Num2;
	@FXML 
	private TextField Respuesta;
	
	@FXML
	public void calcular() {
		
			int numero1=Integer.parseInt(Num1.getText());
			int numero2=Integer.parseInt(Num2.getText());
			Respuesta.setText(""+(numero1+numero2));
			
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
