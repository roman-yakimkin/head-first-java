import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public class BookCompare implements Comparator<Book>{
        public int compare(Book one, Book two){
            return (one.title.compareTo(two.title));
        }
    }

    public void go(){
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново своё тело");
        Book b3 = new Book("В поисках Эмо");

        TreeSet<Book> tree = new TreeSet<Book>(new BookCompare());
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book {
    String title;
    public Book(String t){
        title = t;
    }

    public String toString() {
        return title;
    }
}