package ver5;

import java.util.Date;

abstract class Person implements IPerson {

    private String id, fullName;
    private Date dateofBirth;
    private Date bookBorrowDate, bookReturnDate;

    public Person() {
    }

    public Person(String id, String fullName, Date dateofBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateofBirth = dateofBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    @Override
    abstract public void addPerson();

    @Override
    abstract public void updatePerson(String id);

    @Override
    abstract public void displayInfor();

    public boolean isBookOverdue() {
        if (bookReturnDate != null && bookBorrowDate != null) {
            long diff = bookReturnDate.getTime() - bookBorrowDate.getTime();
            return diff >= 30L * 24 * 60 * 60 * 1000; // 30 ngày tính bằng mili giây
        }
        return false;
    }

}
