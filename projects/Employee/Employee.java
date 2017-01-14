/**
 * <<< THIS CLASS IS COMPLETE >>>
 */
public class Employee
{
    int age;  // the employee's age in years
    int yearsOnJob; // the number of years the employee has worked
    int salary; // the employee's salary in dollars
    int ID; // the ID number of the employee

    public Employee(int age, int yearsOnJob, int salary, int ID)
    {
        this.age = age;
        this.yearsOnJob = yearsOnJob;
        this.salary = salary;
        this.ID = ID;
    }

    public int getAge() { return age; }
    public int getYearsOnJob() { return yearsOnJob; }
    public double getSalary() { return salary; }
    public int getID() { return ID; }

    public String toString() {
        return "Employee: ID=" + ID + " Age=" + age +
                " Years on job=" + yearsOnJob + " Salary=" + salary;
    }
}
