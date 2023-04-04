public class Item{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    // Setting Title
    public void setTitle(String t){title = t;}
    // Returning Title
    public String getTitle(){return title;}

    // Setting Playing Time
    public void setPlayingTime(int pt){playingTime = pt;}
    // Returning Playing Time
    public int getPlayingTime(){return playingTime;}

    // Setting Own
    public void setGotIt(boolean own){gotIt = own;}
    // Returning Own
    public boolean getGotIt(){return gotIt;}

    // Setting Comment
    public void setComment(String c){comment = c;}
    // Returning Comment 
    public String getComment(){return comment;}

    // Printing data
    public void print(){
        System.out.println("title: " + title);
        System.out.println("playing time: " + playingTime);
        System.out.println("Own?: " + gotIt);
        System.out.println("    " + comment);
    }
}