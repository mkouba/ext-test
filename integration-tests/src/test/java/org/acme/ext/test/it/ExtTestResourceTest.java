package org.acme.ext.test.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ExtTestResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/ext-test")
                .then()
                .statusCode(200)
                .body(is("Hello ext-test"));
    }
}
