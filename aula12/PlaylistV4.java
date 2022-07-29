
import java.util.*;

public class PlaylistV4
{
    public static void main(String[] args) {
        List<MusicaV3> musicas = new PlaylistV4().getMusicas();
        System.out.println(musicas);
        Collections.sort(musicas);
        System.out.println(musicas);
        
        ArtistaComparator artComparator = new ArtistaComparator();
        Collections.sort(musicas, artComparator);
        System.out.println(musicas);
        
        DuracaoComparator durComparator = new DuracaoComparator();
        Collections.sort(musicas, durComparator);
        System.out.println(musicas);
        
        //Collections.sort(musicas, new Comparator<MusicaV3>() {
        //    public int compare(MusicaV3 m1, MusicaV3 m2) {
        //        return m1.getDuracao() - m2.getDuracao();
        //    }
        //});
        
        Collections.sort(musicas, (m1, m2) -> m1.getDuracao() - m2.getDuracao());
        System.out.println(musicas);
    }
    
    public List<MusicaV3> getMusicas() {
        return MusicasMock.getMusicasV3();
    }
}
