package encapsulation;

import javaopps.basic.Person;

public class Main2 {
	

	  public static void main(String[] args) {
	    Person myObj = new Person();
	    myObj.setName("manoj"); 
	    System.out.println(myObj.getName());
	    myObj.setNo(2);
     System.out.println(myObj.getNo());		
     }

}
