package com.trvelr.domain;

import com.trvelr.entity.Trip;
import com.trvelr.entity.Traveler;

import java.util.List;


public interface TripRepository {
    Trip save(Trip trip);

    Trip findByUrl(String url);
    List<Trip> findLatests();
    List<Trip> findLatests(List<String> travelers);
    List<Trip> findByTraveler(Traveler traveler);
    List<Trip> findByTraveler(Traveler traveler, int numberOfTrips);
    List<Trip> findByTag(String tag);

    void removeAllTripsByTraveler(Traveler traveler);
}
