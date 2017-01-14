/***
 * <<< This class is NOT complete. >>>
 *
 * A company has the following instance fields:
 * int retireAge, int retireYears, int retireSalary, int salaryBudget,
 * and an ArrayList empList, which contains a list of employees
 *
 * For this questions you must complete the methods:
 *   1) addEmployee
 *   2) printEmployeeList
 *   3) employeeIsEligible
 *   4) processRetirements
 */
import java.util.*;

public class Company
{
    private ArrayList<Employee> empList; // array list of all employees in this company
    private int retireAge; // minimum age to retire
    private int retireYears; // minimum years on job to retire
    private int retireSalary; // minimum salary to retire
    private int salaryBudget; // total salary of ALL employees in the company

    /** <<< THIS CODE IS COMPLETE >>>
     * constructs a company with a given retirement age,
     * years of service and salary
     */
    public Company (int retireAge, int retireYears, int retireSalary) {
        this.retireAge = retireAge;
        this.retireYears = retireYears;
        this.retireSalary = retireSalary;
        this.salaryBudget = 0;
        this.empList = new ArrayList<Employee>();
    }

    /**
     * <<< This code is NOT complete. >>>
     * postcondition:
     * 1) Adds employee to the ArrayList empList
     * 2) Update 'salaryBudget' by adding the new employee's salary
     */
    public void addEmployee(Employee emp) {
        empList.add(emp);
        salaryBudget += emp.getSalary();
    }

    /**
     * <<< This code is NOT complete. >>>
     * postcondition:
     *   1) print a list of all employees in the company.
     *   2) print the salaryBudget
     */
    public void printEmployeeList() {
        for (int i=0; i<empList.size(); i++) {
            System.out.println(this.empList.get(i));
        }
        System.out.print("Total budget: "); System.out.println(this.salaryBudget);
    }

    /**
     * <<< This code is NOT complete. >>>
     * This method determines if an employee is eligible to retire.
     * An employee can retire if they meet at least two of the following
     * requirements:
     *
     *   1) The employee is at least retireAge years old.
     *   2) The employee has worked at least retireYears.
     *   3) The employee's salary is at least retireSalary.
     *
     * postcondition: returns true if emp is eligible to retire;
     * otherwise, returns false
     */
    private boolean employeeIsEligible(Employee emp)  {
        int conditionsMet = 0;

        if (emp.getAge() >=  this.retireAge) conditionsMet++;
        if (emp.getSalary() >=  this.retireSalary) conditionsMet++;
        if (emp.getYearsOnJob() >= this.retireYears) conditionsMet++;

        return conditionsMet >= 2;
    }

    /**
     * <<< This code is NOT complete. >>>
     * postcondition:
     *   1) remove ALL retirement-eligible employees from empList;
     *   2) salaryBudget has been updated to reflect remaining employees
     */
    public void processRetirements() {
        for (int i=0; i<this.empList.size(); i++) {
            if (this.employeeIsEligible(this.empList.get(i))) {
                salaryBudget -= this.empList.get(i).getSalary();
                this.empList.remove(i);
                i--; // Prevent loop skipping
            }
        }
    }
}
