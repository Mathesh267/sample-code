/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String args[]){
	    int arr[]={1,2,4,6,3,7,8};
	    Arrays.sort(arr);
	    int num=1;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!=num){
	            System.out.println("The missing number is "+num);
	            return;
	        }
	        num++;
	    }
	}
}
