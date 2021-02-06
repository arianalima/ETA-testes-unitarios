package arianalima.school.cesar.eta.unit;

import java.time.LocalDate;

public abstract class Person implements ClonableObject{
    LocalDate birthday;
    String firstName;
    String lastName;

    protected String getName(){
        return this.firstName + " " + this.lastName;
    }

    public abstract Integer getId();

    @Override
    public abstract Person clone();
}
