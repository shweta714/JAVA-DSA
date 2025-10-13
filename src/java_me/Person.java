package java_me;
public class Person {
int a=5;
static int b=10;
public static void main (String[]args) {
	Person person =new Person();
	System.out.println("person value before change: "+person.a);
	Person person2=new Person();
	System.out.println("person value before change: "+person2.b);
	person.a=6;
	person2.b=11;
	System.out.println("person value after change= "+person.a);
	System.out.println("person value after change= "+person2.b);
}
}
