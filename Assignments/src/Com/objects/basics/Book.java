package Com.objects.basics;

public class Book {
    String bookName;
    String authorname;
    int bookprice;
    public Book(String bookName,String authorName,int bookprice) {
        this.bookName = bookName;
        this.authorname = authorName;
        this.bookprice = bookprice;
    }
        void getDetails(){
            System.out.println("book name "+bookName);
            System.out.println("author name "+authorname);
            System.out.println("book price "+bookprice);

        }
        String checkBooktype(){
        if(bookprice>500){
            return "premium Books ";
        }
        return "standard Books ";
        }
    }


