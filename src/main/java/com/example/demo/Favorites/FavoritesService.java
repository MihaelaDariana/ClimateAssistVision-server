package com.example.demo.Favorites;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mongodb.client.model.Filters.where;

@Data
@Service
public class FavoritesService {

    @Autowired
    MongoTemplate mongoTemplate;

    //@Autowired
    //private FavoritesRepository favoritesRepository;

    public Favorites addFavorites(Favorites favorites){
        return mongoTemplate.save(favorites);
    }

    public List<Favorites> getFavorites(){
        return mongoTemplate.findAll(Favorites.class);
    }

    public List<Favorites> getFavFromId(String terminalId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("terminalId").is(terminalId));
        return mongoTemplate.find(query, Favorites.class);
    }

}
