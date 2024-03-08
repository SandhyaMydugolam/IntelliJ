package Com.objects.basics;

public class Bookmain {
    public static void main(String[] args) {
        Book book = new Book("siri","kutlu",400);
        book.getDetails();
        String bookType =book.checkBooktype();
        System.out.println(bookType);
    }
        }
