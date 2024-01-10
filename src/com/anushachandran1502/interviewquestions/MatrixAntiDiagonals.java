package com.anushachandran1502.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatrixAntiDiagonals {
	
	public static void main(String[] args) {
		MatrixAntiDiagonals antiDiagonals=new MatrixAntiDiagonals();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the N*N");
		int n=scanner.nextInt();
		int[][] matrix=new int[n][n];
		matrix=antiDiagonals.matrixArrayInput(matrix,scanner);
		System.out.println(Arrays.deepToString(matrix));
		List<List<Integer>> list=matrixAntiDiagonals(matrix,n);
		System.out.println(list);
	}

	private static List<List<Integer>> matrixAntiDiagonals(int[][] matrix, int n) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
			for(int i=0;i<n;i++)
			{
				ArrayList<Integer> arr=new ArrayList<Integer>();
				arr.add(matrix[0][i]);
				int index=i-1;
				for(int j=0;j<i;j++)
				{
					arr.add(matrix[j+1][index--]);
				}
				list.add(arr);
			}
					for(int k=1;k<n;k++)
					{
						ArrayList<Integer> arr1=new ArrayList<Integer>();
						arr1.add(matrix[k][n-1]);
						int index1=k+1;
						for(int j=k+1;j<n;j++)
						{
							arr1.add(matrix[k][index1++]);
						}
						list.add(arr1);
					}
				
				return list;
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
