package com.ntt;

import java.util.Random;

public class Helloworld {

  static char[] cArr = "*Hello world!   ".toCharArray();
  static int index = -1;
 
  public static void main(String[] args) throws InterruptedException  {
    printHellowrld();
  }
  
  public  static void printHellowrld() throws InterruptedException {
	  for (double x = 0; x <= Math.PI; x += 0.15) {
			int sinValue = (int) Math.round(Math.sin(x) * 60);
			for (int j = 0; j < sinValue; j++) {

				System.out.print(nextChar());
			}
			Thread.sleep(5);
			System.out.println();
		} 
  }

  public static char nextChar() {
	index++;
	
	if (index > cArr.length-1) {
		index = 0;

	}

	return cArr[index];
  }
}
