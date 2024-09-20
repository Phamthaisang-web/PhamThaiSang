
package sang1;

import java.util.Date;

abstract class Person implements IPerson{
    private String id,fullName;
    private Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public abstract void addPerson();

    public abstract void updatePerson(String id);
    
    public abstract void disPlayInfor();
    
}
