import java.lang.*;

public class Lab00
{
   public static void main(String[] args)
   {
        // declaring and initializing variables
        int x = 5;
        String y = "hello";
        double z = 9.8;
        
        // printing the variables
        System.out.println("x: " + x + " y: " + y + " z: " + z);

        // makimg an array
        int[] nums = {3, 6, -1, 2};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // calling a function
        int numFound = charCount(y, 'l');
        System.out.println("Found: " + numFound);

        // counting for loop
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static int charCount(String s, char c)
    {
        int count = 0;
        // System.out.println(c);
        // System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count += 1;
            }
        }
        return count;
    }
}
