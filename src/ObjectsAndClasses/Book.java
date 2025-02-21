package ObjectsAndClasses;

public class Book {

    static int totalNoOfBooks;    //this is a static instance variable of the class Book here, ab yeha par bhi ham isko zero kar sakte hai but kyuki hamne code
                               // blcok padha hai isliye ham isko as a code block organize karenge
    //normally sare convention follow karne chahiye  like pehle static variable, phir instance variable
    //phit code block phir constructor and phir jake methods

    String title;   //this is a instance variable or properties or attributes
    String author;  //this is a instance variable or properties or attributes
    String isbn;       //this is a instance variable or properties or attributes

    boolean isBorrowed;

/*    Instance Variables (also known as properties or attributes) represent the state or characteristics of an object.
    Methods (also known as functions or behaviors) define the actions that an object can perform.
    In Java, while method is the standard term, some people informally refer to them as functions
            (since they perform operations) or behaviors (since they define what an object can do).*/


    // now codeblock as follows

    static{                   //this is static code blocking
        //this is a Static init i.e ye sirf ek bar call hoga at the time of class creation
        totalNoOfBooks = 0;
    }

    //this is a normal code blocking or object init jo ki har bar object creation ke time pe call hoga
    {
        //this is a object init i.e jab bhi ek object banega to ye call ho jayega
        totalNoOfBooks++;
    }



    //now constructor calling is going to happen as follows-
    //firstly we will create a all mandatory field constructor it means user need to give all the parameter in order to move forward like


    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //Second constructor with  only one field as mandatory other two are set at default values
    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }

//Now methods can be described as follws-

    //Static method as follows-
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    //now normal methods or instance methods or function or


   void borrowedBook(){
        if(isBorrowed){
            System.out.println("The book is not available, try next time");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book reading");
        }
   }

   void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope, you have enjoyed the book!");
        }else{
            System.out.println("This book is already in the library");
        }
   }

    public static void main(String[] args) {
        Book myBook = new Book("Design of algo", "Mr abc", "1");
        Book myBook2 = new Book("2");
        Book.getTotalNoOfBooks();
        System.out.println("Total number of books are :" + getTotalNoOfBooks());
        myBook.borrowedBook();
        myBook2.borrowedBook();
        myBook.returnBook();
        myBook.borrowedBook();
        myBook2.borrowedBook();
    }
}
