import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		int size, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		size = sc.nextInt();
		int array[]=new int[size];
		
		for (int i = 0 ; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("Array before sorting: ");
		for (int i = 0 ; i < size; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
		for(int i=0; i < size; i++){  
            for(int j = 1; j < (size - i); j++){  
                     if(array[j-1] > array[j]){  
                    	 temp = array[j-1];  
                         array[j-1] = array[j];  
                         array[j] = temp;   
                    }  
                     
            }
		}
		
		System.out.print("Array after sorting: ");
		for (int i = 0 ; i < size; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

}
