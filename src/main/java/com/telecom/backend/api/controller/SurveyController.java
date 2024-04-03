package com.telecom.backend.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.backend.api.dto.SurveyResponseDto;

@RestController
public class SurveyController {

    @PostMapping("/survey")
    public void handleSurveyResponse(@RequestBody SurveyResponseDto surveyResponseDto) {
        System.out.println("Survey Response Received:");
        System.out.println("surveyId: " + surveyResponseDto.getSurveyId());
        System.out.println("customerId: " + surveyResponseDto.getCustomerId());
        System.out.println("productName: " + surveyResponseDto.getProductName());
        System.out.println("stars: " + surveyResponseDto.getStars());
        System.out.println("reviewText: " + surveyResponseDto.getReviewText());
        System.out.println("customerPhone: " + surveyResponseDto.getCustomerPhone());
    }
}