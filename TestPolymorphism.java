// Karen Morales
// 06/04/19

// Module 9 Problem 3



class Bank{  
	float getRateOfInterest(){return 0;}  
}  
class SBI extends Bank{  
	float getRateOfInterest(){return 8.4f;}  
}  
class ICICI extends Bank{  
	float getRateOfInterest(){return 7.3f;}  
}  
class AXIS extends Bank{  
	float getRateOfInterest(){return 9.7f;}  
} 
class KZMM extends Bank {
  float getRateofInterest() {return 6.4f;}
}

    
public class TestPolymorphism{  
	public static void main(String args[]){  
		Bank b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
      	b=new KZMM();  
		System.out.println("KZMM Rate of Interest: "+b.getRateOfInterest());
      
	}  
}


