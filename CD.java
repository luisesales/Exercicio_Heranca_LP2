/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class CD extends Item{
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    /*public CD(String theTitle, String theArtist, int tracks, int time){
        title = theTitle;
        artist = theArtist;
        numberOfTracks = tracks;
        playingTime = time;
        gotIt = false;
        comment = "";
    }*/

    /**
     * Enter a comment for this CD.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment){
       super.setComment(comment);
    }

    /**
     * @return The comment for this CD.
     */
    public String getComment(){
        return super.getComment();
    }

    /**
     * Set the flag indicating whether we own this CD.
     * @param ownIt true if we own the CD, false otherwise.
     */
    public void setOwn(boolean ownIt){
        super.setGotIt(ownIt);
    }

    /**
     * @return true if we own a copy of this CD.
     */
    public boolean getOwn(){
        return super.getGotIt();
    }

    /**
     * Print details about this CD to the text terminal.
     */
    public void print(){
        super.print();
        System.out.println("    " + artist);
        System.out.println("    tracks: " + numberOfTracks);

    }
}
