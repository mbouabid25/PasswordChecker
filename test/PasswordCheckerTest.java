import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordCheckerTest {

	@Test
	void isEightOrMoreNone() {
		/*
         * Purpose: Bad User Input— tests for the length
         * of an empty password
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: An empty String 
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore(""));
	}
	
	@Test
	void isEightOrMoreOneLower() {
		/*
         * Purpose: Tests for the length of a single
         * lowercase letter
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a single lowercase letter string
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("c"));
	}
	
	@Test
	void isEightOrMoreOneUpper() {
		/*
         * Purpose: Tests for the length of a single
         * upper case letter
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a single uppercase letter string
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("D"));
	}
	
	@Test
	void isEightOrMoreOneDigit() {
		/*
         * Purpose: Tests for the length of a single
         * digit
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a single digit string
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("1"));
	}
	
	@Test
	void isEightOrMoreSevenOneSign() {
		/*
         * Purpose: Tests for the length of a single
         * sign
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a single sign string
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("&"));
	}
	@Test
	void isEightOrMoreSevenDigits() {
		/*
         * Purpose: Tests for the length of a seven
         * digits
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven digits
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("1324354"));
	}
	
	@Test
	void isEightOrMoreSevenLowLetters() {
		/*
         * Purpose: Tests for the length of a seven
         * letters
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven letters
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("abcdefk"));
	}
	
	@Test
	void isEightOrMoreSevenUpLetters() {
		/*
         * Purpose: Tests for the length of a seven
         * uppercase letters
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven uppercase letters
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("AHDIEOK"));
	}
	
	@Test
	void isEightOrMoreSevenSigns() {
		/*
         * Purpose: Tests for the length of seven
         * signs
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven uppercase signs
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("@&§<+%"));
	}
	
	@Test
	void isEightOrMoreSevenSpaces() {
		/*
         * Purpose: Tests for the length of seven
         * spaces
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven spaces
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("       "));
	}
	
	@Test
	void isEightOrMoreSevenSignsAndLetters() {
		/*
         * Purpose: Tests for the length of seven
         * signs and letters
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven signs and letters
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("@a§b+c"));
	}
	
	
	@Test
	void isEightOrMoreSevenSignsAndSpaces() {
		/*
         * Purpose: Tests for the length of seven
         * spaces and signs
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven spaces and signs
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("@ § + "));
	}
	
	@Test
	void isEightOrMoreSevenLettersAndDigits() {
		/*
         * Purpose: Tests for the length of seven
         * letters and digits
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven letters and digits
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("a1c7f9"));
	}
	
	@Test
	void isEightOrMoreSevenLettersAndSpaces() {
		/*
         * Purpose: Tests for the length of seven
         * letters and spaces
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven letters and spaces
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("a c f "));
	}
	
	@Test
	void isEightOrMoreSevenRandom() {
		/*
         * Purpose: Tests for the length of seven
         * letters and spaces
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of seven letters and spaces
         * Correct result: False
         */
		assertFalse(PasswordChecker.isEightOrMore("@1§7+a"));
	}
	
	@Test
	void isEightOrMoreEightLetters() {
		/*
         * Purpose: Tests for the length of eight
         * letters
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of eight letters
         * Correct result: True
         */
		assertTrue(PasswordChecker.isEightOrMore("chocolat"));
	}
	
	@Test
	void isEightOrMoreEightDigits() {
		/*
         * Purpose: Tests for the length of eight
         * digits
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of eight digits
         * Correct result: True
         */
		assertTrue(PasswordChecker.isEightOrMore("87654321"));
	}
	
	@Test
	void isEightOrMoreTwelveDigits() {
		/*
         * Purpose: Tests for the length of twelve
         * digits
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of twelve digits
         * Correct result: True
         */
		assertTrue(PasswordChecker.isEightOrMore("876543211234"));
	}
	
	@Test
	void isEightOrMoreNineSpaces() {
		/*
         * Purpose: Tests for the length of nine
         * spaces
         * Method: isEightOrMore
         * Initialization: None
         * Parameters: a string of nine spaces
         * Correct result: True
         */
		assertTrue(PasswordChecker.isEightOrMore("         "));
	}
	
	@Test
	void isInDictionaryTwo() {
		/*
         * Purpose: Tests when the dictionary contains
         * two words and one of them is the password
         * Method: isInDictionary
         * Initialization: Adding two words in the dictionary
         * Parameters: a word in the dictionary
         * Correct result: True
         */
		PasswordChecker.addToDict("jokes");
		PasswordChecker.addToDict("clown");
    	assertTrue(PasswordChecker.isInDictionary("clown"));
    }
	
	@Test
	void isInDictionaryOne() {
		/*
         * Purpose: Tests when the dictionary does not
         * contain the password
         * Method: isInDictionary
         * Initialization: A dictionary with two words that are 
         * different from our password
         * Parameters: a word not in the dictionary
         * Correct result: False
         */
    	assertFalse(PasswordChecker.isInDictionary("socks"));
    }
	
	
	@Test
	void isInDictionaryNoWord() {
		/*
         * Purpose: Tests when the user inputs a space as a 
         * password
         * Method: isInDictionary
         * Initialization: A dictionary with any words
         * Parameters: a space 
         * Correct result: False
         */
    	assertFalse(PasswordChecker.isInDictionary(" "));
    }
	
	@Test
	void isInDictionaryNull() {
		/*
         * Purpose: Tests when the user inputs an empty
         * string as a password
         * Method: isInDictionary
         * Initialization: A dictionary with any words
         * Parameters: an empty string
         * Correct result: True
         */
    	assertFalse(PasswordChecker.isInDictionary(""));
    }
	
	
	@Test
	void isInDictionaryOneWord() {
		/*
         * Purpose: Tests when the user inputs one
         * password that is in the dictionary
         * and one that is not
         * Method: isInDictionary
         * Initialization: A dictionary with any words
         * Parameters: a string that is in the dictionary
         * then a string that is not
         * Correct result: True then False
         */
		PasswordChecker.addToDict("jokes");
		PasswordChecker.addToDict("clown");
    	assertTrue(PasswordChecker.isInDictionary("jokes"));
    	assertFalse(PasswordChecker.isInDictionary("RedNose"));
    }
	
	@Test
	void isInDictionaryNoWords() {
		/*
         * Purpose: Tests when the user inputs two
         * passwords that are not in the dictionary
         * and one that is not
         * Method: isInDictionary
         * Initialization: A dictionary with any words
         * Parameters: two strings that are not in the dictionary
         * Correct result: False then False
         */
    	assertFalse(PasswordChecker.isInDictionary("Wig"));
    	assertFalse(PasswordChecker.isInDictionary("RedNose"));
    }
	
	@Test
	void isInDictionaryNoSigns() {
		/*
         * Purpose: Tests when the user inputs signs that are not
         * in the dictionary as a password
         * Method: isInDictionary
         * Initialization: A dictionary with any words
         * Parameters: a string of signs
         * * Correct result: False
         */

    	assertFalse(PasswordChecker.isInDictionary("!!!!!!"));
    }
	
	
	@Test
	void isInDictionaryNumbersSigns() {
		/*
         * Purpose: Tests when the user inputs signs and numbers
         * that are in the dictionary as a password
         * Method: isInDictionary
         * Initialization: A dictionary with any words
         * Parameters: a string of signs then a string of numbers
         * * Correct result: True
         */
		PasswordChecker.addToDict("111111");
		PasswordChecker.addToDict("@@@@@@");
    	assertTrue(PasswordChecker.isInDictionary("111111"));
    	assertTrue(PasswordChecker.isInDictionary("@@@@@@"));
    }
	
	@Test
	void isInDictionaryWrongNumbers() {
		/*
         * Purpose: Tests when the user inputs signs that are
         * in the dictionary and numbers that are not as a password
         * Method: isInDictionary
         * Initialization: A dictionary with any words
         * Parameters: a string of numbers then a string of signs
         * * Correct result: False then True
         */
		PasswordChecker.addToDict("111111");
		PasswordChecker.addToDict("@@@@@@");
    	assertFalse(PasswordChecker.isInDictionary("222222"));
    	assertTrue(PasswordChecker.isInDictionary("@@@@@@"));
    }
	
	
	@Test
	void isWordFollowedByNumDigit() {
		/*
         * Purpose: Tests when the user inputs a number as a password
         * to see if it is a word in the dictionary followed by a number
         * Method: isWordFollowedByNum
         * Initialization: A dictionary with any words
         * Parameters: a string of a single digit
         * * Correct result: False
         */
		assertFalse(PasswordChecker.isWordFollowedByNum("1"));
	}
	
	@Test
	void isWordFollowdByNumLetter() {
		/*
         * Purpose: Tests when the user inputs a letter as a password
         * to see if it is a word in the dictionary followed by a number
         * Method: isWordFollowedByNum
         * Initialization: A dictionary with any words
         * Parameters: a string of a single letter
         * * Correct result: False
         */
		assertFalse(PasswordChecker.isWordFollowedByNum("A"));
	}
	
	@Test
	void isWordFollowdByNumLetterAndDigit() {
		/*
         * Purpose: Tests when the user inputs a letter and a number
         * as a password to see if it is a word in the dictionary 
         * followed by a number
         * Method: isWordFollowedByNum
         * Initialization: A dictionary with any words
         * Parameters: a string of a single letter and a digit
         * * Correct result: False
         */
		assertFalse(PasswordChecker.isWordFollowedByNum("A1"));
	}
	
	@Test
	void isWordFollowdByNumLetterWordAndDigit() {
		/*
         * Purpose: Tests when the user inputs a word in the dictionary
         * followed by a digit as a password to see if it is a word 
         * in the dictionary followed by a number
         * Method: isWordFollowedByNum
         * Initialization: A dictionary with any words
         * Parameters: a word in the dictionary followed by a digit
         * * Correct result: True
         */
		PasswordChecker.addToDict("games");
		assertTrue(PasswordChecker.isWordFollowedByNum("games1"));
	}
	
	@Test
	void containsDigitsNone() {
		/*
         * Purpose: Tests if a word with no digits contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a word with no digits
         * * Correct result: False
         */
		assertFalse(PasswordChecker.containsDigits("coconutbanana"));
	}
	
	@Test
	void containsDigitsOneBeg() {
		/*
         * Purpose: Tests if a word with a digit at the 
         * beginning contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a word with a digit at the beginning
         * * Correct result: True
         */
		assertTrue(PasswordChecker.containsDigits("1coconutbanana"));
	}
	
	@Test
	void containsDigitsOneMid() {
		/*
         * Purpose: Tests if a word with a digit 
         * in the middle contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a word with digits in the middle 
         * * Correct result: True
         */
		assertTrue(PasswordChecker.containsDigits("cocon1utbanana"));
	}
	
	@Test
	void containsDigitsOneEnd() {
		/*
         * Purpose: Tests if a word with a digit 
         * at the end contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a word with digits at the end
         * * Correct result: True
         */
		assertTrue(PasswordChecker.containsDigits("coconutbanana1"));
	}
	
	@Test
	void containsDigitsTwoBegEnd() {
		/*
         * Purpose: Tests if a word with two digits
         * one at the end and one at the beginning contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a word with digits at the end and beginning
         * * Correct result: True
         */
		assertTrue(PasswordChecker.containsDigits("2coconutbanana1"));
	}
	
	@Test
	void containsDigitsNoInput() {
		/*
         * Purpose: Tests if an empty string contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: an empty string
         * * Correct result: False
         */
		assertFalse(PasswordChecker.containsDigits(""));
	}
	
	@Test
	void containsDigitsSign() {
		/*
         * Purpose: Tests if a sign contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a single sign
         * * Correct result: False
         */
		assertFalse(PasswordChecker.containsDigits("@"));
	}
	
	@Test
	void containsDigitsSpace() {
		/*
         * Purpose: Tests if a space contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a space
         * * Correct result: False
         */
		assertFalse(PasswordChecker.containsDigits(" "));
	}
	
	@Test
	void containsDigitsNumbersandSpace() {
		/*
         * Purpose: Tests if a string of digits and spaces
         * contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a string of numbers and spaces
         * * Correct result: True
         */
		assertTrue(PasswordChecker.containsDigits("1234567 0"));
	}
	
	@Test
	void containsDigitsNumbersAndSigns() {
		/*
         * Purpose: Tests if a string of signs and digits
         * contains digits
         * Method: containsDigits
         * Initialization: None
         * Parameters: a string of signs and digits
         * * Correct result: True
         */
		assertTrue(PasswordChecker.containsDigits("@@22/"));
	}
	
	@Test
	void isTwoWordsSeperatedByNumDigit() {
		/*
         * Purpose: Tests if two strings in the dict seperated by
         * a number are indeed what they are supposed to be
         * Method: isTwoWordsSperatedByNum
         * Initialization: A dictionary with words
         * Parameters: two strings in the dict seperated by
         * a digit
         * * Correct result: True
         */
		PasswordChecker.addToDict("jokes");
		PasswordChecker.addToDict("clown");
		assertTrue(PasswordChecker.isTwoWordsSeperatedByNum("clown2jokes"));
	}
	
	@Test
	void isTwoWordsSeperatedByNumNo() {
		/*
         * Purpose: Tests if two strings in the dict not seperated by anything
         * are two words in the dictionary seperated by a digit
         * Method: isTwoWordsSperatedByNum
         * Initialization: A dictionary with words
         * Parameters: two strings in the dict back to back
         * a digit
         * * Correct result: False
         */
		assertFalse(PasswordChecker.isTwoWordsSeperatedByNum("clownjokes"));
	}
	
	@Test
	void isTwoWordsSeperatedByNumSign() {
		/*
         * Purpose: Tests if two strings in the dict seperated by a sign
         * are two words in the dictionary seperated by a digit
         * Method: isTwoWordsSperatedByNum
         * Initialization: A dictionary with words
         * Parameters: two strings in the dict seperated by a sign
         * * Correct result: False
         */
		assertFalse(PasswordChecker.isTwoWordsSeperatedByNum("clown/jokes"));
	}
	@Test
	void isTwoWordsSeperatedByNumOne() {
		/*
         * Purpose: Tests if two strings with one 
         * being a word in the dict seperated by a digit
         * are two words in the dictionary seperated by a digit
         * Method: isTwoWordsSperatedByNum
         * Initialization: A dictionary with words
         * Parameters: a password of two words with one being 
         * in the dict seperated by a digit
         * * Correct result: False
         */
		assertFalse(PasswordChecker.isTwoWordsSeperatedByNum("clown4socks"));
	}
	
	@Test
	void reverseStringTestWord() {
		/*
         * Purpose: Tests if a word is reversed correctly
         * Method: reverseString
         * Parameters: a word (clown)
         * * Correct result: The reversed word
         */
		assertEquals(PasswordChecker.reverseString("clown"), "nwolc");
	}
	
	@Test
	void reverseStringTestNumbers() {
		/*
         * Purpose: Tests if a string of numbers is reversed correctly
         * Method: reverseString
         * Parameters: a string of numbers
         * * Correct result: The reversed string
         */
		assertEquals(PasswordChecker.reverseString("12345"), "54321");
	}
	
	@Test
	void reverseStringTestNumbersAndWord() {
		/*
         * Purpose: Tests if a string of numbers and letters
         * is reversed correctly
         * Method: reverseString
         * Parameters: a string of numbers and letters
         * * Correct result: The reversed string
         */
		assertEquals(PasswordChecker.reverseString("chocolate12345"), "54321etalocohc");
	}
	
	@Test
	void reverseStringTestSigns() {
		/*
         * Purpose: Tests if a string of signs
         * is reversed correctly
         * Method: reverseString
         * Parameters: a string of signs
         * * Correct result: The reversed string
         */
		assertEquals(PasswordChecker.reverseString("#@@"), "@@#");
	}
	
	@Test
	void reverseStringTestRepeat() {
		/*
         * Purpose: Tests if a string of letters with repeated letters
         * is reversed correctly
         * Method: reverseString
         * Parameters: a string of letters 
         * * Correct result: The reversed string
         */
		assertEquals(PasswordChecker.reverseString("accccct"), "tccccca");
	}
	
	@Test
	void reverseStringTestSpaces() {
		/*
         * Purpose: Tests if a string of spaces
         * is reversed correctly
         * Method: reverseString
         * Parameters: a string of spaces 
         * * Correct result: The same number of spaces
         */
		assertEquals(PasswordChecker.reverseString("    "), "    ");
	}
	
	@Test
	void reverseStringTestNone() {
		/*
         * Purpose: Tests if an empty string
         * is reversed correctly
         * Method: reverseString
         * Parameters: an empty string
         * * Correct result: an empty string
         */
		assertEquals(PasswordChecker.reverseString(""), "");
	}
	
	@Test
	void isGoodPasswordLessThanEight() {
		/*
         * Purpose: Checks if a password of eight letters
         * that is not in the dictionary is a good one 
         * Method: isGoodPassword
         * Parameters: a password that is less than eight letters
         * * Correct result: False
         */
		assertFalse(PasswordChecker.isGoodPassword("cocoa"));
	}
	
	@Test
	void isGoodPasswordInDict() {
		/*
         * Purpose: Checks if a password of more than eight letters
         * that is in the dictionary is a good one (checks for the reversed
         * password as well)
         * Method: isGoodPassword
         * Parameters: a password that is more than eight letters
         * and that is in the dictionary
         * * Correct result: False
         */
		PasswordChecker.addToDict("Supercalifragilisticexpialidocious");
		assertFalse(PasswordChecker.isGoodPassword("Supercalifragilisticexpialidocious"));
		assertFalse(PasswordChecker.isGoodPassword("suoicodilaipxecitsiligarfilacrepuS"));
	}
	
	@Test
	void isGoodPasswordWordsInDictSperatedByNum() {
		/*
         * Purpose: Checks if a password of more than eight letters with two
         * words that are in the dictionary seperated by a number is a good 
         * one (checks for the reversed
         * password as well)
         * Method: isGoodPassword
         * Parameters: a password that is more than eight letters with two words from 
         * the dictionary seperated by a number
         * * Correct result: False
         */
		PasswordChecker.addToDict("jokes");
		PasswordChecker.addToDict("clown");
		assertFalse(PasswordChecker.isGoodPassword("clown2jokes"));
		assertFalse(PasswordChecker.isGoodPassword("sekoj2nwolc"));
	}
	
	@Test
	void isGoodPasswordWordsInDictAndNum() {
		/*
         * Purpose: Checks if a password with a word that is in the 
         * dictionary followed by a number is a good 
         * one (checks for the reversed
         * password as well)
         * Method: isGoodPassword
         * Parameters: a password that is in the dictionary followed by a 
         * number
         * * Correct result: False
         */
		PasswordChecker.addToDict("hello");
		PasswordChecker.addToDict("world");
		assertFalse(PasswordChecker.isGoodPassword("hello2"));
		assertFalse(PasswordChecker.isGoodPassword("olleh2"));
	}
	
	@Test
	void isGoodPasswordRandom() {
		/*
         * Purpose: Checks if a random password that meets all the criteria
         * is a good one 
         * Method: isGoodPassword
         * Parameters: a random password of letters signs and digits 
         * * Correct result: True
         */
	    assertTrue(PasswordChecker.isGoodPassword("clo#nn22JoKE"));
	}
	
	
	

}
