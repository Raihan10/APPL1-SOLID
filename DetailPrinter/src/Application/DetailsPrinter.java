package Application;

import java.util.List;

/**
 *
 * @author Raihan Ibrahim
 */
public class DetailsPrinter {
    private List<Employee> employees;
    
    public DetailsPrinter(List<Employee> employees)
    {
        this.employees = employees;
    }
    
    public void printDetails()
    {
        for (Employee employee : employees) 
        {
            System.out.println(employee);
            System.out.println("");
        }
    }
}
