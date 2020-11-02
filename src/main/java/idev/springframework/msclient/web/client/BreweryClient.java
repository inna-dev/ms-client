package idev.springframework.msclient.web.client;

import java.util.UUID;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import idev.springframework.msclient.web.model.BeerDto;

@ConfigurationProperties(prefix = "idev.brewery", ignoreUnknownFields = false)
@Component
public class BreweryClient {
    public static final String BEER_PATH_V1 = "/api/v1/beer/";
    private String apiHost;
    private final RestTemplate restTemplate;

    public BreweryClient(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

    public BeerDto getBeerById(UUID uuid) {
        return restTemplate.getForObject(apiHost + BEER_PATH_V1 + uuid.toString(), BeerDto.class);
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

}
