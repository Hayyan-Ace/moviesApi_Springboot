package com.example.freecodecamp.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Repository
public interface MoiveRepository extends MongoRepository<Movie, ObjectId> {

    Optional<Movie> findById(String id);
}
