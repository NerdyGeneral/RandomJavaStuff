//Welcome to Xander's wonderful code of not really
//but simi-useful crap!
//Name -      System.out.println("****** by: Xcorp Information Industries (Copywrite 1987)");
//      System.out.println("                      ''Building Better Labs''");
// Shoutout to CodeHS (Even though I want to take all credit)


import java.io.*;
import java.util.ArrayList;




/* Contents
1).  Reverse Capitalization
---Array---
2).  Search Int Array
3).  Maximum Int value in Array
4).  Sum an Int Array
5).  Sum only even in an Int Array
6).  Return true if every elemement in array is odd
7).  Takes an int array and turns it into a string
8).  Reverse a String Array
9).  Move A String array up 1 EX: [1][2][3] ---> [3][1][2]
10). Streak Finder (Finds the largest streak of same numbers in a row)
---ArrayList---
11). Words that Start with a specified Letter, Returning ArrayList
12). More 1's or 0's returns t (if more ones) or f


*/


public class RandomButPossiblyUseful
{



   // 1).  ----------------------------------------------------


   public static String reverseCap(String text) // reverseCap inverts the capitalization of a word EX: (Bob --> bOB) 

   {
      String finnal = "";
      char transfer;
    
    
      for(int i = 0; i < text.length(); i++)
      {
            
              transfer = text.charAt(i);
            
            if(Character.isUpperCase(transfer))
               {
                    transfer = Character.toLowerCase(transfer);
               }
            else if((Character.isLowerCase(transfer)))
               {
                    transfer = Character.toUpperCase(transfer);
               }
            
            
            finnal = finnal + transfer;
            
        }
    
       return finnal;
   }
   
   
   // 2). ----------------------------------------------------
   
   
   public int searchArray(int[] arrayToSearch, int intToFind) //Searches an Array to find a specific int, returns index of int if found else returns -1
   {
      for(int i = 0 ; i < arrayToSearch.length ; i++)
      {
         if(arrayToSearch[i] == intToFind)
         {
            return i;
         }
      }
    
    return -1;
   }
   
   // 3). ----------------------------------------------------
   
   public int maxIndex(int[] arr) //Will return the index of the number that has the largest value in the array 
   {
      int temp = arr[0]; //holds begining value
      int index = 0; // will hold value of index of largest number
    
    
      for(int i = 1 ; i < arr.length ; i++) //Probably the first time in my life I have ever started an i at 1  UPDATE: I have now been starting 'i' at one and a few other places, I was wrong
      {
         if(temp < arr[i])
         {
            index = i;
            temp = arr[i];
         }
            
      }
      return index;
   }
    
   // 4). ----------------------------------------------------
    
    
   public int sumArray(int[] arrayToSum) //Will sum an Array
   {
      int total = 0;
    
      for(int i = 0 ; i < arrayToSum.length ; i++)
      {
         total = total + arrayToSum[i];
      }
      
      return total;
   }
   
   
   // 5). ----------------------------------------------------

   
   public int sumEvens(int[] arrayToSum) //Returns the Sum of even numbers only
   {
      int total = 0;
    
      for( int i = 0 ; i < arrayToSum.length ; i++)
      {
         if (arrayToSum[i] % 2 == 0)
         {
            
            total = total + arrayToSum[i];
            
         }
      }
      return total;
   }
   
   // 6). ----------------------------------------------------

   public boolean oddArray(int[] arr) //Will return true if every element in array is odd 
   {
      boolean isOdd = true;
    
      for( int i = 0 ; i < arr.length ; i++)
      {
         if (arr[i] % 2 == 0)
         {
            
            isOdd = false;
            
         }
      }
    
      return isOdd;
   }

   // 7).----------------------------------------------------

   public String intArrayToString(int[] intArray) //Will take an array of int {1,4,2,3} and return them as a string [1, 2, 3, 4]
   {
    
      String holder = "[";
      int numbo = 0;
    
      for( int i = 0 ; i < intArray.length ; i++)
      {
         numbo = intArray[i];
         holder = holder + numbo + ", ";
      }
    
      if( holder.length() > 1) // Yes I could have just made an if statement to stop comma placement in the for loop
      {
         holder = holder.substring(0, holder.length() - 2);
      }
    
      holder = holder + "]";
    
    
      return holder;
    }

   // 8).----------------------------------------------------
   
   public String[] reverse(String[] arr) //Returns a reversed String array {bob, ross} --> {ross, bob}
   {
      
      String[] holdTwo = new String[arr.length];
      int current = 0;
    
      for( int i = arr.length - 1 ; i > 0  ; i--)
      {  
         holdTwo[current] = arr[i];
         current++;
      }
      
      
      holdTwo[holdTwo.length-1] = arr[0];
    
      return holdTwo;    
   }

   // 9).----------------------------------------------------
   
   public String[] moveUp(String[] arr) //Returns a string array "moved up" I.e. Every item in the array is moved forward 1
   {
    
      String[] holdTwo = new String[arr.length];
      String hold = arr[arr.length-1];
    
      for(int i = 1; i < arr.length; i++ )
      {
         holdTwo[i] = arr[i-1];
      }
        
      holdTwo[0] = hold;
    
      return holdTwo;
   }
    
   // 10).---------------------------------------------------
   
   public int streak(String[] arr) //Takes a string and finds the larges "Streak" EX: ['b','a','a','a','t'] Would be 3 as there are 3 a's in a row, they must be together.
   {
      int streak = 1;
      int final_streak = 0;
    
      for(int i = 1; i < arr.length; i++)
      {
         if( arr[i].equals(arr[i-1]))
         {
            streak++;
         }
         else
         {
            streak = 1;
         }
        
         if(final_streak < streak)
         {
            final_streak = streak;
         }
      }
      return final_streak;
   }
   
   // 11).---------------------------------------------------
   
   public ArrayList<String> wordsThatStartWith(ArrayList<String> words, String letter) //Searches for words that start with a specific letter Returns an ARRAYLIST
   {
    
      ArrayList<String> finalList = new ArrayList<String>();
    
      String hold = "";
      for(int i = 0; i < words.size(); i++)
      {
         
         if(words.get(i).indexOf(letter) == 0)
         {
            finalList.add(words.get(i));
         }
        
      }
      
      return finalList;
   }

   // 12).---------------------------------------------------
  
   public boolean more1s(ArrayList<Integer> numbers) //Will go through an ArrayList and see if it has more 0's or 1's, Returning false if the arraylist consists more of 0's and 'true' if it contains more 1's
   {
    
      int zero = 0;
      int one = 0;
    
      for(int i = 0 ; i < numbers.size() ; i++ )
      {
         if(numbers.get(i) == 0)
         {
            zero++;
         }
        
         if(numbers.get(i) == 1)
         {
            one++;
         }
        
      }
    
      if(one > zero)
      {
         return true;
      }
      else
      {
         return false;
      }
    
   }

   // 13).---------------------------------------------------

    
}










