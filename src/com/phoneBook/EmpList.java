package com.phoneBook;
/*This class will explain about the use of HashMap and will get us the visibility on Keys and Values*/
import java.util.HashMap;
import java.util.Set;

public class EmpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> empList=new HashMap<String,String>(); //Declared an HashMAP
		
		//Inserting the value inside an HashMap
		empList.put("TC01","Prithvijit Mishra"); 
		empList.put("LC01","Pupupa");
		empList.put("ITPL01","John Cena");
		empList.put("TC02","Madhura");
		
		//Will view the HashMap
		Set<String> s=empList.keySet();	//Assigning the Keys  to the Set 
		for(String s1:s){
			System.out.println(s1+":"+empList.get(s1)); //Printing out the Keys along with the Values
			
		}
		
		
		
		
		

	}

}
