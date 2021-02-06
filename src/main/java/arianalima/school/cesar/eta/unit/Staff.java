package arianalima.school.cesar.eta.unit;

public class Staff extends Person{
    Person manager;

    public String getManagerName(){
        return manager.getName();
    }

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public Staff clone() {
        return new Staff();
    }
}
