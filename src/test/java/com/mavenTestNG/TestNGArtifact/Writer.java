package com.mavenTestNG.TestNGArtifact;

import java.util.ArrayList;
import java.util.List;

public class Writer implements IExcelWriter{
	
	public Writer() {
		
	}
	
	public String [] getHeaders() {
		String [] s = {""};
		return s;
	}
	public List<Object> getValues(){
		List<Object> values = new ArrayList<Object>();
		
		return values;
	}

}
