/**Name: Diep Tran
 * Homework Assignment 2
 * Class ID: 566
 * Description: tests the calculator class
*/

package cse360assign2;

public class maintest {
	public static void main (String[] args)
	{
		Calculator n = new Calculator();
		n.add(20);
		n.divide(2);
		n.subtract(5);
		n.divide(0);
		System.out.println(n.getTotal());
	}
	
}
