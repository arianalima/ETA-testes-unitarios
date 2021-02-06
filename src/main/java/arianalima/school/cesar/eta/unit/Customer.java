package arianalima.school.cesar.eta.unit;

public class Customer extends Person {
    Integer reward;

    @Override
    public Integer getId() {
        return reward;
    }

    @Override
    public Customer clone() {
        return new Customer();
    }
}
