package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		

		

		//***************************************************************************
		
		/*Q5
		 * 
		 * 
		 * 
		 * 
		 * */

		 
	}
	
	private static void question1() {
		/*Q1*************************************************************************
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result
		 */
		int x = 10, y = 8;
		int sum = 0;

		sum = x + y;
		System.out.printf("The sum of %d and %d is %d.\n\n", x, y, sum);
	}
	
	private static void question2() {
		/*Q2*************************************************************************
		 * Write a program that declares 2 double variables, assigns a number to each,
		 * and adds them together. Assign the sum to a variable. Print out the result
		 */
		
		double a=12.56, b=3.72;
		double c = 0;
		
		c = a + b;
		
		System.out.printf("The sum of %.2f and %.2f is %.2f.\n\n",a,b,c);
	}
	
	private static void question3() {
		/*Q3*************************************************************************
		 * Write a program that declares an integer variable and a double variable, 
		 * assigns numbers to each, and adds them together. Assign the sum to a variable.
		 *  Print out the result. What variable type must the sum be?*/
		int x = 25;
		double y = 50;
		
		double total = x + y;
		System.out.printf("The sum of %d and %.2f is %.2f.\nThe variable containing the sum will need to be of type double\n\n",x,y,total);
		
	}
	
	private static void question4() {
		/* Q4************************************************************************
		 * Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. 
		 * Assign the result to a variable. Print out the result. Now change the larger number to a decimal. 
		 * What happens? What corrections are needed?*/
		int x = 10, y = 8;
		int sum = y/x;
		System.out.println(sum); //sum is zero
		double d = x;//change larger number to decimal
		double total = y/d;
		 // due to change in type from int to doube I had to utilize the "total" variable 
        //to store the result, otherwise I would have had to create a new one that was compatible
		System.out.println(total);
		
	}
	
	private static void question5() {
		
	}


}
