public class Book {
    private String bookName;
    private int yearRelize;
    private Author author;
    public void setYearRelize (int yearRelize) {

        this.yearRelize = yearRelize;
    }
    public String getBookName() {

        return this.bookName;
    }
    public int getYearRelize(){

        return this.yearRelize;
    }
    public Book (String bookName, int yearRelize, Author author) {
        this.bookName = bookName;
        this.yearRelize = yearRelize;
        //Author author = new Author(String nameFirst(), String nameLast);? Это так надо сделать?
    }

}
