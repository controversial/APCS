/***  <<< This Class is Complete!!! >>> ****/
public class Student   {
    private String name;
    private int average;

    public Student(String n, int r)  {
        name = n;
        average = r;
    }

    public String getName() {  return name;  }

    public int getAverage() { return average;  }

    public String toString() {
        return "Name: " + getName() +
                " Average: " + getAverage();
    }
}
