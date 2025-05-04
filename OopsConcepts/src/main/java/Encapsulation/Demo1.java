package Encapsulation;

public class Demo1 {
private String name = "Anand" ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
private String city = "Pune";
private int code = 411014;
private boolean gender = true;

}
