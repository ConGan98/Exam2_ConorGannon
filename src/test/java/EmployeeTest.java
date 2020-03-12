
/*
Conor Gannon
G00345419

Test File for Employee and Employee List

1.testing the default create and add employee
2.Testing to create and add employee but with error in the number
3.Testing to create and add employee but with error in name
4.Testing to catch a error Dup of Employee
5.Testing to to remove a Employee
6.Testing to find if employee exists to remove
7.Testing to get the size of the list expect one employee
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class EmployeeTest {
    private EmployeeList TheList;
    private Employee myemployee;


    @BeforeEach
    void init(){
        //
    }

    @Test
    void addEmployee(){
        //default test everything good
        Employee e1 = new Employee("Conor", "12345");
        TheList = new EmployeeList();
        TheList.addEmployee(e1);

        assertEquals(true,TheList.findEmployee(e1));
    }
    @Test
    void addEmployee2(){
        //Test to catch a error less than 5 numbers
        Exception e = assertThrows(IllegalArgumentException.class,()-> myemployee = new Employee("Conor", ""));
        assertEquals("Invalid number length must be 5 ",e.getMessage());
    }
    @Test
    void addEmployee3(){
        //Test to catch a error less than 5 name
        Exception e = assertThrows(IllegalArgumentException.class,()-> myemployee = new Employee("Cor", "12345"));
        assertEquals("Invalid Name length ",e.getMessage());
    }

    @Test
    void addEmployeeDup(){
        //Test to catch a error Dup of Employee
        TheList = new EmployeeList();
        Employee e3 = new Employee("Conor", "12345");
        TheList.addEmployee(e3);


        Employee e4 = new Employee("Conor", "12345");
        Exception e = assertThrows(IllegalArgumentException.class,()->  TheList.addEmployee(e4));
        assertEquals("Duplicate Employee details found no object added",e.getMessage());
    }

    @Test
    void removeEmployee(){
        //test to remove a Employee
        Employee e4 = new Employee("Conor", "12345");
        TheList = new EmployeeList();
        TheList.addEmployee(e4);


        assertEquals(true,TheList.findEmployee(e4));
        TheList.removeEmployee(e4);
        assertEquals(false,TheList.findEmployee(e4));
    }
    @Test
    void removeEmployee1(){
        //Test to find if employee exists to remove
        Employee e4 = new Employee("Conor", "12345");
        TheList = new EmployeeList();
        Exception e = assertThrows(IllegalArgumentException.class,()-> TheList.removeEmployee(e4));
        assertEquals("Employee can not be found ",e.getMessage());
    }

    @Test
    void listSize(){
        //test to get the size of the list expect one employee
        TheList = new EmployeeList();
        Employee e4 = new Employee("Conor", "12345");
        TheList.addEmployee(e4);
        assertEquals(1,TheList.getListSize());
    }
}
