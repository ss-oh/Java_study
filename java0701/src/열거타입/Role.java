package 열거타입;

public enum Role {
	ADMIN("관리자"),
	GUEST("손님");
	
	private String role;
	
	Role( String role ) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
}
