import java.time.LocalDate;
import java.util.ArrayList;

public class Song {
    //Complete this class following the directions in the assessment brief
    //the fields that we have to set to use for the rest of the program
    private String artistName;
    private String songTitle;
    private String genre;
    public LocalDate lastPlayed;

     //this is the constructor for the fields that we set
    public Song (String songDataStr){
        //this is used to split the items inside the string with a ","
        String[] songData = songDataStr.split(",");
        //checks if the length of the string that is equal to 3
        if (songData.length== 3) {
            //the .strip that is being added is to eleminate any white spaces when the data is being entered
            this.artistName = songData[0].strip();
            this.songTitle = songData[1].strip();
            this.genre = songData[2].strip();
            lastPlayed = LocalDate.of(2022, 1, 1);
        }
    }



    //this is a setter for last played field
    public void setLastPlayed(LocalDate lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    // this is a getter for artistName used forward in the program
    public String getArtistName() {
        return artistName;
    }

    //this is a getter for songTitle that will be used forward in our program
    public String getSongTitle() {
        return songTitle;
    }

    //this is a getter for genre that will be used forward in our program
    public String getGenre() {
        return genre;
    }

    //this is a getter for lastPlayed that will be used forward in our program
    public LocalDate getLastPlayed() {
        return lastPlayed;
    }

    /**
     * this is a method used to check if the name of the artist and the song title matches with the right ones
     * @param artistName
     * @param songTitle
     * @return
     */
    public boolean equals(String artistName, String songTitle){
        return (this.artistName.equals(artistName.strip()) && this.songTitle.equals(songTitle.strip()));
    }

    @Override
    public String toString() {
        return
                "Artist Name:" + artistName +
                ", Title:" + songTitle +
                ", Genre:" + genre +
                ", Last Played:" + lastPlayed;
    }
}
