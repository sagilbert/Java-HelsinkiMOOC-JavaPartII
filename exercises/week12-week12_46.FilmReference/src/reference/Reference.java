package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.domain.*;
import reference.comparator.*;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 7, 2018
 */
public class Reference {
    private RatingRegister ratingRegister;
    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }
    public Film recommendFilm(Person person) {
        if (ratingRegister.filmRatings().isEmpty()) {
            return null;
        }
        //if we don't knowk anything about the person
        if (!(ratingRegister.reviewers().contains(person))) {
            List<Film> allFilms = new ArrayList<Film>(ratingRegister.filmRatings().keySet());
            Collections.sort(allFilms, new FilmComparator(ratingRegister.filmRatings()));
            return allFilms.get(0);
        }
        
        //we need to build a list of all other people sorted by similarness;
        Map<Person, Integer> nearnessMap = new HashMap<Person, Integer>();
        
        for (Person p : ratingRegister.reviewers()) {
            if (p != person) {
                nearnessMap.put(p, measureNearness(person, p));
            }
        }
        List<Person> otherPeople =  new ArrayList<Person>(nearnessMap.keySet());
        Collections.sort(otherPeople, new PersonComparator(nearnessMap));
        
        for (Person p : otherPeople) {
            List<Film> favoritesList = new ArrayList<Film>(ratingRegister.getPersonalRatings(p).keySet());
            for (Film f : favoritesList) {
                if (!(ratingRegister.getPersonalRatings(person).containsKey(f)) && 
                        ratingRegister.getPersonalRatings(p).get(f).getValue() > 0) {
                    return f;  
                }
            }
        }
        
        return null;
        
        
    }
    
    private int measureNearness(Person person, Person compareTo) {
        int nearness = 0;
        //all the films that person has reviewed 
        Set<Film> ratedFilms = ratingRegister.getPersonalRatings(person).keySet();
        for (Film f : ratedFilms) {
            try {
                nearness = nearness + 
                        ratingRegister.getPersonalRatings(person).get(f).getValue()*
                        ratingRegister.getPersonalRatings(compareTo).get(f).getValue();
            } catch (Exception e) {
                ;
            }
        }
        return nearness;
    }
    
    
}
