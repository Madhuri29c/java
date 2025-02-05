package com.wipro.java.collection;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5},i;//declaring and initializing an array
		/*arr=new int[5];//allocating 5 elements to an array
		//index value starts from 0 to 4 and initializing the values
		arr[0]=1;//0th index
		arr[1]=2;//1st index
		arr[2]=3;//2nd index
		arr[3]=4;//3rd index
		arr[4]=5;//4th index*/
		
		
		//rotating loop for printing the elements in an array
		for(i=0;i<arr.length;i++) {
			//System.out.println("Element has index"+i+":"+arr[i]);
			System.out.println(arr[i]);
		}

	}

}
