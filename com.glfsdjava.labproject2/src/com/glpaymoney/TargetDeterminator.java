package com.glpaymoney;
import java.util.Scanner;
import com.gl.Tansaction.*;
public class TargetDeterminator {
	Scanner sc = new Scanner(System.in);
	int targetNumber, targetValue, sum, flag;
	public  void targetValue(int[]transactionArray) {
		System.out.println("Enter the total number of targets that needs to be achieved: ");
		targetNumber = sc.nextInt();

		System.out.println("enter the target value:");
		targetValue = sc.nextInt();

		flag = 0;
		sum = 0 ;
		for(int index=0; index<transactionArray.length; index++) {

			sum += transactionArray[index];

			if(sum>=targetValue) {
				System.out.println("Target achieved after "+(index+1)+" transactions");
				flag =1;
				break;
			}
			
			}
		if(flag==0) {
			System.out.println("Given target is not achieved!");
		}
	}
public static void main(String[] args) {
	 Transaction obj = new Transaction();
	 obj.insertValue();
	 TargetDeterminator obj2 = new TargetDeterminator();
	 obj2.targetValue(obj.transactionArray);
}
}
