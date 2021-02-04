import java.util.Scanner;

public class SelectionSort {

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
		for (int i = 0; i < array.length - 1; i++)  
        {  
            temp = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (array[j] < array[temp]){  
                    temp = j;
                }  
            }  
            int n = array[temp];   
            array[temp] = array[i];  
            array[i] = n;  
        }  
		
		System.out.print("Array after sorting: ");
		for (int i = 0 ; i < size; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}

	}

}
