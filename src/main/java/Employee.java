/*
Conor Gannon
G00345419

Creates a employee class with private strings name and number =

name performs a check that the name is a at least 5 characters long
number checks that the id is 5 characters long

 */

public class Employee {
    private String name;
    private String number;

    public Employee(String name, String number) {
        setName(name);
        setNumber(number);
    }


    public void setName(String name) {
        if(name.length() >= 5){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid Name length ");
        }
    }

    public void setNumber(String number) {
        if(number.length() == 5){
            this.number = number;
        }
        else{
            throw new IllegalArgumentException("Invalid number length must be 5 ");
        }
    }
}

