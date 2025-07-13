package structuralPatterns.AdapterDP.ClassAdapter;

import structuralPatterns.AdapterDP.MyGov;
import structuralPatterns.AdapterDP.UserInfoProvider;

//here we use inheritance
public class MyGovClassAdapter extends MyGov implements UserInfoProvider {

    public MyGovClassAdapter(String fullName, String fin, String dateOfBirth) {
        super(fullName, fin, dateOfBirth);
    }
    @Override
    public String getName() {
        return getFullName().split(" ")[0];
    }

    @Override
    public String getSurname() {
        return getFullName().split(" ")[1];
    }

    @Override
    public String getFin() {
        return super.getFin();
    }

    @Override
    public String getDOB() {
        return getDateOfBirth();
    }
}
