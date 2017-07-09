package assignment9;

import java.util.ArrayList;


public class Que9 {

	public static void main(String[] args) {
		int array[] = {6,4,5,7,3,6,4,7,6,4,2,9,6};
		
		int count[] = new int[array.length];
		for(int i =0;i<array.length;i++){
			for(int j =0;j<array.length;j++){
				if(array[i]==array[j])
					count[i]++;
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =0;i<count.length;i++){
			if(count[i]>1){
				if(!al.contains(array[i])){
					al.add(array[i]);
				}
			}
		}
		
		System.out.println("the duplicate elements in array are : "+al);
		
		
	}

}
