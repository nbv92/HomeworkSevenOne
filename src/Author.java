public class Author {
        private String nameFirst;
        private String nameLast;
        public Author ( String nameFirst, String nameLast ) {
            this.nameFirst = nameFirst;
            this.nameLast = nameLast;
        }
        public String getToStringAuthor() {
            return "Имя " + this.nameFirst + " Фамилия " + this.nameLast;
        }
        public boolean getEqualsAuthor() {
             return getToStringAuthor().equals(getToStringAuthor());
        }
        public int hashCodeAuthor() {
            String hashCodeAuthorString = "Имя " + this.nameFirst + " Фамилия " + this.nameLast;
            return hashCodeAuthorString.hashCode();
        }
}
