package serializationAnddesrialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class SerializationExample {

	public static void main(String[] args) {
try {
	Person person = new Person("John",30 );
	//creating stream to write the object to file
	FileOutputStream fileout = new FileOutputStream("Person.ser");
	ObjectOutputStream out = new ObjectOutputStream(fileout);
	//serializing the object
	out.writeObject(person);
	//closing the stream
	out.close();
	fileout.close();
	System.out.println("Object has been Serialized");
}
catch(IOException i ) {
	i.printStackTrace();
}
	}

	


}
