package Models;
import Interfaces.IStreamable;

/**
 *
 * @author Raihan Ibrahim
 */
public class Music implements IStreamable{
    private String artist;
    private String album;
    private int length;
    private int byteSent;
    
    public Music(String artist, String album, int length, int byteSent)
    {
        this.artist = artist;
        this.album = album;
        this.length = length;
        this.byteSent = byteSent;
    }
    
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getByteSent() {
        return byteSent;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @param byteSent the byteSent to set
     */
    public void setByteSent(int byteSent) {
        this.byteSent = byteSent;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @param album the album to set
     */
    public void setAlbum(String album) {
        this.album = album;
    }
    
    
}
