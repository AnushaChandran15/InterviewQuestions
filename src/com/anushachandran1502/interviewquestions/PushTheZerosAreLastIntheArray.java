package com.anushachandran1502.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class PushTheZerosAreLastIntheArray {
	
	public static void main(String[] args) {
		PushTheZerosAreLastIntheArray zerosLast=new PushTheZerosAreLastIntheArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Array length");
		int length=scanner.nextInt();
		int[] array=new int[length];
		array=zerosLast.intputArray(length,array,scanner);
		array=zerosLast.zerosAllendofTheArray(length,array);
	}

	private int[] zerosAllendofTheArray(int length, int[] array) {
			int[] ansArray=new int[length];
			int j=0;
			for(int i=0;i<length;i++)
			{
				if(array[i]!=0)
				{
					ansArray[j]=array[i];
					j++;
				}
			}
			System.out.println(Arrays.toString(ansArray));
		return ansArray;
	}

	private int[] intputArray(int length, int[] array, Scanner scanner) {
		for(int i=0;i<length;i++)
		{
			System.out.println("Index : "+(i+1));
			array[i]=scanner.nextInt();
		}
		return array;
	}
}
