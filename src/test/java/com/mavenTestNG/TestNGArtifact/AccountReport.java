package com.mavenTestNG.TestNGArtifact;

import java.util.ArrayList;
import java.util.List;

public  class AccountReport extends Writer implements IExcelWriter{

	String name = "Pablo";
	String apellido = "Garcia"; 
	String status = "Soltero";
	String edad = "27";
	
	public String[] getHeaders() {
		String []headers = {"Nombre","Apellido","Estado Civil","Edad"};
		return headers;
	}

	public List<Object> getValues() {
		List<Object> values = new ArrayList<Object>();
		values.add(name);
		values.add(apellido);
		values.add(status);
		values.add(edad);
		
		return values;
	}

	public AccountReport() {
		
	}
	public AccountReport(String name, String apellido, String status, String edad) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.status = status;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

		

	
}
