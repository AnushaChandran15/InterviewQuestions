package com.anushachandran1502.interviewquestions;

import java.util.Scanner;

public class NumberOfTrainsNeededStation {
	
	public static void main(String[] args) {
		NumberOfTrainsNeededStation trains=new NumberOfTrainsNeededStation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the trunAround");
		int n=scanner.nextInt();
		String[] times=new String[n];
		System.out.println("Enter the  Arrival times space seperated");
		String arrivalTimes=scanner.nextLine();
		String[] arrivals=arrivalTimes.split(" ");
		for(int i=0;i<n;i++)
		{
			times[i]=scanner.nextLine();
		}
		
	}
}
