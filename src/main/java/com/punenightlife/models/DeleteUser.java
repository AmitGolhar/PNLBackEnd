package com.punenightlife.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class DeleteUser {

	@Id
	@Column(name = "id")
	private long id;

	public DeleteUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeleteUser(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
