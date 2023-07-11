package com.project.pt.transaction;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "transaction")
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column private Date date;
	
	@Column private String username;
	
	@Column private int pid;
	
	@Column private String pname;
	
	@Column private int cid;

	public TransactionEntity() {
		super();
	}

	public TransactionEntity(Date date, String username, int pid, String pname, int cid) {
		super();
		this.date = date;
		this.username = username;
		this.pid = pid;
		this.pname = pname;
		this.cid = cid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Transaction : [id=" + id + ", date=" + date + ", username=" + username + ", pid=" + pid + ", pname="
				+ pname + ", cid=" + cid + "]";
	}
	
}
