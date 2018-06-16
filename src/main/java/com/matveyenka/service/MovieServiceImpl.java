package com.matveyenka.service;

import com.matveyenka.dao.MovieDao;
import com.matveyenka.entity.Genre;
import com.matveyenka.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieDao movieDao;

    @Autowired
    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public int getCountByGenre(Genre genre) {
        return movieDao.findAllByGenre(genre).size();
    }

    @Override
    public Movie findById(Long id) {
        return movieDao.findById(id);
    }
}
