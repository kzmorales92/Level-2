// Karen Morales
// 05/28/19

// Module 8 Problem 1-3 

// Set the object within the Person class as private, create a getter and setter for the class, and create a main that
// will create a new object from the person class. 

public class Person {
public static void main(String[]args)
{
   Person obj = new Person();
    
    obj.setName("Karen");
    
    
    System.out.println("Name:" + obj.getName());
}
  

  private String name;
  
  public String getName()
  {
    return name;
  }
  public void setName (String newName)
  {
    
    name =newName;
  }
}




  
