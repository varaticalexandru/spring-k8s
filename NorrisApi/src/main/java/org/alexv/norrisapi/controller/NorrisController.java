package org.alexv.norrisapi.controller;

import lombok.RequiredArgsConstructor;
import org.alexv.norrisapi.dto.ResponseJokeDto;
import org.alexv.norrisapi.service.NorrisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokes")
@RequiredArgsConstructor
public class NorrisController {

    private final NorrisService norrisService;

    @GetMapping("/random")
    public ResponseEntity<ResponseJokeDto> getRandomJoke() {
        return ResponseEntity.ok(norrisService.getRandomJoke());
    }
}
