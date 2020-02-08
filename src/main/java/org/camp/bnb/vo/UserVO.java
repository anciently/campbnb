package org.camp.bnb.vo;

public class UserVO {
	
	private Long userId; // TODO sequence
	private String userName;
	
	public UserVO() {}
	
	public UserVO(Long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userName=" + userName + "]";
	}
	
}
