package projeto.api;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class Actions {
	
	String baseUrl = "https://portal.vr.com.br/api-web/comum/enumerations/VRPAT";

    
	public void acessarApi() {
		
			given().relaxedHTTPSValidation()

		    .when()
		      .get(baseUrl)

			.then()
			
			  .log().all()
			  .statusCode(200)
			  .extract().response();
			
			 

	}

	public void ValidarStatusCodeId() {
		given().relaxedHTTPSValidation()

	    .when()
	      .get(baseUrl)

		.then().body(containsString("typeOfEstablishment"));
		
   }
    
}
