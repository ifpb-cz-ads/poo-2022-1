
import java.util.*;

public class MusicasMock
{   
    public static List<String> getMusicasV1() {
        List<String> musicas = new ArrayList<>();
        musicas.add("seven nation army");
        musicas.add("XO");
        musicas.add("@@@@@");
        musicas.add("50 words for snow");
        
        return musicas;
    }
    
    public static List<MusicaV2> getMusicasV2() {
        List<MusicaV2> musicas = new ArrayList<MusicaV2>(); 
        musicas.add(new MusicaV2("seven nation army", "the white stripes", 180));
        musicas.add(new MusicaV2("XO", "beyoncé", 320));
        musicas.add(new MusicaV2("@@@@@", "arca", 600));
        musicas.add(new MusicaV2("50 words for snow", "kate bush", 360));
        
        return musicas;
    }
    
    public static List<MusicaV3> getMusicasV3() {
        List<MusicaV3> musicas = new ArrayList<MusicaV3>(); 
        musicas.add(new MusicaV3("seven nation army", "the white stripes", 180));
        musicas.add(new MusicaV3("XO", "beyoncé", 320));
        musicas.add(new MusicaV3("@@@@@", "arca", 600));
        musicas.add(new MusicaV3("50 words for snow", "kate bush", 360));
        
        return musicas;
    }
}
