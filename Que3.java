package assignment9;

import java.util.Scanner;

public class Que3 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to find duplicate character");
		String a = scan.next();
		a = a.toLowerCase();
		
		
		for(int i =0;i<a.length();i++){
			int count =0;
			for(int j =0;j<a.length();j++){
				if(a.charAt(i)==a.charAt(j))
					count++;
			}
		
			if(count >1){
				System.out.println(a.charAt(i) + " repeated "+ count + " times");
				a = a.replaceAll(a.substring(i,i+1),"");
			}
			
			
		}
		scan.close();
	}

}
	