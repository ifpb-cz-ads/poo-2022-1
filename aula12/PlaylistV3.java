
import java.util.*;

public class PlaylistV3
{
    public static void main(String[] args) {
        List<MusicaV3> musicas = new PlaylistV3().getMusicas();
        System.out.println(musicas);
        Collections.sort(musicas);
        System.out.println(musicas);
    }
    
    public List<MusicaV3> getMusicas() {
        return MusicasMock.getMusicasV3();
    }
}
