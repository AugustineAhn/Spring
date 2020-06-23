package env;

public class UserConnection {

	private	String mainUserId;
	private	String mainUserPw;
	private	String subUserId;
	private	String subUserPw;
	public void setMainUserId(String mainUserId) {
		this.mainUserId = mainUserId;
	}
	public void setMainUserPw(String mainUserPw) {
		this.mainUserPw = mainUserPw;
	}
	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
	}
	public void setSubUserPw(String subUserPw) {
		this.subUserPw = subUserPw;
	}
	public String getMainUserId() {
		return mainUserId;
	}
	public String getMainUserPw() {
		return mainUserPw;
	}
	public String getSubUserId() {
		return subUserId;
	}
	public String getSubUserPw() {
		return subUserPw;
	}
	
}
