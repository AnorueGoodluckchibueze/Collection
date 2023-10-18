import java.util.ArrayList;

public class BookClass {
    public static void main(String[] args) {
        //creating List of books
        ArrayList<Book> listOfMybooks = new ArrayList<Book>();

        ///naming the books
        Book B1 = new Book(1, "percieved truth ", "Armstrong Confidence ", 600 );
        Book B2 = new Book(2,"passion of beauty" , "Armstrong Confidence ", 570);
        Book B3 = new Book(3,"kingdom pursuit " , "Armstrong Confidence ", 1000);
        Book B4 = new Book(4, "expression of the inner being","Armstrong Confidence", 890 );

        ////Adding more book to the List/
        listOfMybooks.add(B1);
        listOfMybooks.add(B2);
        listOfMybooks.add(B3);
        listOfMybooks.add(B4);

        // Transversing the list//
        for (Book b: listOfMybooks){
            System.out.println(b.Id + " "+ b.name+  "  "+ b.author+ " "+b.quantity+" ");
        }
    }

}


class Book{
    int Id;
    String name;
    String author;
    int quantity;

///// creating a Constructor //
    public Book(int id, String name,String author, int quantity){
        this.Id =id;
        this.author = author;
        this.name = name;
        this.quantity =quantity;
    }
}
