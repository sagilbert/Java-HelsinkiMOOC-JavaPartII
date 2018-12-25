import containers.*;
public class Main {

    public static void main(String[] args) {
// the well known way:
// the well known way:
ContainerHistory mh = new ContainerHistory();
mh.add(7.0);
mh.add(-2.0);
mh.add(1.0);
mh.add(2.0);
mh.add(5.0);
mh.add(11.0);
        System.out.println(mh.variance())  ;
    }

}
