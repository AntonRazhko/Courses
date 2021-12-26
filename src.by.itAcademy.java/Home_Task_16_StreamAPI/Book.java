package Home_Task_16_StreamAPI;

public class Book {
    public String nameOfTheBook;
    public Integer yearOfIssue;

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Book(String nameOfTheBook, Integer yearOfIssue) {
        this.nameOfTheBook = nameOfTheBook;
        this.yearOfIssue = yearOfIssue;

    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
