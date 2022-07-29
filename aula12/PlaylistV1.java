
import java.util.*;

public class PlaylistV1
{
    public static void main(String[] args) {
        List<String> musicas = new PlaylistV1().getMusicas();
        System.out.println(musicas);
        Collections.sort(musicas);
        System.out.println(musicas);
    }
    
    public List<String> getMusicas() {
        return MusicasMock.getMusicasV1();
    }
}
