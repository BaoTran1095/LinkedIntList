/******************************************************************************
 *       Class: LinkedIntList
 * Super Class: Object (Implicit)
 *  Implements: None
 *
 * Programmer: Robert Main

 * Revision     Date                          Release Comment
 * --------  ----------  ------------------------------------------------------
 *   1.0     05/31/2014  Initial Release
 *   1.1	 03/08/2015	 added strech method
 * Class Description
 * -----------------
 * Simple first version of LinkedIntList with just a constructor and methods
 * for "add" and "toString".
 *
 * ----------------------------- Public Interface -----------------------------
 *     Method                               Description
 * ---------------  -----------------------------------------------------------
 * LinkedIntList()  Default Constructor: Sets "front" of Linked List ot "null"
 * add()            Adds an "int" value to the end of the linked list
 * size()           RETurns number of LinkNode objects in the Linked List object
 * toString()       RETurns "String" description of "LinkedIntList" object
 * strech()			strech the numbers in this list to the desired time
 * ------------------------- Private Data Members -----------------------------
 *               Data
 *    Type       Type     Name                    Description
 * ----------  --------  ------  ----------------------------------------------
 * non-static  ListNode  front   Reference, ListNode object, front of the List
 *
 ******************************************************************************
 */
package Project9;
public class LinkedIntList
{
	// Public Interface
	// 1. Constructors
	//    A. Default Constructor
	//       post: constructs an empty list
	public LinkedIntList()
	{
		front = null;
	}

	
	// 2. Mutator Methods
	//    A. add(int)
	//       post: appends the given value to the end of the list
	public void add(int value)
	{
		if (front == null)
		{
			front = new ListNode(value);
		}
        	else
		{
			ListNode current = front;
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}
	
	// 3. Observer Methods
	//    A. size()
	//       post: RETurns number of ListNodes in the Linked List
	public int size()
	{
		int size = 0;
    	
		ListNode current = front;
    	
		while (current != null)
		{
			++size;
			current = current.next;
		}

		return size;
	}

	
	// 4. Virtual (late binding) Methods: Extensions of class "Object"
	//    B. toString()
	//       post: returns comma-separated, bracketed version of list
	public String toString()
	{
		if (front == null)
		{
            		return "[]";
		}
		else
		{
			String result = "[" + front.data;
			ListNode current = front.next;
			while (current != null)
			{
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
		}
	}
	
	
	
	
	
	
	//5.strech the numbers in this list to the disired time
	public void strech(int strechNum){
		int localNum = 1;
		ListNode current = front;
		int curData = current.data;
		if(strechNum <=0){
			front = null;
		}else{
			while(current!= null){
				curData = current.data;
				while(localNum < strechNum){
					localNum++;
					current.next =new ListNode(curData, current.next); 
					current = current.next;
					
				}
				localNum =1;
				current= current.next;
				
			}
			
		}
	}
	
	
	
	
	// Private Class Data Members
	// 1. Variable Declarations
	private ListNode front;  // first "ListNode" object in the LinkedList

}	// End Class Definition: LinkedIntList
