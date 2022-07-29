

public class MusicaV3 implements Comparable<MusicaV3>
{
    private String titulo;
    private String artista;
    private int duracao;
    
    public MusicaV3() {}
    
    public MusicaV3(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getArtista() {
        return this.artista;
    }
    
    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    public int getDuracao() {
        return this.duracao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public String toString() {
        return getTitulo();
    }
    
    public int compareTo(MusicaV3 m) {
        return this.titulo.compareTo(m.getTitulo());
    }
}
