package com.project.pt;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique = true) 
	private String username;
	
	@Column private String password;
	
	@Column(columnDefinition = "boolean default false")
	private boolean isAdmin;

	public UserEntity() {
		super();
	}

	public UserEntity(String username, String password, boolean isAdmin) {
		super();
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User :  [id=" + id + ", username=" + username + ", password=" + password + ", isAdmin=" + isAdmin
				+ "]";
	}
	
	
	
}
