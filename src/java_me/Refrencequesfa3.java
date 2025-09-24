package java_me;
import java.util.Scanner;

public class Refrencequesfa3{
	

//	static int factorial(int n){
//		if(n==0||n==1) {
//			return 1;
//		}
//		else {
//			return n*factorial(n-1);
//		}
//	}
	
	static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	
    public static void main(String[] args) {

        // FIRST QUESTION
        // System.out.print("Hello world");

        // SECOND QUESTION
//        System.out.println("Number of command-line arguments: " + args.length);
    
    	//THIRD QUESTION
//    	if(args.length>0) {
//    		System.out.print("no. of argumnets: "+args[0]);
//    	}
//    	else {
//    		System.out.print("no args");
//    	}
    	
    	//FOURTH QUESTION
//    	if(args.length==0) {
//    		System.out.println("No arguments passed");
//    	}
//    	else {
//    		System.out.println("command line arguments: ");
//    			for(int i=0;i<args.length;i++) {
//    				System.out.println(args[i]);
//    			}
//    		
//    	}
    	
    	//FIFTH QUSTION
//    	if(args.length>0) {
//    		System.out.print("OK");
//    	}
//    	else {
//    		System.out.print("Invalid args");
//    	}
    
    	//RECURSION BASED QUESTION
    	//first question
//    	Scanner sc=new Scanner(System.in);
//    	int n=sc.nextInt();
//    	System.out.print("factorial of n is: " + factorial(n));
    	
    	//second question
//    	Scanner sc=new Scanner(System.in);
//    	int n=sc.nextInt();
//        for(int i=1;i<=n;i++) {
//        	System.out.print(i);
//        }
    	
    	//THIRD QUESION
//    	Scanner sc=new Scanner(System.in);
//    	int n=sc.nextInt();
//    	int sum=0;
//    	for(int i=1;i<=n;i++) {
//    		sum+=i;
//    	}
//    	System.out.println(sum);
    			
    	
    	
    	//fourth question
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	System.out.print(fibonacci(n));
    }
    }

