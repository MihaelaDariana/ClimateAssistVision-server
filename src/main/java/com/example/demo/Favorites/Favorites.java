package com.example.demo.Favorites;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection= "favorites")
public class Favorites {
    @Id
    String id;

    String terminalId;
    Double temperature;
    String city;
    String country;
    String imageUrl;
    Double windSpeed;
    int precipitation;
    int clouds;
}
