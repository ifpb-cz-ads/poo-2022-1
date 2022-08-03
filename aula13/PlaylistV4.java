
import java.util.*;

public class PlaylistV4
{
    public static void main(String[] args) {
        PlaylistV4 playlist = new PlaylistV4();
        List<MusicaV3> musicas = playlist.getMusicas();
        System.out.println(musicas);
        Collections.sort(musicas);
        System.out.println(musicas);
        
        ArtistaComparator artComparator = new ArtistaComparator();
        Collections.sort(musicas, artComparator);
        System.out.println(musicas);
        
        DuracaoComparator durComparator = new DuracaoComparator();
        Collections.sort(musicas, durComparator);
        System.out.println(musicas);
        
        // Collections.sort(musicas, new Comparator<MusicaV3>() {
           // public int compare(MusicaV3 m1, MusicaV3 m2) {
               // return m1.getDuracao() - m2.getDuracao();
           // }
        // });
        
        Collections.sort(musicas, (m1, m2) -> m1.getDuracao() - m2.getDuracao());
        System.out.println(musicas);
        // Set não ordenado
        Set<MusicaV3> musicaSet = new HashSet<>(musicas);
        System.out.println(musicaSet);
        // Set ordenado por titulo
        Set<MusicaV3> musicaTreeSet = new TreeSet<>(musicas);
        System.out.println(musicaTreeSet);
        // Set ordenado por artista
        Set<MusicaV3> musicaTreeSetArtista = new TreeSet<>(
            (m1, m2) -> m1.getArtista().compareTo(m2.getArtista())
        );
        musicaTreeSetArtista.addAll(musicas);
        System.out.println(musicaTreeSetArtista);
        
        Map<String, String> musicasMap = playlist.getMusicasMap();
        System.out.println(musicasMap);
    }
    
    public List<MusicaV3> getMusicas() {
        return MusicasMock.getMusicasV3Dupes();
    }
    
    public Set<MusicaV3> getMusicasSet() {
        return MusicasMock.getMusicasSet();
    }
    
    public Map<String, String> getMusicasMap() {
        return MusicasMock.getMusicasMap();
    }
}
