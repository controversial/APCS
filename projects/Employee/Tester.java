/***
 * <<< THIS CODE IS COMPLETE >>>
 *
 * The following is output from this Tester:
 *
 * Employee: ID=6546 Age=55 Years on job=19 Salary=120000
 * Employee: ID=46354 Age=65 Years on job=32 Salary=92000
 * Employee: ID=1321 Age=45 Years on job=20 Salary=154000
 * Employee: ID=65486 Age=52 Years on job=30 Salary=91000
 * Employee: ID=32165 Age=63 Years on job=32 Salary=100000
 * Employee: ID=44654 Age=39 Years on job=19 Salary=95000
 * Employee: ID=3467 Age=54 Years on job=30 Salary=95000
 * Total Salary Budget: 747000
 *
 * Employee: ID=1321 Age=45 Years on job=20 Salary=154000
 * Employee: ID=65486 Age=52 Years on job=30 Salary=91000
 * Employee: ID=44654 Age=39 Years on job=19 Salary=95000
 * Employee: ID=3467 Age=54 Years on job=30 Salary=95000
 * Total Salary Budget: 435000
 */
import java.util.*;

public class Tester {

    public static void main(String args[]) {

        /***
         * Create a company called HaasCo with 7 employees
         */
        Company HaasCo = new Company(55,30,100000);

        HaasCo.addEmployee(new Employee(55,19,120000,6546));
        HaasCo.addEmployee(new Employee(65,32,92000,46354));
        HaasCo.addEmployee(new Employee(45,20,154000,1321));
        HaasCo.addEmployee(new Employee(52,30,91000,65486));
        HaasCo.addEmployee(new Employee(63,32,100000,32165));
        HaasCo.addEmployee(new Employee(39,19,95000,44654));
        HaasCo.addEmployee(new Employee(54,30,95000,3467));

        HaasCo.printEmployeeList(); // print list of employees and total salary

        HaasCo.processRetirements(); // process retirements

        HaasCo.printEmployeeList(); // print list of employees and total salary
    }
}
