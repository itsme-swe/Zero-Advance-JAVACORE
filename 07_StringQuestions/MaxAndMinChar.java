/**
 🔸 Find the maximum and minimum occuring character in given string. Well below approach is brute force approach but for optimized approach we can use map.
 */
public class MaxAndMinChar {

    public static void main(String[] args) {
         
        String s = "abaccbaad";

         int max = Integer.MIN_VALUE;

         int[] arr = new int[127];

         char c = ' ';

         for (int i = 0; i < s.length(); i++){
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
         }

         for (int i = 0; i < s.length(); i++){
            if (max < arr[s.charAt(i)]){
                max = arr[s.charAt(i)];
                c = s.charAt(i);
            }
         }
         System.out.printf("The maximum character in the given string is '%c' with the count of %d",c, max);
        
    }
}

/*
🔸Output: The maximum character in the given string is 'a' with the count of 4
 */