package com.telecom.backend.api.dto;

public class SurveyResponseDto {
    private Integer surveyId;
    private Integer customerId;
    private String productName;
    private Integer stars;
    private String reviewText;
    private String customerPhone;
    public Integer getSurveyId() {
        return surveyId;
    }
    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Integer getStars() {
        return stars;
    }
    public void setStars(Integer stars) {
        this.stars = stars;
    }
    public String getReviewText() {
        return reviewText;
    }
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    
    

}
