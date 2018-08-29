package com.trvelr.domain;

import com.trvelr.entity.Traveler;

public interface TravelerRepository {
    Traveler findByUsername(String username);
    Traveler save(Traveler traveler);
    void delete(Traveler traveler);
}
