/**
*@author : Marwa Bouabid
*@version : 09/20/2020
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.ArrayList;

/** This program checks whether a string is a good password or not. It reads 
* in a dictionary of words from a file. It then repeatedly 
* prompts the user for a string and tells the 
* user if the string is a good password or not.
* The password is a good one if :
* Is at least 8 characters long
* Is not a word in the dictionary
* Is not a word in the dictionary followed by a digit (hello2)
* Is not 2 words separated by a digit (hello2world)
* None of the above where the word is reversed (olleh or olleh2 or 
* olleh2world or olleh2dlrow) 
*/

public class PasswordChecker {
 // The HashSet that holds our dictionary
 private static HashSet<String> dict = new HashSet<String>();
    
 // The name of the dictionary file 
 private static String dictFile;
    
 // The name of the password file 
 private static String pwdsFile;



    /**
     * Sets up files, and decides which actions to take depending on the number
     * of arguments passed in by the user
     * @param args 0, 1 or 2
     * Asks the user for input if no or 1 argument
     */
    public static void main (String[] args) {
     // setting up the files
     setupFiles(args);
     // setting up the dictionary files
     setupDict(dictFile);

    	switch (args.length) {
     // if no arguments, ask user for password
     case 0: passwordPrompt();
    		break;
     // if one argument, ask user for password
     case 1: passwordPrompt();
    		break;
     // if two arguments, use password file
     case 2: noPrompt();
    		break;
    		
	 default:
			break;
    	}
    	return;
    }

    /**
    * Reads the password file and checks if each password 
    * is a good password then tells the user if it's not the case
    */
    private static void noPrompt() {
     // Setting up the password file
     File myObj = new File(pwdsFile);
    	try {
     // Creating a new scanner to read the file
    	Scanner myReader = new Scanner(myObj);
     // Reading the file while it still has passwords to check
    	while (myReader.hasNextLine()) {
       // pwd takes the value of a new line 
    	  String pwd = myReader.nextLine().split(" ")[0];
          // if the password does not meet the criteria of a good password...
    	    	if (!isGoodPassword(pwd)){
                  // ... tell the user that it's a bad password
    	             System.out.println(pwd + " is NOT a good password");
    	            }
    	      }
        // closing the scanner
    	   myReader.close();
        // Throwing an error if the file input by the user doesn't exist
    	    } catch (FileNotFoundException e) {
    	      System.out.println("Passwords file not found!");
    	      e.printStackTrace();
    	    }
    		
    	return;
    }    

    /**
     * Repeatedly asks user to input a password and stops if user 
     * types the letter q. Checks if each password 
     * is a good one then tells the user if it's the case or not
     */
    private static void passwordPrompt() {
  // Creating a scanner object
		try (Scanner in = new Scanner(System.in)) {
			// Asking the user for input
			System.out.print("Enter password: ");
			// Reading user input for password
			String pwd = in.nextLine();  

			// While the user never typed "q"
			while (!pwd.equals("q")){
				   // Checking if the password is a good one
			    if (isGoodPassword(pwd)){
			    	   // If yes, letting the user know
			        System.out.println(pwd + " is a good password");
			    }
			    else {
			    	   // If not, letting the user know
			        System.out.println(pwd + 
			        " is NOT a good password");
			    }
			    
			    // Asking the user to input another password
			    System.out.print("Enter password: ");
			    pwd = in.nextLine();
			}
		}
		      // If user inputs "q", stop the program
        System.out.println("Bye!");
        return;
    }

    /**
     * Setting up the files depending on the number of arguments
     * if no arguments, use Dict.txt
	 * if one argument, it is the name of a dict file
	 * if two arguments, first argument is the name of dict file, 
	 * second argument is the name of the passwords file
	 * @param args the arguments passed in by the user
	 * in the command line
     */
    private static void setupFiles(String[] args) {
    	switch (args.length) {
    	// If no arguments, our dictFile is Dict.txt
    	case 0: dictFile = "Dict.txt";
    		break;
    	// If one argument, our dictFile is the argument
    	case 1: dictFile = args[0];
    		break;
    	// If two arguments, our dictFile is the 1st arg
    	// and the pwdsFile is the second arg
    	case 2: dictFile = args[0];
    			pwdsFile = args[1];
    		break;
    	default:
    		break;
    	}
    }

    /**
     * Reading the DictFile and adding the words in the 
     * dictionary to our HashSet dict
     * @param filename, the name of the dictionary file
     */
    private static void setupDict(String filename) {
    	// Creating the file object
    	File myFile = new File(filename);
    	try {
    		     // Creating a scanner object
    	      Scanner myReader = new Scanner(myFile);
    	      // Reading every line of the file
    	      while (myReader.hasNextLine()) {
    	    	  // Adding each word to the HashSet
    	    	  String word = myReader.nextLine().split(" ")[0];
                  dict.add(word);
    	      }
    	      // Closing our scanner
    	      myReader.close();
    	      // Throwing an error if the file input 
    	      // by the user doesn't exist
    	    } catch (FileNotFoundException e) {
    	      System.out.println("Dictionary file not found!");
    	      e.printStackTrace();
    	    }
    	
    	return;
    }
    
    /**
     * Checks if the password is at least 8 characters
     * @param pwd the password to check
     * @return true if it is at least 8 chars
     */
    static boolean isEightOrMore(String pwd) {
    	   // Checks that the length of the pwd is at least 8
        return (pwd.length() >= 8);
    } 
    
    /**
     * Checks if the password is in the dictionary
     * @param pwd the password to check
     * @return true if it is in the dictionary
     */
    static boolean isInDictionary(String pwd) {
    	// Checks if the HashSet contains the password
    	return dict.contains(pwd);
    }
    
    /**
     * Checks if the password is a word in the dictionary
     * followed by a digit
     * @param pwd the password to check
     * @return true if it is a word in the dictionary
     * followed by a digit
     */
    static boolean isWordFollowedByNum(String pwd) {
    	// If the last character of the password is a digit
    	char lastChar = pwd.charAt(pwd.length()-1);
    	if(Character.isDigit(lastChar))
    	{
    	// Checks if the word before the last character 
    	// is in the dictionary
    	String strToCheck = pwd.substring(0, pwd.length()-1);
        return isInDictionary(strToCheck);
    	}
    	
    	else 
    	{
    	return false;
    	}
    }
    
 /**
 * Helper method to check if the password contains
 * digits
 * @param pwd the password to check
 * @return true if the password contains digits
 */
	static boolean containsDigits(String pwd) {
		      // An ArrayList that will hold potential digits
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // Breaking down the characters into an array of chars
        char[] chars = pwd.toCharArray();
  
                // Iterating through the characters in the array
                for(char c : chars){
                 // If the character is a digit...
                 if(Character.isDigit(c)){
                	   // Adding it to the ArrayList
                    int number = c;
                    nums.add(number);
                 }
                }
                
                // Return true if the ArrayList holds digits
                if(nums.size() != 0)
                {
					return true;
                }
                
       return false;
	}
    
	   /**
	   * Checks if the password is two words of the dictionary
	   * seperated by a digit
       * @param pwd the password to check
       * @return true if the password is two words of the dictionary
       * seperated by a digit 
       */
    static boolean isTwoWordsSeperatedByNum(String str) {
    	   // If the last character is not a digit but that the 
    	   // password contains digits...
        char lastChar = str.charAt(str.length()-1);
        if(containsDigits(str) && !Character.isDigit(lastChar)){
        	    // Splitting the words seperated by a digit
        	    // into two substrings
    	        String strToSplit = str.replaceAll("[0-9]",",");
    	        String [] splittedStr = strToSplit.split(",");
    	    	String strToCheck1 = splittedStr[0];
    	        String strToCheck2 = splittedStr[1];
    	     // Checking if either one of the substrings
    	     // is a word in the dictionary
    	    	return (isInDictionary(strToCheck1) 
    	    	&& isInDictionary(strToCheck2));
    	        }
    	        
    	        else {
    	            return false;
    	        }
    }

    /**
	 * Reverses a string
     * @param str the string to reverse
     * @return reversed the reversed string
     */
    static String reverseString(String str) {
    	   // Breaking down the string into a CharArray
        char[] reverse = str.toCharArray();
        // Reversed is an empty string at first
        String reversed = "";
        // Iterating backwards through the charArray
        for (int i = reverse.length - 1; i >= 0; i--) 
        {
        	   //Adding the characters in reverse to the string
            reversed += reverse[i];
        }
    	return reversed;
    }
    
    /**
	 * Checks if the password is good
     * @param pwd the password to check
     * @return true if the password is safe
     */
    static boolean isGoodPassword(String pwd) {
    	//Reversing the password
    	String rev = reverseString(pwd);
    	// Checking that all the conditions apply to the password
    	return (isEightOrMore(pwd) 
    			&& !isInDictionary(pwd) 
    			&& !isWordFollowedByNum(pwd) 
    			&& !isTwoWordsSeperatedByNum(pwd))
    			         // Checking for the reversed pwd
                && (!isInDictionary(rev) && !isWordFollowedByNum(rev) 
                && !isTwoWordsSeperatedByNum(rev));
    }
    
    /**
	 * Helper method for our testing, takes a word as 
	 * an arguent and adds it to our dictionnary
     * @param word the word to add
     */
    static void addToDict(String word)
    {
    	//adding the word to the dictionnary 
    	dict.add(word); 
    }
    
}
