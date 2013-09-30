package array1;

import java.util.Scanner;

public class StartClass {

	private static Scanner in;
	  
	public static void main(String[] args){
		ArrayTester myAT = new ArrayTester();
		ArrayTester myAT2;
		myAT2 = new ArrayTester();
		int i;
		for (i=0; i<=9; i++){
			myAT.setStringAt(i, "hej " + i);
		}
		for (i=0; i<=9; i++){
			myAT2.setStringAt(i, "hopp " + i);
		}
		String[] arr1, arr2, arrTot;
		arr1 = myAT.getArray();
		arr2 = myAT2.getArray();
		int totlen = arr1.length + arr2.length;
		arrTot = new String[totlen];
		int p = 0;
		for (String tmp1 : arr1){
			arrTot[p] = tmp1;
			p++;
		}
		for (String tmp2 : arr2){
			arrTot[p] = tmp2;
			p++;
		}
		System.out.println("Resulting array:");
		for (String str : arrTot){
			System.out.println(str);
		}
		//String s = myAT.getStringAt(1);
		// System.out.println(s);
		// get input for 1 and 2
		in = new Scanner(System.in);
		String str1, str2;
		System.out.println("Enter a string");
		str1 = in.nextLine();
		myAT.setStringAt(1, str1);
		System.out.println("Enter another string");
		str2 = in.nextLine();
		myAT.setStringAt(2, str2);
		// set array elements 3-9
		for (i=3; i<=9; i++){
			myAT.setStringAt(i, "hej " + i);
		}
		// set array element 0
		myAT.setStringAt(0, "nollan");
		// now, print the whole array
		System.out.println("Array from myAT:");
		myAT.printArray();
		// print flipped Array
		System.out.println("Flipped array from myAT:");
		String[] newArr;
		newArr = myAT.getFlippedArray();
		for (String str : newArr){
			System.out.println(str);
		}
		
	}
	
}
