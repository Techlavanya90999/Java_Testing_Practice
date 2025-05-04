package ModelAPILayer;

import lombok.Data;
//create pojo class
@Data
public class CustomerClass {
	private String fullName;

	private String email;

	private String phone;

	private Boolean gender;

	private Float product_price;

	private String city;

	private Integer pincode;

	private String state;

	private String country;

}
