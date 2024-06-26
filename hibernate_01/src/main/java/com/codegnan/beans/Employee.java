package com.codegnan.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp1")
public class Employee {
	@Id
	@Column(name = "EID", length = 5)
	private String eid;
	@Column(name = "ENAME", length = 10)
	private String ename;
	@Column(name = "ESAL", length = 6)
	private float esal;
	@Column(name = "EADDR", length = 10)
	private String eaddr;
	@OneToOne(cascade = CascadeType.ALL)
	private Account acc;

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

}
