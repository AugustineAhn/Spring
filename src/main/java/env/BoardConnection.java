package env;

public class BoardConnection {
	
	private String user;
	private String pass;
	private String driver;
	private String url;
	public void setUser(String user) {
		this.user = user;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public String getPass() {
		return pass;
	}
	public String getDriver() {
		return driver;
	}
	public String getUrl() {
		return url;
	}
}
