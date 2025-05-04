package Orders;

import lombok.Data;

@Data
public class BasicPlan {
String Resource;
String ResourceType;
String Trip;
String Time;
String PickupTerminal;
String DeliveryTerminal;
int SequenceNumber;
}
