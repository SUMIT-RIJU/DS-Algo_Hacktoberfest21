//****************************************************************************************
/* Linear search is a very simple search algorithm. 
In this type of search, a sequential search is done for all items one by one. 
Every item is checked and if a match is found then that particular
item is returned, otherwise the search continues till the end of the data collection.*/

//PROBLEM STATEMENT: Using Linear Search method, searching for an element in the array,
//                   check if an integral element is present in the array or not.

//INPUT: Integral elements for an array of some size and the number to be searched.

//OUTPUT: Element found or not.

//ALGORITHM:
//Step 1: START
//Step 2: Initialization of integral variables no,n.
//Step 3: Declaration of integral variables flag and temp as 0.
//Step 4: Take the total number of integral to be stored in the array as an input.
//Step 5: Declaration of an array named (arr) with size (no).
//Step 6: Use of for loop where the loop executes till the value of i is than (no)
//Step 7: Inside the for loop, take integral elements as an input to store in the array.
//Step 8: Take a number to be searched as an input.
//Step 9: Use of for loop to traverse till end of the array. 
//Step 10: Inside for loop, use of if structure to check whether 
//         the entered number matches with any of the element of the array.
//Step 11: Inside if structure, if entered number matches any of the element of tha array
//         then make the value of flag as 1.
//Step 12: Use of if else structure to print whether the element found or not.
//Step 13: END
//*****************************************************************************************
package Hacktoberfest_SUMIT_RIJU_Solutions;

import java.util.Scanner;// import Scanner Class from util package

public class Linear_Search {
//Start of class
	public static void main(String[] args) 
	{//Start of main function
		int no,n,flag=0,temp=0;//Intialisation of variables with int data type
		Scanner sc=new Scanner(System.in);//Use of Scanner Class
		
		System.out.println("Enter the total number of elements to be stored in the array:");
		no=sc.nextInt();//Take total number of elements as an input from user
		int[] arr=new int[no];//Declaration of array
		System.out.println("Enter the integral elements for the array");
		for(int i=0;i<no;i++)//Use of for loop
		{
			arr[i]=sc.nextInt();//Take array elements as an input from user
		}
		System.out.println("Enter a number to be searched:");
		n=sc.nextInt();//Take number to be searched as an input
		
		for(int k=0;k<no;k++)
		{//use of for loop
			if(n==arr[k])
			{//use of if structure
				temp=k;//Assign value of k to temp for temporary storage of value stored in k
				flag=1;//Assign flag 1 as the value
				break;//use of break statement to terminate the loop once the element is found
			}
			
		}
		//use of if else control structure
		if(flag==1)
		{
			System.out.println("Element "+n+" found at index position "+temp);
		}
		else
		{
			System.out.println("Element "+n+" not found");
		}
       
   }

}
//*****************************************************************************************
//OUTPUT:

//SAMPLE TEST 1:
//Enter the total number of elements to be stored in the array:
//3
//Enter the integral elements for the array
//5
//8
//9
//Enter a number to be searched:
//8
//Element 8 found at index position 1

//SAMPLE TEST 2:
//Enter the total number of elements to be stored in the array:
//4
//Enter the integral elements for the array
//7
//8
//9
//6
//Enter a number to be searched:
//10
//Element 10 not found

//*****************************************************************************************
