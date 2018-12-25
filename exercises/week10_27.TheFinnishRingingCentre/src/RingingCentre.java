/**
 *
 * @author Samuel Gilbert
 * Date: Nov 19, 2018
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre {
    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();   

    }
    public void observe(Bird bird, String place) {
        if (this.observations.containsKey(bird)) {
            this.observations.get(bird).add(place);
        } else {
            
            this.observations.put(bird, new ArrayList<String>());
            this.observations.get(bird).add(place);
        }
    }
    public void observations(Bird bird) {
        if (this.observations.containsKey(bird)) {
            System.out.println(bird.getLatinName() + 
                    " (" + bird.getRingingYear() +
                    ") " + "observations: " + 
                    this.observations.get(bird).size());
            if (this.observations.get(bird).size() !=0) {
                for (String str : this.observations.get(bird)) {
                    System.out.println(str);
                }
            }
        } else {
            System.out.println(bird.getLatinName() + 
                    " (" + bird.getRingingYear() +
                    ") " + "observations: 0");
        }
    }
            
}
