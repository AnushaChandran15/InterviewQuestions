package com.anushachandran1502.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayFrequencyElements {
	public static void main(String[] args) {
		ArrayFrequencyElements frequency=new ArrayFrequencyElements();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Array length");
		int length=scanner.nextInt();
		ArrayList<Integer> array=new ArrayList<Integer>();
		array=frequency.intputArray(length,array,scanner);
		array=frequency.frequencyOfElementsCountDecenOrder(length,array);
		System.out.println(array);

	}

	private ArrayList<Integer> frequencyOfElementsCountDecenOrder(int length, ArrayList<Integer>array) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<length;i++)
		{
			if(!map.containsKey(array.get(i)))
			{
				map.put(array.get(i), 1);
			}
			else
			{
				map.put(array.get(i), map.get(array.get(i))+1);
			}
		}
		Collections.sort(array,(a,b)->(map.get(a)==map.get(b))? a-b:map.get(b)-map.get(a));
		return array;
	}

	private ArrayList<Integer> intputArray(int length, ArrayList<Integer> array, Scanner scanner) {
		for(int i=0;i<length;i++)
		{
			System.out.println("Index : "+(i+1));
			array.add(scanner.nextInt());
		}
		return array;
	}
	

}
