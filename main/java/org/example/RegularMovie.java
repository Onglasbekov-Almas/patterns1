package org.example;
abstract class Movie {
    protected String title;
    public abstract String getType();
    public String getTitle() { return title; }
}

class RegularMovie extends Movie {
    public RegularMovie(String title) { this.title = title; }
    @Override
    public String getType() { return "Regular"; }
}

interface MovieFactory {
    Movie createMovie(String title);
}

class RegularMovieFactory implements MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}
