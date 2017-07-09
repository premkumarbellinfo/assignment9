package assignment9;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to find first non-repeated character");
		String a = scan.next();
		a = a.toLowerCase();
		
		
		for(int i =0;i<a.length();i++){
			int count =0;
			for(int j =0;j<a.length();j++){
				if(a.charAt(i)==a.charAt(j))
					count++;
			}
		
			if(count == 1){
				System.out.println("The first non repeated character is "+a.charAt(i));
				break;
				//a = a.replaceAll(a.substring(i,i+1),"");
			}
			
			
		}
		scan.close();
	}

}
