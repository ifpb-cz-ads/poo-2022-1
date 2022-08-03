import java.util.*;

public class ArtistaComparator implements Comparator<MusicaV3>
{
    public int compare(MusicaV3 m1, MusicaV3 m2) {
        return m1.getArtista().compareTo(m2.getArtista());
    }
}
