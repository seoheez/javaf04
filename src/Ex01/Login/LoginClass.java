package Ex01.Login;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginClass {
//	@FXML TextField fxId; //여기에서는 쓸 수 없음. 어
						  //어노테이션을 쓸 수 있는 위치는 fxml에 설정된 클래스에서만 쓸 수 있다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void loginCheck(Parent root) {
		TextField t = (TextField)root.lookup("#fxId");
		PasswordField p = (PasswordField)root.lookup("#fxPwd");
		System.out.println("root 아이디: " + t.getText() + p.getText());
	}
	public void loginCheck(TextField id, PasswordField pwd) {
		System.out.println("로그인 체크 기능입니다." + id.getText() + pwd.getText());
	}

}
