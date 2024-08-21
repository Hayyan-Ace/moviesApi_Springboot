package com.example.freecodecamp.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MoiveRepository moiveRepository;

    public List<Movie> allMovies(){
        return moiveRepository.findAll();
    }
    public Optional<Movie> singleMovie(ObjectId id){
        return moiveRepository.findById(id);
    }


}
