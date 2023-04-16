package com.basf.periodictableservice.components.adapter.rest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.basf.periodictableservice.Api;
import com.basf.periodictableservice.components.adapter.rest.dto.ComponentDetailsResponse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(classes = Api.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class ComponentsControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void whenCallGetHydrogenComponent_theReturnAtomicNumber1() {
        assertTrue(this.restTemplate
                    .getForObject("http://localhost:" + port + "/v1/components/H", ComponentDetailsResponse.class).getAtomicNumber() == 1);  
    }

}
