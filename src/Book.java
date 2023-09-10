public class Book {
    private String bookName;
    private String yearRelize;
    private Author author;
    public void setYearRelize (String yearRelize) {
        this.yearRelize = yearRelize;
    }
    public String getYearRelize(){

        return this.yearRelize;
    }
    public Book (String bookName, String yearRelize, Author author) {
        this.bookName = bookName;
        this.yearRelize = yearRelize;
    }
    public String ToString(){
        //return toStringAuthor;
        return "Книга " + this.bookName + " Издание " + this.yearRelize;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book Book = (Book) other;
        return Book.bookName == Book.bookName && Objects.equals(bookName, Book.bookName);
    }
    @Override
    public int hashCode() {
        return Object.hash(bookName,yearRelize);
    }
}
