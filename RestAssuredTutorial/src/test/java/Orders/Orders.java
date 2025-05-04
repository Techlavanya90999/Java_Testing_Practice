package Orders;

import lombok.Data;

@Data
 class Orders {
	String OrderLineID;
	String CustomerId;
	String Name;
	String ServiceCode;
	String OrderComment;
	String ActivityComment;
	String OrganizationCode;
	Boolean RestrictOnOrganisationCode;
	Boolean IsUnrestricted;
	int Priority;
	String ContainerType;
	int NumberOfBins;
	String OrderedDateFrom;
	String OrderedDateTo;
	String Trucks ;
	Client client;
	OrderInfotexts orderInfotexts;
	ActivityInfotexts activityInfotexts;
	BasicPlan basicPlan;
}
	
	
	


