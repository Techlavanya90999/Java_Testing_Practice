package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class allrequest {

	public static void main(String[] args) {
//configure base uri in RestAssured usin RestAssured.baseURI = "http://localhost:3000/employees"
		RestAssured.baseURI = "http://localhost:3000/employees";
		
//get Request Specification interface object using RestAssured.given()method
		RequestSpecification abc = RestAssured.given();
		
//use header method from resquest specification object by passing content-type and application/json
		abc.header("Content-Type","Application/json");
		
		//----------------------------------------***post***------------------------------
		
		//select post method from request body
	      Response a1 = abc.post();
		
//create request body usinh json object class
		JSONObject c1 = new JSONObject();
		
//create object of json object class
		c1.put("firstName","Rayan");
	      c1.put("lastName","Patil");
	    c1.put("address","Pune");
	      c1.put("mobileNumber",909090);
	      
//convert json object into string format
	      String b1 = c1.toString();
	      
//use body method from request specification object by passing converted string request body
	      abc.body(b1); 
	      
//capture StatusCode
	 int a= a1.getStatusCode();
	 System.out.println(a);
	 
//capture statusline
	 String b = a1.getStatusLine();
	 System.out.println(b);
	 
//capture Response Time
	 long c = a1.getTime();
	 System.out.println(c);
	 
	//----------------------------------------***get***------------------------------
	 
//select get method from request body
	Response a2 = abc.get();
	
	//capture StatusCode
		 int d= a2.getStatusCode();
		 System.out.println(d);
		 
	//capture statusline
		 String e = a2.getStatusLine();
		 System.out.println(e);
		 
	//capture Response Time
		 long f = a2.getTime();
		 System.out.println(f);
		 
		//----------------------------------------***put***------------------------------
		
		 //create request body usinh json object class
		  JSONObject c2 = new JSONObject();

		//create object of json object class
          c2.put("firstName","Reshma");
	      c2.put("lastName","Shah");
	    c2.put("address","Pune");
	      c2.put("mobileNumber",999090);
	      
	    //convert json object into string format
	      String b2 = c2.toString();
	      
//by using body ()method from requestspecification object by passing request body
	      abc.body(b2);
	    abc.pathParam("id", "3");
			//select put method from request body
					 Response a3 = abc.put("{id}");
	     
	  	  //capture StatusCode
	 	 int g= a3.getStatusCode();
	 	 System.out.println(g);
	 	 
	 //capture statusline
	 	 String h = a3.getStatusLine();
	 	 System.out.println(h);
	 	 
	 //capture Response Time
	 	 long i =a3.getTime();
	 	 System.out.println(i);
	
	 	//----------------------------------------***patch***------------------------------
////create request body usinh json object class
	 	 JSONObject c3 = new JSONObject();
	 	 
	 	//create object of json object class
	 	 c3.put("address","Nagar");
	 	
	 	 //convert json object into string format
	      String b3 = c3.toString();
	 	 
	    
	    //by using body ()method from requestspecification object by passing request body
	      abc.body(b3);
	      
	     abc.pathParam("id", "3");
				//select put method from request body
						 Response a4 = abc.patch("{id}");
						 
						  //capture StatusCode
					 	 int j= a4.getStatusCode();
					 	 System.out.println(j);
					 	 
					 //capture statusline
					 	 String k = a4.getStatusLine();
					 	 System.out.println(k);
					 	 
					 //capture Response Time
					 	 long l =a4.getTime();
					 	 System.out.println(l);
					 	 
					 	//----------------------------------------***get***------------------------------
					 	 
					 	//select get method from request body
					 	Response a5 = abc.get("{id}");
					 	
					 	//capture StatusCode
					 		 int m= a5.getStatusCode();
					 		 System.out.println(m);
					 		 
					 	//capture statusline
					 		 String n = a5.getStatusLine();
					 		 System.out.println(n);
					 		 
					 	//capture Response Time
					 		 long o = a5.getTime();
					 		 System.out.println(o);	
					 		 
//----------------------------------------***delete***------------------------------
					 		 
					 		 abc.pathParam("id", "1");
					 		 //select get method from request body
							 	Response a6 = abc.delete("{id}");
							 	
							 	//capture StatusCode
							 		 int p= a6.getStatusCode();
							 		 System.out.println(p);
							 		 
							 	//capture statusline
							 		 String q = a6.getStatusLine();
							 		 System.out.println(q);
							 		 
							 	//capture Response Time
							 		 long r = a6.getTime();
							 		 System.out.println(r);	
							 		 
//------------------------***get***--------------------------------------------
							 		 
							 		//select get method from request body
									 	Response a7 = abc.get("{id}");
									 	
									 	//capture StatusCode
									 		 int s= a7.getStatusCode();
									 		 System.out.println(s);
									 		 
									 	//capture statusline
									 		 String t = a7.getStatusLine();
									 		 System.out.println(t);
									 		 
									 	//capture Response Time
									 		 long u = a7.getTime();
									 		 System.out.println(u);	
						 
						 

	 
	 
	      
		
	}

}
