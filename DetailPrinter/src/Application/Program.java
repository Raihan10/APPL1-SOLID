package Application;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raihan Ibrahim
 */
public class Program {

    public static void main(String[] args) {
        Employee employee = new Employee("Jurgen Klopp");
        
        ArrayList<String> documents = new ArrayList<>();
        documents.add("Document 1");
        documents.add("Document 2");
        Employee manager = new Manager("Pep Guardiola", documents);
        
        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(employee);
        listOfEmployee.add(manager);
        
        DetailsPrinter printer = new DetailsPrinter(listOfEmployee);
        printer.printDetails();
    }
    
}
