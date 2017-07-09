package assignment9;

public class Que2 {

	public static void main(String[] args) {
		int array[] = {6,4,5,7,3,6,4,7,6,4,2,9,6};
		int count[] = new int[array.length];
		for(int i =0;i<array.length;i++){
			for(int j =1;j<array.length;j++){
				if(array[i]==array[j])
					count[i]++;
			}
		}
		
		int a =0;int index = 0;
		for(int i =0;i<count.length;i++){
			if(count[i]>a){
				a = count[i];
				index = i;
			}			
		}
		if(index == 0){
			a += 1;
		}
		System.out.println(array[index] + " repeated " + a + " times");

	}

}
