package day16;

public sealed class Manager extends Employee permits Executive {

    private float bonus;

    public Manager(String name, int age, float salary, float bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    @Override
    public float getSalary(){
        float totalSalary = super.getSalary() + this.bonus;
        return totalSalary;
    }

    protected void fireEmployee(Employee employee){

    }

}
