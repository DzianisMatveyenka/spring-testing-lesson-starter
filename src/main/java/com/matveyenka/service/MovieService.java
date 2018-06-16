package com.matveyenka.service;

import com.matveyenka.entity.Genre;
import com.matveyenka.entity.Movie;

public interface MovieService {

    int getCountByGenre(Genre genre);

    Movie findById(Long id);
}
