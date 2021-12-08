package com.example.demo.Favorites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoritesController {
    @Autowired
    private FavoritesService favoritesService;

    @PostMapping("/")
    public Favorites addFavorites(@RequestBody Favorites favorites){
        return favoritesService.addFavorites(favorites);
    }

    @GetMapping("/")
    public List<Favorites> getFavorites(){
        return favoritesService.getFavorites();
    }

    @GetMapping("/get")
    public List<Favorites> getFavFromId(@RequestParam("terminalId") String terminalId) {
        return favoritesService.getFavFromId(terminalId);
    }
}
