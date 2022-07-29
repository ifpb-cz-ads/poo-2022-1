
import java.util.*;

public class PlaylistV2
{
    public static void main(String[] args) {
        List<MusicaV1> musicas = new PlaylistV2().getMusicas();
        System.out.println(musicas);
        //Collections.sort(musicas); nao compila!!!
        System.out.println(musicas);
    }
    
    public List<MusicaV1> getMusicas() {
        return MusicasMock.getMusicasV2();
    }
}
