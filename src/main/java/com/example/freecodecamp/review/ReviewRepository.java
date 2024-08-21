package com.example.freecodecamp.review;

import com.example.freecodecamp.movies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Movie, ObjectId> {


    Review insert(Review review);
}
