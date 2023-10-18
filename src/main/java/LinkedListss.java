import java.util.LinkedList;

public class LinkedListss {
    public static void main(String[] args) {


        LinkedList<Books> list = new LinkedList<Books>();
            ///naming the books


            Books B6 = new Books(1, "percieved truth ", "Armstrong Confidence ", 600);
            Books B7 = new Books(2, "passion of beauty", "Armstrong Confidence ", 570);
            Books B8 = new Books(3, "kingdom pursuit ", "Armstrong Confidence ", 1000);
            Books B9 = new Books(4, "expression of the inner being", "Armstrong Confidence", 890);


            ////Adding more book to the List/
        list.add(B6);
        list.add(B7);
        list.add(B8);
        list.add(B9);

            // Transversing the list//
        for (Books b:list){
            System.out.println(b.Id + " " + b.name + "  " + b.author + " " + b.quantity + " ");
            }







        }
}

    class Books {
        int Id;
        String name;
        String author;
        int quantity;

        ///// creating a Constructor //
        public Books(int id, String name, String author, int quantity) {
            this.Id = id;
            this.author = author;
            this.name = name;
            this.quantity = quantity;


    }
}