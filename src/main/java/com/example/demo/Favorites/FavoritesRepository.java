package com.example.demo.Favorites;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FavoritesRepository extends MongoRepository<Favorites,String> {
}
