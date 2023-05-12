import java.util.ArrayList;

public class MusicLibrary {
    //Complete this class following the directions given, Use the exact method and field names specified

    //this is an arrayList that stores all the objects in the Song class
    public ArrayList <Song> allSongs;

    //this is a constructor for the arraylist

    public MusicLibrary() {
        allSongs = new ArrayList<>();
    }


    /**
     * this method add song to the ArrayList "allsong"
     * @param songDataStr
     * @return
     */
    public void addNewSong(String songDataStr) {
        Song song = new Song(songDataStr);
        allSongs.add(song);
        System.out.println("Song has been added successfully");
    }

    /**
     * this method prints the arraylist which is called allSongs in the form of toString in Song
     */
    public void printMusicLibrary(){
        for (Song x : allSongs){
                System.out.println(x);
            }
        }

    /**
     * this method helps to find a song  by artist name and add it to a new arraylist
     * when it finds the song that matches with the artist name will return an array list contain it
     * if it did not find the song by the artist name the list will be empty
     * which will make it print out a message saying artist not found
     * @param artist
     * @return
     */
    public ArrayList<Song> findSongByArtist(String artist){
        ArrayList<Song> artistName = new ArrayList<>();
        for (Song song: allSongs){
            if(song.getArtistName().equals(artist) ){
                artistName.add(song);
            }
        }
        if(artistName.isEmpty()){
            System.out.println("Artist not found");
        }
        return artistName;
    }



    /**
     *this method helps to find a song  by its genre and add it to a new array list
     * when it finds the song that matches with the song will return an array list contain it
     *if it did not find the song by the genre the list will be empty
     *which will make it print out a message saying genre not found
     * @param genre
     * @return
     */
    public ArrayList<Song> findSongByGenre(String genre){
        ArrayList<Song> genreType = new ArrayList<>();
        for (Song song: allSongs){
            if(song.getGenre().equals(genre) ){
                genreType.add(song);
            }
        }
        if (genreType.isEmpty()){
            System.out.println("Genre is not found");
        }
        return genreType;
    }

    /**
     * this method will find a song by the title of it
     * and then return the song as an ArrayList by itself
     * if it did not find it this mean the ArrayList is empty
     * which will print out a message confirming song is not found
     * @param title
     * @return
     */
    public ArrayList<Song> findSongByTitle(String title){
        ArrayList<Song> songsTitle = new ArrayList<>();
        for(Song song1: allSongs) {
            if (song1.getSongTitle().equals(title)) {
                System.out.println("Song found");
                songsTitle.add(song1);
            }
        }
        if(songsTitle.isEmpty()) {
            System.out.println("song not found");
        }
        return songsTitle;
    }




    /**
     * this method will find a song then it will remove
     * after it removes the song it will print out a message confirming that it removed the song
     * @param title
     * @return
     */
    public void removeSong(String title) {
        this.allSongs.removeIf(song -> song.getSongTitle().equals(title));
        printMusicLibrary();
        System.out.println("Song is removed SuccessFully");
    }

}








