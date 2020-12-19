package org.javalearning.ocjp;

public class Employee {
    public int empId;
    public String firstName, lastName;
    public int yearStarted;

    @Override public int hashCode() {
        return empId;
    }

    public boolean equals(Employee e) {
        return this.empId == e.empId;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 101;
        Employee e2 = new Employee();
        e2.empId = 101;
        if(e1.equals(e2))
            System.out.println("Success");
        else
            System.out.println("Failure");
    }
}
// Ans - Success
