package org.alexv.norrisapi.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.alexv.norrisapi.dto.ExtJokeDto;
import org.alexv.norrisapi.dto.ResponseJokeDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class NorrisService {
    private final RestTemplate restTemplate;

    @Value("${norris.external-api.url}")
    private String URL;

    public ResponseJokeDto getRandomJoke() {
        log.info(URL);
        var responseEntity = restTemplate.getForEntity(
                URL,
                ExtJokeDto.class
        );

        String value = "";
        try {
            value = responseEntity.getBody().getValue();
        }
        catch (NullPointerException exception) {
            exception.printStackTrace();
        }

        return ResponseJokeDto.builder().joke(value).build();
    }
}
