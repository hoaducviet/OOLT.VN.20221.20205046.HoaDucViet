import java.util.Scanner;
import java.io.*;
public class bai63week1 {
	

	    public static void main(String[] args){
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Nhap vao n:");
	        int n = obj.nextInt();
	        for (int i = 1; i <= n; i++ )
	        {
	            for (int j = 1; j < (n+1-i); j++ ){
	                System.out.print(" ");
	            } 
	            for (int j = 0; j < (2*(i-1)+1); j++){
	                System.out.print("*");
	            }
	            System.out.print("\n");
	        }
	    }
	}



