package model;

public class Manager implements Employee {
    private int salary;
    private int bonus; 

    public Manager(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }   


    @Override
    public double income() {
        return salary + bonus;
    }
}
