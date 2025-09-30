package com.lcwd.rating.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("user-ratings")
public class Ratings {
    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private String feedback;
    private int rating;

}
