package com.codingchallenge.roomoccupancymanager.services;

import com.codingchallenge.roomoccupancymanager.data.models.RoomAvailability;
import com.codingchallenge.roomoccupancymanager.data.models.RoomOccupancy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RoomManagerTest {

    @Autowired
    private RoomManager roomManager;

    @Test
    public void testThatAvailableRoomsForTheProvidesTheDesiredResult() {
        RoomAvailability availability = new RoomAvailability();
        availability.setAvailablePremiumRooms(3);
        availability.setAvailableEconomyRooms(3);
        RoomOccupancy result = roomManager.makeReservation(availability);
        assertEquals(3, result.getPremiumOccupied());
        assertEquals(3, result.getEconomyOccupied());
        assertEquals(738.0, result.getTotalEarningsForPremium());
        assertEquals(167.99, result.getTotalEarningsForEconomy());
        assertEquals(905.99, result.getOverallEarningsForTheNight());
    }


}