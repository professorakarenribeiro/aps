class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Playlist playlist = Playlist.getInstance();
    playlist.adicionarMusica("Bohemian Rhapsody");
    playlist.adicionarMusica("Stairway to Heaven");
    playlist.mostrarPlaylist();
  }
}