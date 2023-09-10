public class Author {
        private String nameFirst;
        private String nameLast;
        public Author ( String nameFirst, String nameLast ) {
            this.nameFirst = nameFirst;
            this.nameLast = nameLast;
        }
        public String ToString() {
            return "Имя " + this.nameFirst + " Фамилия " + this.nameLast;
        }
        public boolean getEqualsAuthor() {
             return getToStringAuthor().equals(getToStringAuthor());
        }
        public int hashCodeAuthor() {
            String hashCodeAuthorString = "Имя " + this.nameFirst + " Фамилия " + this.nameLast;
            return hashCodeAuthorString.hashCode();
        }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return nameFirst == Author.nameFirst && Objects.equals(nameFirst, author.nameFirst);
    }
    @Override
    public int hashCode() {

            return Author.hash(nameFirst,nameLast);
    }
    }
}
