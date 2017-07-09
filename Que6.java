package assignment9;

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to find first number of vowels and consonants");
		String a = scan.next();
		a = a.toLowerCase();
		int vowelCount = 0;
		int consonentCount =0;
		for(int i =0;i<a.length();i++){
		
				if(a.charAt(i)== 'a' ||a.charAt(i)== 'e' || a.charAt(i)== 'i' || a.charAt(i)== 'o' || a.charAt(i)== 'u'){
					vowelCount += 1;
				}
				else{
					consonentCount +=1;
				}	
		}
		System.out.println("number of vowels is : " + vowelCount);
		System.out.println("number of consonents is : " + consonentCount);
		scan.close();

	}

}
