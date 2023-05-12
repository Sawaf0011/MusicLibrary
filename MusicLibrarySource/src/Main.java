public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addSongStr("Elvis Presley, That's All Right,Rock and Roll");
        menu.addSongStr("Nirvana,Smells Like Teen Spirit,Grunge");
        menu.addSongStr("John Lennon,Imagine,Rock");
        menu.addSongStr("U2,One,Rock");
        menu.addSongStr("Michael Jackson,Billie Jean,Pop");
        menu.addSongStr("Queen,Bohemian Rhapsody,Rock");
        menu.addSongStr("The Beatles,Hey Jude,Rock");
        menu.addSongStr("The Beatles,Yesterday,Rock");
        menu.addSongStr("The Beatles,Yesterday,Rock");
        menu.addSongStr("The Clash,London Calling,Punk");
        menu.printAllSongs();
        menu.showMenu();


    }
}

