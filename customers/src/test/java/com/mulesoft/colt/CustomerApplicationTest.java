package com.mulesoft.colt;

import com.mulesoft.colt.clients.PaymentClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,  properties = {"eureka.client.enabled=false"})
public class CustomerApplicationTest {

    @Value("${local.server.port}")
    int port;

    @MockBean
    private PaymentClient paymentClient;

    @Test
    public void getGrettings() {
        Mockito.when(paymentClient.getPayments()).thenReturn(new ArrayList<>());

        given().
                port(port).
                when().
                get("/customers/123").
                then().
                body("name",equalTo("fefe")).
                body("id",equalTo("123"));
    }


}
