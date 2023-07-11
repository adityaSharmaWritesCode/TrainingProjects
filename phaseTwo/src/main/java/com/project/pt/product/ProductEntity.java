package com.project.pt.product;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	
	@Column private String p_name;
	
	@Column private String cat_name;
	
	@Column private int cat_id;
	
	public ProductEntity() {
		super();
	}
	
	public ProductEntity(String p_name, String cat_name, int cat_id) {
		super();
		this.p_name = p_name;
		this.cat_name = cat_name;
		this.cat_id = cat_id;
	}

	public String getP_name() {
		return p_name;
	}
	
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	
	public int getP_id() {
		return p_id;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	@Override
	public String toString() {
		return "Product : [p_id=" + p_id + ", p_name=" + p_name + ", cat_name=" + cat_name + ", cat_id=" + cat_id
				+ "]";
	}
		
}
