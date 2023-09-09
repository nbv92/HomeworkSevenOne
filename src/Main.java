
public class Main {
    public static void main(String[] args) {
        //two author and two book,merge yearRelize book with setter
        Author robMartin = new Author("Robert ","Martin");
        Book oneBook = new Book("Perfuct Code",2008,robMartin);
        System.out.println(robMartin.getNameFirst() + " " + robMartin.getNameLast());
        System.out.println(oneBook.getBookName());
        System.out.println(oneBook.getYearRelize());
        oneBook.setYearRelize(1998);
        System.out.println("setYearRelize = " + oneBook.getYearRelize());
        Author bobbyJo = new Author("Bobby", "Jo");
        Book twoBook = new Book("History JoJ0", 9999,bobbyJo);
        System.out.println(bobbyJo.getNameFirst() + " " + bobbyJo.getNameLast());
        System.out.println(twoBook.getBookName());
        System.out.println(twoBook.getYearRelize());
    }
}
