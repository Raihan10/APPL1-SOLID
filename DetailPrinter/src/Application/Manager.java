package Application;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Raihan Ibrahim
 */
public class Manager extends Employee{
    private Collection<String> documents;
    
    public Manager(String name, Collection<String> documents) {
        super(name);
        this.documents = (ArrayList<String>)documents;
    }

    public Collection<String> getDocuments() {
        return documents;
    }

    public void setDocuments(Collection<String> documents) {
        this.documents = documents;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\r\n" + String.join("\r\n", this.documents);
    }
}
