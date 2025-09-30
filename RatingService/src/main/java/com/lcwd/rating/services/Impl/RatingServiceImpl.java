package com.lcwd.rating.services.Impl;

import com.lcwd.rating.entities.Ratings;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Ratings create(Ratings rating) {
//        rating.setRatingId(UUID.randomUUID().toString());
        return ratingRepository.save(rating);
    }

    @Override
    public List<Ratings> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Ratings> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Ratings> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

    // create

}
