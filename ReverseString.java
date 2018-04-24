/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Apr 2018
 * Created for: learning
 * 
 * This program reverses string using Recursion
 ****************************************************************************/



public class ReverseString{
	//prints out sentence backwards using recursion

    //--------------------------
	public void reverse(String inputSentence) {   
    	//this is a recursive procedure printing out the sentence backwards
    	
    	String subStringNoLastChar, lastCharacterOfString;

    
    	 if (inputSentence.length() > 0) {
    		 //if there is string
    		 									//substring -> 'sub' part of the string (returns string)
    		 									//startIndex: inclusive	  endIndex: exclusive
    		subStringNoLastChar = inputSentence.substring(0, inputSentence.length()-1); //lastCharacter gone
    		
    		//get last character
     		lastCharacterOfString = inputSentence.substring(inputSentence.length()-1);
     		
     		System.out.print(lastCharacterOfString);
    		//calling same method  
    		reverse(subStringNoLastChar); //call the function from inside the same function
    		/**********************************
    		reverse("Hello")
    		(reverse("ello")) + "H"
    		((reverse("llo")) + "e") + "H"
    		(((reverse("lo")) + "l") + "e") + "H"
    		((((reverse("o")) + "l") + "l") + "e") + "H"
    		(((("o") + "l") + "l") + "e") + "H"
    		"olleH"
    		**********************************/

    	 }
    	 
    }
       
    //--------------------------
	public static void main(String[] args) {
    	//reverses string
    	ReverseString obj=new ReverseString(); //call the same class
    	
        String str = "String to be reversed";
        
        System.out.println("Reverse of \'"+str+"\' is ");    
        obj.reverse(str);
    }    
}


