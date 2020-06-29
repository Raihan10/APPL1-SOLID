package Application;
import Interfaces.IStreamable;
import Models.*;

/**
 *
 * @author Raihan Ibrahim
 */
public class App {

    public static void main(String[] args) {
        IStreamable stream1 = new File("APPL", 200, 100);        
        IStreamable stream2 = new Music("Eminem", "Kamikaze", 100, 200);
        StreamProgressInfo infoStream1 = new StreamProgressInfo(stream1);
        StreamProgressInfo infoStream2 = new StreamProgressInfo(stream2);
        
        System.out.println("Stream 1 (File)");
        System.out.println("Length = " + stream1.getLength());
        System.out.println("Byte Sent = " + stream1.getByteSent());
        System.out.println("Calculated Current Percent = " + infoStream1.calculateCurrentPercent());
        System.out.println("");
        System.out.println("Stream 2 (Music)");
        System.out.println("Length = " + stream2.getLength());
        System.out.println("Byte Sent = " + stream2.getByteSent());
        System.out.println("Calculated Current Percent = " + infoStream2.calculateCurrentPercent());
    }
    
}
