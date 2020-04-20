package com.example.user.model;

public class LoginResponseDTO {
		private String userName;
		private String password;
		public String role;
		
		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		public String getPassword() {
			return password;
		}
		public  void setRole(String role) {
			this.role = role;
		}

		public String getRole() {
			return role;
		}

}
