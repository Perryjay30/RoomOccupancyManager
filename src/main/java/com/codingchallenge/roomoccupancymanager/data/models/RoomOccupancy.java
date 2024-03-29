package com.codingchallenge.roomoccupancymanager.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomOccupancy {
    private int premiumOccupied;
    private int economyOccupied;
    private double totalEarningsForPremium;
    private double totalEarningsForEconomy;
    private double overallEarningsForTheNight;

}
