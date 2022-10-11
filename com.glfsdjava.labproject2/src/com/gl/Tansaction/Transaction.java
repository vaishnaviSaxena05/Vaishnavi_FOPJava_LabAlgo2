package com.gl.Tansaction;

import java.util.Scanner;

public class Transaction {
	Scanner sc = new Scanner(System.in);
	public  int transactionArray[];
	 int targetNumber;
	 int targetValue;
	
	 void implimentation() {
     insertValue();
	}

	public  void insertValue() {
		
		System.out.println("enter the size of transaction array");
		int size =sc.nextInt();
		int transactionArray[]= new int[size];
		System.out.println("enter the values :");
		for(int index=0; index<size;index++) {
			 transactionArray[index]= sc.nextInt();
		}
		
		this.transactionArray = transactionArray;
		}
	
	
}
