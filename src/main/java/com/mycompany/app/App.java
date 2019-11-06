package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public int f() {
	    return 1;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	for (int i = 0; i < 100; i++) {
		if (i % 15 == 0) {
			System.out.println("fizzbuzz");
		} else if (i % 5 == 0) {
			System.out.println("buzz");
		} else if (i % 3 == 0) {
			System.out.println("fizz");
		} else {
			System.out.println(i);
		}
	}
    }
}
