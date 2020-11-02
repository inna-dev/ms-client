package idev.springframework.msclient.web.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import idev.springframework.msclient.web.model.BeerDto;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;


    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());

        assertNotNull(dto);
    }



}