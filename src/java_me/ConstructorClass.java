//DEFAULT constructor is in which there is no body ("constructorclass(){  }")this should not be here

//package java_me;
//public class ConstructorClass {
//public static void main( String[] args) {
//	ConstructorClass constructorClass =new ConstructorClass();//jvm automatically adds constructor in class known as default constructor
//	System.out.println("my class");
//}
//}



//NON-PARAMETERIZED CONSTRUCTOR
//package java_me;
//public class ConstructorClass {
//	void ConstructorClass() {
//		System.out.println("constructor");
//	}
//public static void main( String[] args) {
//	ConstructorClass constructorClass =new ConstructorClass();
//}
//}


//PARAMETERIZED CONSTRUCTOR
//package java_me;
//public class ConstructorClass {
//	ConstructorClass (String a,String b) {//in constructor typr should not be defined like dont write void
//		System.out.println( a+b);
//	}
//public static void main( String[] args) {
//	ConstructorClass constructorClass =new ConstructorClass("shweta","jha");
//}
//}


//CONSTRUCTOR OVERLOADING= can make multiple constructor of same name  but parameters should be different
package java_me;
public class ConstructorClass {
	ConstructorClass () {
		System.out.println("non parameterized constructor");
	}
	ConstructorClass (int a) {
		System.out.println("int value="+a);
	}
	ConstructorClass (String a,String b) {
		System.out.println( a+b);
	}
	ConstructorClass (int a,String b) {
		System.out.println( a+b);
	}
	ConstructorClass (String a,int b) {
		System.out.println( a+b);
	}
	ConstructorClass (int a,int b) {
		System.out.println( a+b);
	}
public static void main( String[] args) {
	ConstructorClass constructorClass =new ConstructorClass("shweta ",84);

}
}