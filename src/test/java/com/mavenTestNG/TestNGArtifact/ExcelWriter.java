package com.mavenTestNG.TestNGArtifact;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriter {	
	
	public static void main (String []args) {
		List<AccountReport> acc = new ArrayList<AccountReport>();
		acc.add(new AccountReport());
		acc.add(new AccountReport("Ana", "Lopez", "Soltera", "28"));
		acc.add(new AccountReport("Blanca", "Arzola", "Casada", "50"));
		acc.add(new AccountReport("Pablo", "Garcia", "Casado", "50"));
		write(acc);

		System.out.println("*****************************");
		List<ExcelReport> rep = new ArrayList<ExcelReport>();
		rep.add(new ExcelReport());
		rep.add(new ExcelReport("CreditCards", "10", "5", "0", "15"));
		rep.add(new ExcelReport("Debit", "13", "1", "2", "16"));
		write(rep);
		
	}
	
	/**
	 * @param obj
	 */
	public static <T extends Writer> void write(List<T> obj){
		
		System.out.println("This list is of type: " + obj.get(0).getClass());
		String [] headers = obj.get(0).getHeaders();
		for (int i = 0; i < headers.length; i++) {
			System.out.print(headers[i] + "\t");
		}

		System.out.print("\n");
		
		for(int i = 0; i < obj.size(); i++) {
			
			List<Object> values = obj.get(i).getValues();
			for (int j = 0; j < values.size(); j++) {
				System.out.print(values.get(j) + "\t");
			}
			System.out.print("\n");
			
		}


		
	}

}
