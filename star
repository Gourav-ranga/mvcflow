  
package com.ticket.spring.controller;

import java.util.Scanner;

public class GoruDada {

	public static void Star(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(j<size-i-1) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int size = sc.nextInt();
		Star(size);
	}
}
