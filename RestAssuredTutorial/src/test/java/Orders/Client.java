package Orders;

import lombok.Data;

@Data
public class Client {
String ContactName;
String Phone;
String CompanyName;
OpeningHours openingHours;
Address address;
String ExtraTime;
}
