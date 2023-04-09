package com.codingchallenge.roomoccupancymanager.data.models;

import lombok.Data;

@Data
public class RoomAvailability {
//    private List<Double> potentialGuests;
    private int availablePremiumRooms;
    private int availableEconomyRooms;
}
