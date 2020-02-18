package U5.T2.U2;

import java.util.Comparator;

public class CompararEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return (((Cliente)o1).edad-((Cliente)o2).edad);
    }
}
