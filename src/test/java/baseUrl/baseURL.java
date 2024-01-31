package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import utilities.ConfigReader;

public class baseURL {

    public RequestSpecification specification;

    @BeforeTest
    public void setUpBaseURL(){

        specification = new RequestSpecBuilder().
                setBaseUri(ConfigReader.getProperty("baseURL")).
                build();
    }
}
