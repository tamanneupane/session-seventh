package day16;

public final class Executive extends Manager   {

    private float shareMoney;

    public Executive(String name, int age, float salary, float bonus, float shareMoney) {
        super(name, age, salary, bonus);
        this.shareMoney = shareMoney;
    }

    @Override
    public float getSalary() {
        float totalSalary = super.getSalary() + shareMoney;
        return totalSalary;
    }

    public void fireManager(Manager manager){

    }
}
