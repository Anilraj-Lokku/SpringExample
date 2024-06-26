import java.util.Comparator;

public class LaunchedDateComparator implements Comparator<Mobile> {
    @Override
    public int compare(Mobile m1, Mobile m2) {
        return m1.getLaunchedDate().compareTo(m2.getLaunchedDate());
    }
}
