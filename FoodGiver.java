package com.example.foodSharingg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FoodGiver {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventType;
    private String location;
    private String date;
    private int estimatedAttendees;
    private String foodType;
    private int numberOfFoodItems;
    private int numberOfPersonsServed;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getEstimatedAttendees() {
        return estimatedAttendees;
    }

    public void setEstimatedAttendees(int estimatedAttendees) {
        this.estimatedAttendees = estimatedAttendees;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getNumberOfFoodItems() {
        return numberOfFoodItems;
    }

    public void setNumberOfFoodItems(int numberOfFoodItems) {
        this.numberOfFoodItems = numberOfFoodItems;
    }

    public int getNumberOfPersonsServed() {
        return numberOfPersonsServed;
    }

    public void setNumberOfPersonsServed(int numberOfPersonsServed) {
        this.numberOfPersonsServed = numberOfPersonsServed;
    }
}

