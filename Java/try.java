import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//Write your code here
//Write your code here
static boolean flag=false;
static int B,H;
static{
 Scanner in= new Scanner(System.in);
 B=in.nextInt();
 H=in.nextInt();
 try{
  if(B<=0||H<=0)
   throw new Exception("Breadth and height must be positive");
  else{
   flag= true;
  }
 }
 catch(Exception e){
  System.out.println(e);
 }
} 

public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        
    }//end of main

}//end of class
