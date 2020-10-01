package com.company;
import java.lang.reflect.Array;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
		Random genarator = new Random();
		int a;
		 a = genarator.nextInt(25);
		System.out.println("a is :");
		System.out.println(a);
		System.out.println("---------------");
	if (a %2 ==0){
        System.out.println("a is even ...");
    }
	else {
	    System.out.println("a is odd ...");
	}
		System.out.println("---------------");
		System.out.println( "random array is ...");
	int[] numbers = new int[a];
	for (int i=0 ; i<25 ;i++){
		numbers[i]=genarator.nextInt(25);
		System.out.println(numbers[i]);
	}
    }
}
