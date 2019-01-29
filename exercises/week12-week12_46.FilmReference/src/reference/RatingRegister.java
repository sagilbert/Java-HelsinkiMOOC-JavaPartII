package reference;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 6, 2018
 */
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import reference.domain.*;
public class RatingRegister {
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personRatings;
    public RatingRegister() {
        this.filmRatings = new HashMap<Film, List<Rating>>(); 
        this.personRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    public void addRating(Film film, Rating rating) {
        if (filmRatings.containsKey(film)) {
            filmRatings.get(film).add(rating);
        } else {
            filmRatings.put(film, new ArrayList<Rating>());
            filmRatings.get(film).add(rating);
        }
    }
    
    public List<Rating> getRatings(Film film) {
        if (filmRatings.containsKey(film)) {
            return filmRatings.get(film);
        } else {
            return null;
        }
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if (personRatings.containsKey(person)) {
            if (!(personRatings.get(person).containsKey(film))) {
                personRatings.get(person).put(film, rating);
                this.addRating(film, rating);
            }
        } else {
            personRatings.put(person, new HashMap<Film, Rating>());
            personRatings.get(person).put(film, rating);
            this.addRating(film, rating);
        }
    }
    
    public Rating getRating(Person person, Film film) {
        if (personRatings.containsKey(person) && personRatings.get(person).containsKey(film)) {
            return personRatings.get(person).get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personRatings.containsKey(person)) {
            return personRatings.get(person);
        } else {
            return new HashMap<Film, Rating>();
        }        
    }
    
    public List<Person> reviewers() {
        ArrayList<Person> toReturn = new ArrayList<Person>();
        for (Person p : personRatings.keySet()) {
            toReturn.add(p);
        }
        return toReturn;
    }
    
    public List<Film> getAllFilms() {
        ArrayList<Film> allFilms = new ArrayList<Film>();
        for (Film f : filmRatings.keySet()) {
            allFilms.add(f);
        }
        return allFilms;
    }
}
