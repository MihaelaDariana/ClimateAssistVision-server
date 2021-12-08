package com.example.demo.Favorites;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class FavoritesService {

    @Autowired
    private FavoritesRepository favoritesRepository;

    public Favorites addFavorites(Favorites favorites){
        return favoritesRepository.save(favorites);
    }

    public List<Favorites> getFavorites(){
        return favoritesRepository.findAll();
    }
}
