// TODO: create a class Book with fields title, author and year,
// a constructor, and a toString() method that returns:
//   "<title>" by <author> (<year>)

void main() {
    int n = Integer.parseInt(IO.readln().trim());

    for (int i = 0; i < n; i++) {
        String[] parts = IO.readln().split(";");
        String title = parts[0];
        String author = parts[1];
        int year = Integer.parseInt(parts[2]);
        Book book = new Book(title, author, year);
        IO.println(book);
    }
}

class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override 
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + year + ")";
    }

} 
