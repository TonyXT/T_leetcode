import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
       int a=A.length();
       int b=B.length();
       String s1=A.toLowerCase();
       String s2=B.toLowerCase();     
       
        byte[] b1 = s1.getBytes();  
        byte[] b2 = s2.getBytes();  
          
        int bCount[]=new int[256];  
        for(int i=0;i<256;i++){  
            bCount[i]=0;  
        }  
          
        for(int i=0;i<b1.length;i++){  
            bCount[b1[i]-'0']++;  
        }  
        for(int i=0;i<b2.length;i++){  
            bCount[b2[i]-'0']--;  
        }  
        
       for(int i=0;i<256;i++){
           if(bCount[i]!=0) return false;  
       }
              return true;
       }

      //Complete the function
   
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}