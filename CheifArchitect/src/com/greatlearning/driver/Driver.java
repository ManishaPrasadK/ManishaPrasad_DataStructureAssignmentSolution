package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.SkyScraper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the total no of floors in the building:");
		Scanner sc=new Scanner(System.in);
		int noOfFloors=sc.nextInt();
		int[] listOfFloors=new int[noOfFloors];
		for (int i = 0; i < noOfFloors; i++) {
			System.out.println("Enter the floor size given on day:"+(i+1));
			int floorSize=sc.nextInt();
			listOfFloors[i]=floorSize;	
		}
		System.out.println("The order of construction is as follows");
		SkyScraper.calculateFloors(listOfFloors);;
	}

}
