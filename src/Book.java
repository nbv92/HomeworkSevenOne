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
    public String getToStringBook(){
        //return toStringAuthor;
        return "Книга " + this.bookName + " Издание " + this.yearRelize;
    }
    public boolean getEqualsBook() {
        return getToStringBook().equals(getToStringBook());
    }
    public int hashCodeBook() {
        String hashCodeBookString = "Книга " + this.bookName + " Издание " + this.yearRelize;
        return hashCodeBookString.hashCode();
    }
}
