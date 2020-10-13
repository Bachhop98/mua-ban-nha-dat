package com.muabannhadat.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PACKAGETYPE")
public class PackageTypeEntity {
//packege_type(id,packege_name,price_type,status)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String code;
	
	private String price;
	
	private String status;
	@OneToMany (mappedBy = "type", cascade = CascadeType.ALL)
	private List<PostNewsEntity> post;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostNewsEntity> getPost() {
		return post;
	}

	public void setPost(List<PostNewsEntity> post) {
		this.post = post;
	}



//	@Override
//	public String toString() {
//		return this.name;
//	}
	
}
