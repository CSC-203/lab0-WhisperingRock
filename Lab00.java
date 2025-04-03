public class Lab00
{
   public static void main(String[] args)
   {
      // Declaring and Initializing Variables
      int x = 5;
      String y = "hello";
      double z = 9.8;

      // Printing the Variables
      System.out.println("x:" + x + " y:" + y + " z:" + z);

      // Make an array in Java
      int nums[] = {3, 6, -1, 2};
      for(int i = 0; i < nums.length; i++){System.out.println(nums[i]);}

      // Call a function
      int numFound = char_count(y, 'l');
      System.out.println("Found:" + numFound);

      // A counting `for` loop
      for(int i = 1; i < 11; i++)
      {
         System.out.print(i + " ");
      }
   }

   private static int char_count(String y, char l)
   {
      int count = 0;
      for(int i = 0; i < y.length(); i++)
      {
         if(y.charAt(i) == l){count++;}
      }
      return count;
   }
}
   


