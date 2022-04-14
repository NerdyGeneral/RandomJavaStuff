//Welcome to Xander's wonderful code of not really
//but simi-useful crap!
//Name -      System.out.println("****** by: Xcorp Information Industries (Copywrite 1987)");
//      System.out.println("                      ''Building Better Labs''");
// Shoutout to CodeHS (Even though I want to take all credit)


import java.io.*;





public class RandomButPossiblyUseful
{


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
   
   
   
   public int maxIndex(int[] arr) //Will return the index of the number that has the largest value in the string 
   {
      int temp = arr[0]; //holds begining value
      int index = 0; // will hold value of index of largest number
    
    
      for(int i = 1 ; i < arr.length ; i++) //Probably the first time in my life I have ever started an i at 1
      {
         if(temp < arr[i])
         {
            index = i;
            temp = arr[i];
         }
            
      }
      return index;
    }




}



