package structuralPatterns.AdapterDP.ObjectAdapter;

import structuralPatterns.AdapterDP.MyGov;
import structuralPatterns.AdapterDP.UserInfoProvider;

//here we use composition
public class MyGovObjectAdapter implements UserInfoProvider {
    private MyGov myGov;

    public MyGovObjectAdapter(MyGov myGov) {
        this.myGov = myGov;
    }

    @Override
    public String getName() {
        return myGov.getFullName().split(" ")[0];
    }

    @Override
    public String getSurname() {
        return myGov.getFullName().split(" ")[1];
    }

    @Override
    public String getFin() {
        return myGov.getFin();
    }

    @Override
    public String getDOB() {
        return myGov.getDateOfBirth();
    }
}
