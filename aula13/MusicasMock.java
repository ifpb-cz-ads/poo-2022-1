
import java.util.*;
import static java.util.Map.entry;

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
    
    public static List<MusicaV3> getMusicasV3() {
        List<MusicaV3> musicas = new ArrayList<MusicaV3>(); 
        musicas.add(new MusicaV3("seven nation army", "the white stripes", 180));
        musicas.add(new MusicaV3("XO", "beyoncé", 320));
        musicas.add(new MusicaV3("@@@@@", "arca", 600));
        musicas.add(new MusicaV3("50 words for snow", "kate bush", 360));
        
        return musicas;
    }
    
    public static List<MusicaV3> getMusicasV3Dupes() {
        List<MusicaV3> musicas = new ArrayList<MusicaV3>(List.of(
            new MusicaV3("seven nation army", "the white stripes", 180),
            new MusicaV3("XO", "beyoncé", 320),
            new MusicaV3("@@@@@", "arca", 600),
            new MusicaV3("50 words for snow", "kate bush", 360)
        )); 
        musicas.add(new MusicaV3("seven nation army", "the white stripes", 180));
        musicas.add(new MusicaV3("seven nation army", "the white stripes", 180));
        musicas.add(new MusicaV3("XO", "beyoncé", 320));
        musicas.add(new MusicaV3("XO", "beyoncé", 320));
        musicas.add(new MusicaV3("@@@@@", "arca", 600));
        musicas.add(new MusicaV3("@@@@@", "arca", 600));
        musicas.add(new MusicaV3("50 words for snow", "kate bush", 360));
        musicas.add(new MusicaV3("50 words for snow", "kate bush", 360));
        
        return musicas;
    }
    
    public static Set<MusicaV3> getMusicasSet() {
        Set<MusicaV3> musicas = new HashSet<>();
        musicas.add(new MusicaV3("seven nation army", "the white stripes", 180));
        musicas.add(new MusicaV3("seven nation army", "the white stripes", 180));
        musicas.add(new MusicaV3("XO", "beyoncé", 320));
        musicas.add(new MusicaV3("XO", "beyoncé", 320));
        musicas.add(new MusicaV3("@@@@@", "arca", 600));
        musicas.add(new MusicaV3("@@@@@", "arca", 600));
        musicas.add(new MusicaV3("50 words for snow", "kate bush", 360));
        musicas.add(new MusicaV3("50 words for snow", "kate bush", 360));
        
        return musicas;
    }
    
    public static Map<String, String> getMusicasMap() {
        Map<String, String> musicas = new HashMap<>(Map.of(
            "the white stripes", "seven nation army",
            "beyoncé", "XO",
            "arca", "@@@@@"
        ));
        
        Map<String, String> musicasEntries = new HashMap<>(Map.ofEntries(
            entry("the white stripes", "seven nation army"),
            entry("beyoncé", "XO"),
            entry("arca", "@@@@@")
        ));
        // musicas.put("the white stripes", "seven nation army");
        // musicas.put("the white stripes", "apple blossom");
        // musicas.put("beyoncé", "XO");
        // musicas.put("arca", "@@@@@");
        
        return musicas;
    }
}
