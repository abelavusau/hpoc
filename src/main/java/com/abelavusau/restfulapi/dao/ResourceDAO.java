package com.abelavusau.restfulapi.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.abelavusau.restfulapi.model.Resource;

@Repository
public interface ResourceDAO extends MongoRepository<Resource, Long> {
}