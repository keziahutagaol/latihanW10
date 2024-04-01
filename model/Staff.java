package model;

public class Staff implements Employee{
    private int salary;
    private int bonus;
    private int allowence;
    
    public Staff(int salary, int bonus, int allowence) {
        this.salary = salary;
        this.bonus = bonus;
        this.allowence = allowence;
    }
    
    @Override
    public double income() {
        return salary + bonus + allowence;
    }
    
}
