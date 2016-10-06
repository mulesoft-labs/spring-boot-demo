package com.mulesoft.colt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,  properties = {"eureka.client.enabled=false"})

public class PaymentsApplicationTest {

    @Value("${local.server.port}")
    int port;


    @Test
    public void getGrettings() {
        given().
                port(port).
                param("customerId", "d8960d30-8a63-11e6-ae22-56b6b6499611").
                when().
                get("/payments").
                then().
                body("[0].customerId",equalTo("d8960d30-8a63-11e6-ae22-56b6b6499611"));
    }


}
