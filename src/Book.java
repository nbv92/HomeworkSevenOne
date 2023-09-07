public class Book {
    String bookName;
    int yearRelize;
    private Author author;
    private void setYearRelize (int yearRelize) {
        this.yearRelize = yearRelize;
    }
    private String getBookName() {
        return this.bookName;
    }
    private int getYearRelize(){
        return this.yearRelize;
    }
    public Book (String bookName, int yearRelize, Author author) {
        this.bookName = bookName;
        this.yearRelize = yearRelize;

    }

}
