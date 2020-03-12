
/*
Conor Gannon
G00345419

Employee List

Created a employee list to add an object employee to function
Created a remove employee and get size of list function

The add employee checks for duplicated objects in the list
the remove employee checks if the employee exists to remove them
the get list checks how many object there is in the list and returns the value

 */

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    List<Employee> TheList = new ArrayList<>();

    public  void addEmployee( Employee employee){

        boolean result = TheList.contains(employee);
        if(result == false) {
            TheList.add(employee);
        }
        else{
            throw new IllegalArgumentException("Duplicate Employee details found no object added");
        }
    }

    public void removeEmployee(Employee  employee){

        boolean result = TheList.contains(employee);
        if(result == true)
        {
            TheList.remove(employee);
        }
        else {
            throw new IllegalArgumentException("Employee can not be found ");
        }

    }

    public  boolean findEmployee (Employee employee){
        boolean result = TheList.contains(employee);
        return result;
    }

    public int getListSize(){
        int result = TheList.size();
        return result;
    }
}
