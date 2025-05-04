package Orders;

import lombok.Data;

@Data
public class Address {
Coordinates coordinates;
String StreetName;
String HouseNumber;
String HousePostfix;
String PostalCode;
String City;
String Country;
}
