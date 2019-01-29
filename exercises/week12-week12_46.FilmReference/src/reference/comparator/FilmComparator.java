package reference.comparator;

import java.util.*;
import reference.domain.*;

/**
 *
 * @author Samuel Gilbert
 * Date: Dec 7, 2018
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> ratings;
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        return this.avg(ratings.get(o2)) - this.avg(ratings.get(o1));
    }
    public int avg(List<Rating> ratings) {
        int sum = 0;
        for (Rating r : ratings) {
            sum += r.getValue();
        }
        return sum/ratings.size();
    }
}
