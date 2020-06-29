package Models;
import Interfaces.IStreamable;

/**
 *
 * @author Raihan Ibrahim
 */
public class File implements IStreamable{
    private String name;
    private int length;
    private int byteSent;
    
    public File(String name, int length, int byteSent)
    {
        this.name = name;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
