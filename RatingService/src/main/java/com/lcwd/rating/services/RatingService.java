package com.lcwd.rating.services;

import com.lcwd.rating.entities.Ratings;

import java.util.List;

public interface RatingService {

    // create
    Ratings create(Ratings rating);


    //get all rating
    List<Ratings> getRatings();

    // get all by userId
    List<Ratings> getRatingByUserId(String userId);

    //get all by hotel
    List<Ratings> getRatingByHotelId(String hotelId);
}
