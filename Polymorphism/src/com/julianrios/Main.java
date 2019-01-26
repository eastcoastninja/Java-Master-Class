package com.julianrios;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws"); // initializes the name field from the movie class through inheritance
    }

    public String plot () {
        return "A shark eats lots of people";
    }

}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunnner extends Movie {

    public MazeRunnner() {
        super("Maze Runnner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable () {
        super("Forgetable");
    }

    // No plot method
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i< 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : "
                    + movie.getName() +"\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1; // returns a number between 0 to 4 + 1
        System.out.println("Random number generated was: " + randomNumber);

        switch(randomNumber) {
            // no need to insert break since returning on the first line
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunnner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
        }

        return null; // handles if outside of the range of 0 to 5
    }
}
