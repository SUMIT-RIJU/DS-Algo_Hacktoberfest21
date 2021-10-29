/*     BUBBLE SORT ALGORITHM

Theory : Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements 
         if they are in wrong order.
         
Example :
         Given unsorted array  = {2,1,4,5,3}
         Required sorted array = {1,2,3,4,5}

Approach :
       1)Start by comparing first two elements till last and if array is not sorted yet, 
         then repeat the same with further passes.  
         Given array is {2,1,4,5,3}
         First Pass -
         2>1, swap them ,so array will be {1,2,4,5,3}...compare for next pair till you reach end.
         2<4, don't swap,so array will remain {1,2,4,5,3}..since these elements are already in order algorithm does not swap them.
         4<5, don't swap,so array will remain {1,2,4,5,3}
         5>3, swap them ,so array will be {1,2,4,3,5}
         Here it can be observed that maximum number after first pass came at last index.
         
         Second Pass -
         1<2, don't swap, so array will be {1,2,4,3,5}
         2<4, don't swap, so array will be {1,2,4,3,5}
         4>3, swap them , so array will be {1,2,3,4,5}
         4<5, don't swap, so array will be {1,2,3,4,5}
         Here we can see that array is sorted but algorithm doesn't know if it is sorted. The algorithm needs one whole pass 
         without any swap to know it is sorted.
         
         Third Pass -
         1<2, don't swap, so array will be {1,2,3,4,5}
         2<3, don't swap, so array will be {1,2,3,4,5}
         3<4, don't swap, so array will be {1,2,3,4,5}
         4<5, don't swap, so array will be {1,2,3,4,5}
         
         Array is sorted !!
         
Time Complexity :
    Best Case      - O(n)   ...(when array is already sorted)
    Average Case   - O(n*n)
    Worst Case     - O(n*n) ...(when array is reverse sorted)
    
Auxillary Space :  O(1)

*/
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    static void bubbleSort(int[] arr){
        boolean swap;
        
        for (int i=0; i<arr.length; i++)      //Run the steps for n-1 times
        {
            swap = false;
            for(int j=1; j<arr.length-i; j++ )  //for each pass, Max number comes at last respective index
            {  
                //swap if element is smaller than previous element
                if(arr[j]< arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            } 
            if (!swap) // if swap value is false 
             break;
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter total number of elements:");
	    int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for (int i=0 ; i<n ; i++)   //To store all the elements
		{
		    arr[i]=sc.nextInt();  
		}
		System.out.println("Given array  :"+Arrays.toString(arr));
	    bubbleSort(arr);                    
		System.out.println("Sorted array :"+Arrays.toString(arr));
	}
}


