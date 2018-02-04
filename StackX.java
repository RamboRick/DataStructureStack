package stackTest;
import java.io.*;
public class StackX {
	private int maxSize;// size of stack size
	private char[] stackArray;
	private int top; // top of stack
	
	public StackX(int s){
		maxSize =s;  //set array size
		stackArray = new char[maxSize]; // create Array
		top = -1; // no item yet
	}
	
	public void push(char j){
		stackArray[++top] = j; //increment top, insert item
	}
	
	public char pop(){
		return stackArray[top--];
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize -1);
	}
}
