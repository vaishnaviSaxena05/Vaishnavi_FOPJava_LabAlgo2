package com.gl.travelling;
import com.gl.transactionsorting.*;
import java.util.Scanner;

import com.gl.transactionsorting.TransactionSorting;

public class DenominationCalculator {
	Scanner sc = new Scanner(System.in);
	private int tempamt;
	int amounttobepaid;
	public void calculate(int[]denominations, int amounttobepaid) {
		System.out.println("Enter the amount to be paid: ");
		amounttobepaid = sc.nextInt();
		int len = denominations.length;
		tempamt = amounttobepaid;
		int quotient = tempamt / denominations[len-1];
		int remainder = tempamt % denominations[len-1];
		
		for(int j=(len-1);j>0;j--){
            do {
            if(quotient>0) {
            	System.out.println("Denomination value: "+denominations[j]+"  Denomination count: "+quotient);
            }
            }while(tempamt==0);
            tempamt = tempamt - (quotient*denominations[j]);
            quotient = tempamt / denominations[j-1];
			remainder = tempamt % denominations[j-1];
		}
		if(remainder>=0) {
			System.out.println("Denomination value: "+denominations[0]+"  Denomination count: "+quotient);
		}
			
	}
	public static void main(String[] args) {
		TransactionSorting obj = new TransactionSorting();
		obj.implementation();
		DenominationCalculator obj2 = new DenominationCalculator();
		obj2.calculate(obj.denominations, obj2.amounttobepaid);
	}
	
}