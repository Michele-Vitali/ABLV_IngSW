package unibg.it.ABCLV_IngSW;

import static org.junit.jupiter.api.Assertions.assertEquals;

import unibg.it.ABCLV_IngSW.User;

public class UserTest {

	public void attributestest() {
		User user = new User("pippo14", "filippo.rossi@gmail.com", "IoSon0P1pp0$");
		String res = user.toString();
		String correct = "Username: %s\\nEmail: %s\\nPassword: %s".formatted(user.getUsername(), user.getEmail(), user.getPassword());
		assertEquals(res, correct, "Le stringhe devono essere uguali...");
	}
	
}
