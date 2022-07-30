package com.greatlearning.services;

import java.util.Arrays;
import java.util.Stack;

public class SkyScraper {
	static boolean largestNumber;
	static boolean addFlag;
	
	public static void calculateFloors(int[] floorSize) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < floorSize.length; i++) {
			largestNumber=true;
			int floorSize_i=floorSize[i];
			for (int j = i; j < floorSize.length; j++) {
				if(j==i) {
					continue;
				}
				else {
					int floorSize_j=floorSize[j];
					if(floorSize_i>=floorSize_j) {
						largestNumber=true;
						continue;
					}
					else {
						largestNumber=false;
						stack.push(floorSize_i);
						break;
					}
				}
				
			}
			if(largestNumber==true) {
				try {
					Stack stackTmp=displayFloor(stack,floorSize_i,i,floorSize);
					stack.clear();
					stack=(Stack<Integer>) stackTmp.clone();
					stackTmp.clear();
					System.out.println();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("Day "+(i+1)+":");
			}
			
		}
	}
	public static Stack displayFloor(Stack stack,int currentFloor,int itera, int[] arrayFloor) {
		int[] arrayOfPoppedItems = new int[arrayFloor.length];
		int count=0;
		System.out.print("Day "+(itera+1)+":"+currentFloor);
		Stack<Integer> stackTmp=new Stack<Integer>();
		boolean largestInStack;
		if(itera==arrayFloor.length-1) {
			while(!stack.empty()) {
				int popFloor=(int) stack.pop();
				arrayOfPoppedItems[count++]=popFloor;
			}
			if(arrayOfPoppedItems!=null) {
				Arrays.sort(arrayOfPoppedItems);
				for(int i=arrayOfPoppedItems.length-1;i>0;i--) {
					if(arrayOfPoppedItems[i]!=0) {
						System.out.println(" "+arrayOfPoppedItems[i]);
					}
				}
			}
			return stackTmp;
		}
		else {
			if(!stack.empty()) {
				while(!stack.empty()) {
					largestInStack=true;
					int popFloor=(int)stack.pop();
					for(int i=itera;i<arrayFloor.length;i++) {
						if(i==itera) {
							continue;
						}
						if(popFloor<arrayFloor[i]) {
							stackTmp.push(popFloor);
							largestInStack=false;
							break;
						} else {
							largestInStack = true;
						}
					}
					if (largestInStack == true) {
						arrayOfPoppedItems[count++] = popFloor;
					}
				}
			}
			if (arrayOfPoppedItems != null) {
				Arrays.sort(arrayOfPoppedItems);
				for (int i = arrayOfPoppedItems.length - 1; i > 0; i--) {
					if (arrayOfPoppedItems[i] != 0) {
						System.out.print(" " + arrayOfPoppedItems[i]);
					}
				}
			}
			return stackTmp;
		}
				
	}
}
