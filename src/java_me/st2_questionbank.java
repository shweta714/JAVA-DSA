
//PRINTING NAME USING COMMAND LINE ARGUMENT
//package java_me;
//public class st2_questionbank {
//	public static void main(String[]args) {
//		if(args.length>0) {
//			System.out.print("hello"+args[0]);
//		}
//		else {
//			System.out.print("hello guest");
//		}
//		
//	}
//}


//TAKE TWONUMBERS AS CLI AND PRINT THERE SUM
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		if(args.length>2) {
//			int a =Integer.parseInt(args[0]);
//			int b=Integer.parseInt(args[1]);
//			System.out.print(a+b);
//		}
//		
//	}
//}



//SWAP TWO INTEGERS WITHOUT USING TEMPORARAY VARIABLE
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		int a=5;
//		int b=6;
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println(a);
//	}
//}



//SWAP TWO NUMBERS WITHOUT USING TEMP VARIABLE
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		int a=5;
//		int b=6;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		
//	}
//}



//TO CHECK IF NUMBER IS EVEN OR ODD USING BITWISE OPERATOR
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		int num=5;
//		System.out.println((num & 1)==0?"even":"odd");
//	}
//}



//PRINT ASCII VALUE OF CHARACTER
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		char c='B';
//		System.out.println((int)c);
//	}
//}



//COMPUTE AREA OF CIRCLE
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		double r=3.2;
//		double area=3.14*r*r;
//		System.out.println("Area of circle is:"+area);
//	}
//}

//CONVERT FARHENHEIT TO CELSIUS
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		double f=98.6;
//		double c=(f-32)*5/9;
//		System.out.println("temprature is:"+c);
//	}
//}


//FIND MAX OF TWO NUM USING TERINARY OPERATORS
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		int a=5;
//		int b=9;
//		System.out.print((a>b)?a:b);
//	}
//}



//CHCEK IF A ACHARCTER IS UPPERCASE
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		char c='a';
//		System.out.println(c>='A'&& c<='Z');
//	}
//}





//package java_me;
//public class st2_questionbank {
//	public static byte reverseBits(byte b) {
//		byte result = 0;
//		for (int i = 0; i < 8; i++) {
//		result = (byte)((result << 1) | (b & 1));
//		b = (byte)(b >> 1);
//		}
//		return result;
//		}
//
//	public static void main(String[]args) {
//		System.out.println(reverseBits((byte)0b11001001));
//	}
//}



//CHECK IF A NUMBER IS POWER OF 2;
//package java_me;
//
//public class st2_questionbank {
//	public static void main(String[]args) {
//		int n=8;
//		System.out.println(n > 0 && (n & (n - 1)) == 0);
//	}
//}


//find missing number in an array of 1 to n;
package java_me;
public class st2_questionbank {
	public static void main(String[]args) {
		int[] arr= {1,3,4,5,6,7,8};
		int n=arr.length+1;
		int expected=n*(n+1)/2;
		int actual=0;
		for(int i=0;i<arr.length;i++) {
			actual+=arr[i];
		}
		System.out.print(expected-actual);
		

	}
}