import java.util.*;

public class DuracaoComparator implements Comparator<MusicaV3>
{
    public int compare(MusicaV3 m1, MusicaV3 m2) {
        return m1.getDuracao() - m2.getDuracao();
    }
}
