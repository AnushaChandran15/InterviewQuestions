package com.anushachandran1502.interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfSquare {
	public static void main(String[] args) {
		NumberOfSquare square=new NumberOfSquare();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the N*N");
		int n=scanner.nextInt();
		int[][] array=new int[n][n];
		array=square.matrixArrayInput(array,scanner);
		int squareCount=square.squareCountInSquare(n,array);
		System.out.println(squareCount);
	}
	private int squareCountInSquare(int n, int[][] array) {
		System.out.println(Arrays.deepToString(array));
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j+1<n && array[i][j]==1 && array[i][j+1]==1)
				{
					if(i+1<n && array[i+1][j]==1 && array[i+1][j+1]==1)
					{
						count++;
					}
				}
			}
		}
		return count;
	}
	private int[][] matrixArrayInput(int[][] matrix, Scanner scanner) {
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.println("Index : "+ i+j);
				matrix[i][j]=scanner.nextInt();
			}
		}
		return matrix;
	}
}
