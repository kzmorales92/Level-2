// Karen Morales
// 5/14/19
// Module 6 Problem 6
// – Create an object of a class and access it in another class. This will give an example of better organization of classes
// (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)). 
// The name of the java file should match the class name. In this problem create two files in the same directory: sampleClass.java and otherClass.java. otherClass.java should hold the main().

public class sampleClass6 
{
  int x = 5;
  int y = 3;
}
class OtherClass 
{
  
  public static void main(String[]args)
  {
    sampleClass6 sampleObject = new sampleClass6();
    sampleClass6 sampleObject2 = new sampleClass6();
    System.out.println(sampleObject.x);
    System.out.println(sampleObject2.y);
  }
}

