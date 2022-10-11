package com.gl.transactionsorting;
import java.util.Scanner;
public class TransactionSorting {
	Scanner sc = new Scanner(System.in);
	public int[] denominations;
	int size, initialPoint=0, min, i;
	boolean status= false;
	
	public void implementation() {

		insertValues();

		do {
			sortValues();
			status = checkStatus();

		}while(status==false);

	}
	public void insertValues() {
		System.out.println("enter the number of denomination:");
		size = sc.nextInt();
		int[] denominations= new int[size];
		System.out.println("Enter the denominations:-");
		for(int i=0; i<size;i++) {
			denominations[i]= sc.nextInt();
		}
		
		this.denominations = denominations;


	}
	public void sortValues() {
		if (initialPoint<(denominations.length-1)) {
			if(denominations[initialPoint]<denominations[initialPoint+1]) {
				min = initialPoint;
			}
			else {
				min= initialPoint+1;
			}
			for(i=initialPoint+1;i<denominations.length;i++) {
				if(denominations[min]>denominations[i]) {
					min=i;
				}
			}
			int temp = denominations[initialPoint];
			denominations[initialPoint]=denominations[min];
			denominations[min]= temp;
			initialPoint +=1;

		}

	}
	public void printvalue() {
		for(int x: denominations) {
			System.out.println(x+"");
		}
	}
	public boolean checkStatus() {
		for(int i=0; i<size-1;i++) {
			if(denominations[i]>denominations[i+1]) {
				status= false;
				return status;
			}
		}
		return true;
	}
}











