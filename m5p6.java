// Karen Morales
// 5/14/19
// Module 5 Problem 6
// Problem 6 – Create and print an example of each of the following Java logical operators: &&, ||, and !.

public class m5p6
{
  public static void main(String[]args)
  {
    int x = 10;
    System.out.println(x < 15 && x > 5);
    System.out.println( x < 5 || x > 8);
    
    System.out.println(! (x < 15 || x > 8));
  }
}

    