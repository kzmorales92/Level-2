// Karen Morales
// 06/04/19



class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
class Dog extends Animal
{
  public void animalSound()
  {
    System.out.println("The dog says: woff");
  }
}
class Cat extends Animal 
{
  public void animalSound()
  {
    System.out.println("The cat says: meow");
  }
}
public class animalClass 
{
  public static void main(String[] args)
  {
    Animal pigobj = new Pig();
    Animal catobj = new Cat();
    Animal dogobj = new Dog();
    
   pigobj.animalSound();
   catobj.animalSound();
   dogobj.animalSound();
    
    
    
  }
}

