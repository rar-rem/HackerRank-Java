import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//Write your code here
static boolean flag;
static int B, H;
static{
    Scanner scanner = new Scanner(System.in);
    flag = true;
    B = scanner.nextInt();
    H = scanner.nextInt();
    try{
        if (B <= 0 || H <= 0) throw new Exception("Breadth and height must be positive");
    }
    catch (Exception e) {
        System.out.println(e);
        flag = false;
    }
    scanner.close();
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

