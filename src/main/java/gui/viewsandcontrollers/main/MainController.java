package gui.viewsandcontrollers.main;


import java.io.IOException;

import gui.resources.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    
	private double numero1 = 0;
	private double numero2 = 0;

	@FXML
	private TextField resultado;
	@FXML
	private Label labelError;
	@FXML
	private TextField num1;
	@FXML
	private TextField num2;

	public void initialize() {
		// TODO
	}

	@FXML
	private void suma(ActionEvent event) throws IOException {

		/* Si los números introducido son validos
		 * convertimos los numeros y calculamos
		 * las operaciones usando la clase Calculadora 
		 */
		if (validaConversionNumero()) {
			labelError.setText("");
			Calculadora c = new Calculadora();
			double res = c.suma(numero1, numero2);
			resultado.setText(res + "");
		}

	}

	@FXML
	private void resta(ActionEvent event) throws IOException {

		if (validaConversionNumero()) {
			labelError.setText("");
			Calculadora c = new Calculadora();
			double res = c.resta(numero1, numero2);
			resultado.setText(res + "");
		}

	}

	@FXML
	private void multiplica(ActionEvent event) throws IOException {

		if (validaConversionNumero()) {
			labelError.setText("");
			Calculadora c = new Calculadora();
			double res = c.multiplica(numero1, numero2);
			resultado.setText(res + "");
		}

	}

	@FXML
	private void divide(ActionEvent event) throws IOException {

		if (validaConversionNumero()) {
			labelError.setText("");
			Calculadora c = new Calculadora();
			double res = c.divide(numero1, numero2);
			resultado.setText(res + "");
		}

	}

	/**
	 * Este método convierte los strings obtenidos de los textFiedls y los convierte en double
	 * para poder operar con ellos y controla los errores de conversion evitando que no se
	 * introduzcan los dos numeros que se necesitan para operar con nuestra calculadora.
	 * 
	 * @return
	 * @throws IOException
	 */
	private boolean validaConversionNumero() throws IOException {
		boolean convertido = true;
		// Probando que se introduzca algo en el textField
		if (num1.getText() != null && num2.getText() != null) {
			// Probando que se introduce al menos un numero en el textField
			try {
				//Convertimos el num1 de TextField a Double
				numero1 = Double.parseDouble(num1.getText());
				convertido = true;
			//Si no se convierte lanzamos un mensaje de error
			} catch (NumberFormatException e) {
				labelError.setText("¡Introduce dos números!");
				convertido = false;
			}
			if (convertido) {
				try {
					//Convertimos el num2 de TextField a Double
					numero2 = Double.parseDouble(num2.getText());
					convertido = true;
				//Si no se convierte lanzamos un mensaje de error
				} catch (NumberFormatException e) {
					labelError.setText("¡Introduce dos números!");
					convertido = false;
				}
			}

		//Si no se introduce ningun numero lanzamos un mensaje de error
		} else {
			labelError.setText("Asegurate de introducir dos números y vuelve a intentarlo.");
		}

		return convertido;

	}

}