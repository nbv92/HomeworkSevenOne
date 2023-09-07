
public class Main {
    public static void main(String[] args) {
        //two author and two book,merge yearRelize book with setter
        Author robMartin = new Author("Robert ","Martin");
        Book oneBook = new Book("Perfuct Code",2008,robMartin);
        System.out.println(robMartin.nameFirst + " " + robMartin.nameLast);
        System.out.println(oneBook.bookName);
        System.out.println(oneBook.yearRelize);
    }
    public static void app() {

    }
}
