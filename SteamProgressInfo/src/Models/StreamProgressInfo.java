package Models;
import Interfaces.IStreamable;

/**
 *
 * @author Raihan Ibrahim
 */
public class StreamProgressInfo {
    private IStreamable stream;
    
    public StreamProgressInfo(IStreamable stream)
    {
        this.stream = stream;
    }
    
    public int calculateCurrentPercent()
    {
        return stream.getByteSent() *100 / stream.getLength();
    }
}
