/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;
//import java.util.*;
//
///**
// *
// * @author hritika
// */
import java.util.*;
class LL
{
    static int c=0;
    //to add and remove the elements in stack 
    static class stack 
	{ 
		int top=-1; 
		char items[] = new char[100]; 

		void push(char x) 
		{ 
			if (top == 99) 
			{ 
				System.out.println("Stack full"); 
			} 
			else
			{ 
				items[++top] = x; 
			} 
		} 

		char pop() 
		{ 
			if (top == -1) 
			{ 
				System.out.println("Underflow error"); 
				return '\0'; 
			} 
			else
			{ 
				char element = items[top]; 
				top--; 
				return element; 
			} 
		} 

		boolean isEmpty() 
		{ 
			return (top == -1) ? true : false; 
		} 
	} 
	
public static void main(String[]arg)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char arr[]=s.toCharArray();
LinkedList li=new LinkedList();
stack st=new stack();

//To add the elements in Linkedlist
//and push the elements in the stack
for(int i=0;i<arr.length;i++)
{
li.add(arr[i]);
st.push(arr[i]);
}
//to check if the linked list is pallindrome or not
for(int i=0;i<arr.length;i++)
{
if(check(st.pop(),arr[i]))
{if(c==arr.length)
    System.out.println("linked list is pallindrome");
}
else 
{
System.out.println("not pallindrome");
 break;
}
}
}
//check  method to check if the linked list is pallindrome or not
static boolean check( char char1,char char2)
{
    
if(char1==char2)
{
    c++;
return true;//print pallindrome
}
else 
    return false;//print not
}
}









