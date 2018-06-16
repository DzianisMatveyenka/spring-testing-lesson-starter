package com.matveyenka.dao;

import com.matveyenka.entity.Genre;
import com.matveyenka.entity.Movie;

import java.util.List;

public interface MovieDao {

    List<Movie> findAllByGenre(Genre genre);

    Movie findById(Long id);
}
