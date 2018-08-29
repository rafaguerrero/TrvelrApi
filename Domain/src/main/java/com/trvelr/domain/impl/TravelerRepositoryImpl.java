package com.trvelr.domain.impl;

import com.trvelr.domain.TravelerRepository;
import com.trvelr.entity.Traveler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
public class TravelerRepositoryImpl implements TravelerRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Traveler findByUsername(String username) {
        return mongoTemplate.findOne(query(where("username").is(username)), Traveler.class);
    }

    @Override
    public Traveler save(Traveler traveler) {
        Assert.notNull(traveler, "Entity must not be null!");

        mongoTemplate.save(traveler);
        return traveler;
    }

    @Override
    public void delete(Traveler traveler) {
        Assert.notNull(traveler, "Entity must not be null!");

        mongoTemplate.remove(traveler);
    }
}
