// Karen Morales
// 5/14/19
// Module 6 Problems 1-5
// Problem 1 – Create a class called “sampleClass” with an interger variable x.

// Problem 2 – Extend Problem 1 by creating an object called “sampleObject” and print the value of x.

// Problem 3 – Extend Problem 2 by creating a second object called “sampleObject2” and print out the value.

// Problem 4 – Extend Problem 3 by adding a second integer attribute “y” to sampleClass.

// Problem 5 – Extend Problem 4 by adding a line that accesses and prints the attributes using dot syntax.

public class sampleClass 
{
  int x = 5;
  int y = 3;  
  public static void main(String[]args)
  {
    sampleClass sampleObject = new sampleClass();
    sampleClass sampleObject2 = new sampleClass();
    System.out.println(sampleObject.x);
    System.out.println(sampleObject2.y);
  }
}