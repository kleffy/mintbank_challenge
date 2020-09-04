package com.kleffy.mintbank.challengeproducer.controller.cardscheme;

import com.kleffy.mintbank.challengeproducer.service.cardscheme.CardSchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/card-scheme")
public class CardSchemeController {
    private final CardSchemeService cardSchemeService;
    @Autowired
    public CardSchemeController(CardSchemeService cardSchemeService) {
        this.cardSchemeService = cardSchemeService;
    }

    @GetMapping("/verify/{cardNumber}")
    public ResponseEntity<?> verifyCard(@PathVariable String cardNumber) throws IOException, InterruptedException {
        return cardSchemeService.verifyCard(cardNumber);
    }
}
