package kr.co.leehana.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

/**
 * @author Hana Lee
 * @since 2016-01-13 21:48
 */
public class LoginController {

	@FXML
	private PasswordField passwordField;

	@FXML
	private Text actionTarget;

	public void handleLoginButtonAction(ActionEvent actionEvent) {
		actionTarget.setText(passwordField.getText());
	}
}
