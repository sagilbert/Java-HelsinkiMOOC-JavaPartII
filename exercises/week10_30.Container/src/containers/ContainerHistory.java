package containers;

/**
 *
 * @author Samuel Gilbert
 * Date: Nov 20, 2018
 */
import java.util.List;
import java.util.ArrayList;
public class ContainerHistory {
    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();

    }
    public void add(double situation) {
        this.history.add(situation);
    }
    public void reset() {
        this.history.clear();
        
    }
    public String toString() {
        return this.history.toString();
    }
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            double max = this.history.get(0);
            for (double d : this.history) {
                if (d > max) {
                    max = d;
                }
            }
            return max;
        }
    }
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            double min = this.history.get(0);
            for (double d : this.history) {
                if (d < min) {
                    min = d;
                }
            }
            return min;
        }        
    }
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (double d : this.history) {
                sum += d;
            }
            return sum / this.history.size();
        }         
    }
    public double greatestFluctuation() {
        if (this.history.size() == 1 || this.history.size() == 0) {
            return 0;
        } else {
            double diff = Math.abs(this.history.get(0) - this.history.get(1));
            for (int i = 0; i < this.history.size() - 1; i++) {
                double tempDiff = Math.abs(this.history.get(i) - this.history.get(i+1));
                if (tempDiff > diff) {
                    diff = tempDiff;
                }
            }
            return diff;
        }
    }
    public double variance() {
        if (this.history.size() == 1 || this.history.size() == 0) {
            return 0;
        }
        double avg = 0;
        for (double d : this.history) {
            avg += d;
        }
        avg = avg / this.history.size();
        double var = 0;
        for (double d : this.history) {
            var += Math.pow(d - avg, 2.0);
        }
        return var / (this.history.size() - 1);
    }
}
