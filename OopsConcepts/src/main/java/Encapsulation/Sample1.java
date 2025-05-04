package Encapsulation;

public class Sample1 {

	public static void main(String[] args) {
Demo1 obj = new Demo1();
String a = obj.getName();
System.out.println(a);

String b = obj.getCity();
System.out.println(b);

int c = obj.getCode();
System.out.println(c);

Boolean d = obj.isGender();
System.out.println(d);

System.out.println("....................");

obj.setName("Anjali");
String a1 =obj.getName();
System.out.println(a1);

obj.setCity("Pune");
String b1 =obj.getCity();
System.out.println(b1);

obj.setCode(411014);
int c1 =obj.getCode();
System.out.println(c1);

obj.setGender(false);

boolean d1 = obj.isGender();
System.out.println(d1);


	}

}
