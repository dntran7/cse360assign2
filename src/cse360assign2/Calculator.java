/**Name: Diep Tran
 * Homework Assignment 2
 * Class ID: 566
 * Description: performs addition subtraction
 * division or multiplication and keeps a record of its 
 * calculations
*/
package cse360assign2;


/**Class Name: Calculator
 * Description: Contains a default constructor and 
 * methods that perform addition subtraction division
 * or multiplication and keeps a record of its 
 * calculations
*/
public class Calculator {

	private int total;
	
	/**Constructor for Calculator class
	 * Default
	 * Description: Sets total to 0
	*/
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**Method getTotal()
	 * @param none
	 * @return integer variable total 
	 * Description: returns total
	*/
	public int getTotal () {
		return total;
	}
	
	/**Method add()
	 * @param integer variable "value"
	 * @return void
	 * Description: adds value to total
	*/
	public void add (int value) {
		total = total + value;
	}
	
	/**Method subtract()
	 * @param integer variable "value"
	 * @return void
	 * Description: subtracts value from total
	*/
	public void subtract (int value) {
		total = total - value;
	}
	
	/**Method multiply()
	 * @param integer variable "value"
	 * @return void
	 * Description: multiplies value with total
	*/
	public void multiply (int value) {
		total = total * value;
	}
	
	/**Method divide()
	 * @param integer variable "value"
	 * @return void
	 * Description: divides total by value, 
	 * if value = 0 then
	 * total will be set to 0
	*/
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = (int)(total / value);
		}
	}
	
	/**Method add()
	 * @param void
	 * @return String variable
	 * Description: returns history log of previous calculations
	*/
	public String getHistory () {
		return "";
	}
}