package bridgelabz.model;

import java.util.List;

public class AddressBookModel {
    private String bookName;
    private List<Person> personList;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public AddressBookModel() {
        this.bookName = bookName;
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "AddressBookModel{" +
                "bookName='" + bookName + '\'' +
                ", personList=" + personList +
                '}';
    }
}
