package com.mydesign.business.persistence;

import java.io.IOException;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;


@Entity
@Table(name="product_spec")
public class ProductSpecification extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2617503704371622389L;
	
	@Column
	private String sizes = "[]";
	
	@Column
	private String colors = "[]";

	@Column
	private String details = "[]";

	public List<Integer> getSizes() {
		List<Integer> list = null;
		try {
			list = mapper.readValue(sizes, new TypeReference<List<Integer>>(){});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void setSizes(List<Integer> sizes) {
		try {
			this.sizes = mapper.writeValueAsString(sizes);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public List<String> getColors() {
		List<String> list = null;
		try {
			list = mapper.readValue(colors, new TypeReference<List<String>>(){});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void setColors(List<String> colors) {
		try {
			this.colors = mapper.writeValueAsString(colors);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public List<String> getDetails() {
		List<String> list = null;
		try {
			list = mapper.readValue(details, new TypeReference<List<String>>(){});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void setDetails(List<String> details) {
		try {
			this.details = mapper.writeValueAsString(details);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	
}
