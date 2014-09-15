package com.realdolmen.jsfcourse;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.validator.constraints.Length;

@ManagedBean(name = "helloBean")
@SessionScoped
public class HelloBean {
	private String name;
	
	public String convertNameToUpperCase() {
		name = name.toUpperCase();
		return "welcome";
	}

	@Length(min = 1, max = 100)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
