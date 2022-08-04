package co.anbu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of number to Give Input : ");
		int n = sc.nextInt();
		if(n>0 && n<20) {
			int num[] = new int[n];
			String[] strNum;
			System.out.println("Enter the Numbers : ");
			strNum = bi.readLine().split(" ");
			for(int i=0; i<strNum.length; i++) {
				num[i] = Integer.parseInt(strNum[i]);
			}
			System.out.println(Arrays.toString(num));
			int max = num[0];
			int min = num[0];
			for(int i=0; i<num.length;i++) {
				if(num[i]>max) {
					max = num[i];
				}
				if(num[i]<min) {
					min = num[i];
				}
			}
			System.out.println(min+"::"+max);
			
		}
		else
			System.out.println("INVALID NUMBER");

	}

}
