import java.util.ArrayList;

public class Playlist {

  private static Playlist instance;

  private ArrayList<String> musicas;

  private Playlist() {
    musicas = new ArrayList<>();
  }

  public static Playlist getInstance() {
    if (instance == null) {
      instance = new Playlist();
    }
    return instance;
  }

  public void adicionarMusica(String musica) {
    musicas.add(musica);
  }

  public void excluirMusica(String musica) {
    musicas.remove(musica);
  }

  public void limparPlaylist() {
    musicas.clear();
  }

  public void mostrarPlaylist() {
    for (String musica : musicas) {
      System.out.println(musica);
    }
  }
}
