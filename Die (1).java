// Karen Morales
// 5/21/2019
// Module 7 Program 4

import java.util.*;

public class Die
{
   private int lastValue;
   private ArrayList<Integer> die_list = new ArrayList<Integer>(10);
  

   public int roll()
   {
      lastValue = (int) (Math.random() * 6) + 1;
      die_list.add(lastValue);	
      return lastValue;
   }

   public static void main(String[] args)
   {
      Die d = new Die();
      for (int i = 0; i < 10; i++)
      {
         System.out.println(d.roll());
      }
   }
 }
