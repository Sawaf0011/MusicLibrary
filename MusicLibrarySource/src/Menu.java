import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //this prints out a message when the program is executed to show the options the user could do
    private static String[] options = {"Quit", "Add Song", "Find Song", "Find artist", "Find genre", "Play song", "Remove song"};
    //it recalls the Musiclibrary, so we can use it later on in the menu class a
    private static MusicLibrary musicLibrary;

    //this is constructor for the static method above
    public Menu() {
        musicLibrary = new MusicLibrary();
    }


    /**
     * it prints out a message if th user entered a wrong number that is not in the options
     * @param intNum
     * @return
     */
    public Integer validInt(String intNum) {
        try {
            return Integer.parseInt(intNum);
        }
        catch (NumberFormatException e) {
            System.out.println(intNum + " is not a valid integer");
            return null;
        }
    }

    /**
     * this will make the program run the method that the user entered its
     * @return
     */
    private Integer getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select from the following options using the correct number");
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ": " + options[i]);
        }
        String choiceStr = scanner.nextLine();
        return validInt(choiceStr);
    }

    /**
     * this is a recall method that recalls the printMusiclibrary from the  class musicLibrary
     *  it can be used here in the menu class and also the main class
     */
    public void printAllSongs(){
        musicLibrary.printMusicLibrary();
    }

    /**
     * this method allows the user to enter the song that is being added to the list
     * and prints out a message to show the user the format that the song has to be added with
     */
    private void addSong() {
        //Complete and comment this method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Song that you want to add in the format of:");
        System.out.println("Artist Name, Song title, Genre");
        String songInfo = scanner.nextLine();
        musicLibrary.addNewSong(songInfo);
        printAllSongs();
    }

    /**
     * this method will recall the adddNewsong from musicLibrary to add all the songs that are set in the menu
     * @param songData
     * @return
     */
    public void addSongStr(String songData) {
        //Once the method is complete enable the method call below
        musicLibrary.addNewSong(songData);

    }

    /**
     * this method makes a new arraylist with the Song fields that are being specified
     * it recalls the musicLibrary.findSongByTitle to use it if it matches the information that is being enetered
     * if it does then it will print out the song
     * @param songStr
     * @return
     */
    private ArrayList<Song> findSong(String songStr) {
        //Complete and comment this method - make the method return the appropriate value
       ArrayList<Song> matches = musicLibrary.findSongByTitle(songStr);
        if(matches.equals(songStr)) {
            System.out.println(songStr);
        }
        return matches;
    }

    /**
     * this method will make the user search the song that they want to search for by title
     */
    private void findSongByTitle() {
        //Complete and comment this method
        System.out.println("Search Song by title ");
        Scanner scanner = new Scanner(System.in);
        String songTitle = scanner.nextLine();
        //this code is to check if the information entered matches with data in the last
        ArrayList<Song> song =findSong(String.valueOf(songTitle));
        System.out.println(song);
    }

     /**
     * this method allows the user to search song that they want to find by artist
     */
    private void findArtist() {
        //Complete and comment this method
        System.out.println("Search Song by Artist");
        Scanner scanner = new Scanner(System.in);
        String songArtist = scanner.nextLine();
        ArrayList<Song> artist = musicLibrary.findSongByArtist(songArtist);
        //the for each loop is used to print out the songs in different lines
        //if there are more than one song for the same artist
        for(Song song: artist) {
            System.out.println(song);
        }
    }

    /**
     * this method allows the user to search the song that they want to find by genre
     */
    private void findGenre() {
        //Complete and comment this method
        System.out.println("Search Song by Genre");
        Scanner scanner = new Scanner(System.in);
        String songGenre = scanner.nextLine();
        ArrayList<Song> genre = musicLibrary.findSongByGenre(songGenre);
        //the for each loop is used to print out the songs in different lines
        //if there are more than one song with the same genre
        for(Song y: genre) {
            System.out.println(y);
        }
    }

    /**
     * this method allows the user play the song that they enter
     * ,and it will change the date from 2022-1-1 to the current date
     */
    private void playSong() {
        //Complete and comment this method
        System.out.println("Search Song by title that you want to play ");
        Scanner scanner = new Scanner(System.in);
        String playNow = scanner.nextLine();
       ArrayList<Song> play = findSong(String.valueOf(playNow));
        // this is to change the date that is set to the current date (today)
       for (Song song1 : play) {
        song1.setLastPlayed(LocalDate.now());
        System.out.println(song1);
       }

    }


    /**
     *this method lets the user enter the song that he wants to remove
     */
    private void removeSong() {
        //Complete and comment this method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search Song by title that you want to remove ");
        String removeNow = scanner.nextLine();
        ArrayList<Song> remove = findSong(removeNow);
        //the is statement is used with the arraylist so when the arraylist is empty which mean song is not found
        //it asks the user to enter the song correctly
        if (remove.isEmpty()){
            System.out.println("Please enter the title of the Song correctly");
        }else {
            musicLibrary.removeSong(removeNow);
        }
    }





    public void showMenu() {
        boolean usingLibrary = true;
        while (usingLibrary) {
            Integer choice = getChoice();
            if (choice != null && choice < options.length) {
                switch(choice) {
                    case 0:
                        usingLibrary = false;
                        break;
                    case 1:
                        addSong();
                        break;
                    case 2:
                        findSongByTitle();
                        break;
                    case 3:
                        findArtist();
                        break;
                    case 4:
                        findGenre();
                        break;
                    case 5:
                        playSong();
                        break;
                    case 6:
                        removeSong();
                        break;
                }
                //Once the code is complete enable the method below
                //musicLibrary.printLibrary();
            } else {
                System.out.println("Not a valid choice");
            }

        }
    }
}
