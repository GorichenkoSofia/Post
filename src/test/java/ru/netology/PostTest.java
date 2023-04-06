package ru.netology;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class postmanEcho {

    @Test
    void shouldTestSomeData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Vesna")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Vesna"))
        ;
    }


    public Object equalsTo(String body) {
        return true;
    }
}

