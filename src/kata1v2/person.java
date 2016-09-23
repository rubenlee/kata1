package kata1v2;

import java.util.Date;

public class person {
    private String name;
    private Date Birthdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date Birthdate) {
        this.Birthdate = Birthdate;
    }

    public person(String name, Date Birthdate) {
        this.name = name;
        this.Birthdate = Birthdate;
    }
    
    public int getAge(){
        return (int)((new Date().getTime() - Birthdate.getTime())/31536000000L);
    }
}
