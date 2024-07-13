package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
//import static org.gradle.wrapper.GradleWrapperMain;

public class PostmanEchoTest {
    @Test
    void shouldReturnHeaderCode() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("headers", hasKey("accept"))
        ;
    }
}

