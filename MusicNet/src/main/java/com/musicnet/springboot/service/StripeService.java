package com.musicnet.springboot.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.musicnet.springboot.model.ChargeRequest;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;

@Service
public class StripeService {
 
    //@Value("${STRIPE_SECRET_KEY}")
    private String secretKey = "sk_test_51Gs5e0Fa9TRbJ1I5rAwflQXR60N7cZwf9V4fZnwOQ2iR8kxxBfUYRaxuQ7khz1zUAOXsbvcEuInxWiCn0kxosMFj00S6xjHxqW";
     
    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;
    }
    public Charge charge(ChargeRequest chargeRequest) 
      throws AuthenticationException, InvalidRequestException,
        APIConnectionException, CardException, APIException {
        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount", chargeRequest.getAmount());
        chargeParams.put("currency", chargeRequest.getCurrency());
        chargeParams.put("description", chargeRequest.getDescription());
        chargeParams.put("source", chargeRequest.getStripeToken());
        return Charge.create(chargeParams);
    }
}