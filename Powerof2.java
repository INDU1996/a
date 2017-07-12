package indu;

class Test
{
 
 static boolean isPowerOfTwo (int x)
 {
   
     return x!=0 && ((x&(x-1)) == 0);
      
 }
  

 public static void main(String[] args) 
 {
      System.out.println(isPowerOfTwo(31) ? "Yes" : "No");
      System.out.println(isPowerOfTwo(17) ? "Yes" : "No");
      System.out.println(isPowerOfTwo(16) ? "Yes" : "No");
      System.out.println(isPowerOfTwo(2) ? "Yes" : "No");
      System.out.println(isPowerOfTwo(18) ? "Yes" : "No");
      System.out.println(isPowerOfTwo(1) ? "Yes" : "No");
 }
}

