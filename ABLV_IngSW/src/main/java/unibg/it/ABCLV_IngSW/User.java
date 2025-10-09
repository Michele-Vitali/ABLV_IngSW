package unibg.it.ABCLV_IngSW;

public class User {
	
	/*
	 *  Username: si comporta da campo univoco (un ID insomma)
	 *  Email e password penso lo sappiamo...
	 */
	private String username; 
	private String email;
	private String password;
	
	/**
	 * @param username
	 * @param email
	 * @param password
	 */
	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Username: %s\nEmail: %s\nPassword: %s".formatted(this.username, this.email, this.password);
	}
	
}
