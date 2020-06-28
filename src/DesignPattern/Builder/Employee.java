/*
package DesignPattern.Builder;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<String> skill;

    public Employee(Employee emp) {
        this.id=emp.id;
        this.name=emp.name;
        this.skill=emp.skill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }

    public static class EmployeeBuilder
    {
        private Employee emp;


        public Employee setId(int id)
        {
            this.emp.id=id;
            return emp;
        }
        public Employee setName(String name)
        {
            this.emp.name=name;
            return emp;
        }
        public Employee setSkill(List skill)
        {
            emp.skill=skill;
            return emp;
        }
        public Employee build()
        {

            return new Employee(emp);
        }
    }

}
class MainClass{
    public static void main(String[] args) {
        Employee e=new Employee.EmployeeBuilder().setId(1).setName("a");


    }
}*/
