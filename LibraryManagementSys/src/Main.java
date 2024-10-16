import java.util.Scanner;

public class Main {
   private static final Scanner sc = new Scanner(System.in);
    static Library library = new Library();
    public static void main(String[] args) {

        boolean running=true;
        while(running){
            System.out.println("Welcome to midNight Libray");
            System.out.println("1: Add Book");
            System.out.println("2: Registry member");
            System.out.println("3: Borrow Book");
            System.out.println("4: Return Book");
            System.out.println("5: Display Book");
            System.out.println("6: Exist");

            int input=sc.nextInt();
            sc.nextLine();

            switch(input){
                case 1:
                    System.out.println("Enter the Book Name");
                    String BookName=sc.nextLine();
                    System.out.println("Enter the author");
                    String Bookauthor=sc.nextLine();
                    addBookToLibrary(BookName,Bookauthor);
                    break;
                case 2:
                    System.out.println("Enter the your Name Please");
                    String memberName=sc.nextLine();
                    addMemberToLibrary(memberName);
                    break;
                case 3:
                    System.out.println("Entry the Book you to Borrow");
                    String BorrowTittle= sc.nextLine();
                    borrowBookFromLibrary(BorrowTittle);
                    break;
                case 4:
                    System.out.println("Enter the BookName");
                    String returnBook=sc.nextLine();
                    System.out.println("Enter the member Name");
                    String returnMember=sc.nextLine();
                    returnBookToLibrary(returnBook,returnMember);
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting Library System.");
                    break;


                default:
                    System.out.println("Invalid please Entry correctly");


            }



            }

        }

    static void addBookToLibrary(String BookName,String Bookauthor){
        Book book=new Book(BookName,Bookauthor);
        library.addBook(book);
        System.out.println("Book" + BookName +"is added");

    }

    static void addMemberToLibrary(String memberName){
        Member member=new Member(memberName);
        library.addMember(member);
        System.out.println("Member"+memberName+"is added");
    }

    static void borrowBookFromLibrary(String BorrowTittle){

        Book b=
                library.findBook(BorrowTittle);
        if(b==null){
            System.out.println("Book is not found");
        }
        else{
            System.out.println("Entry the your Name");
            String borrowName= sc.next();
            Member m=library.findMember(borrowName);
            if(m==null){
                m = new Member(borrowName);
                addMemberToLibrary(borrowName);
            }

      //   loan.borrowBook(b,m);
            Loan loan=new Loan(b,m);
            library.addLoan(loan);
        }


    }

    static void returnBookToLibrary(String book,String member){
        Book returnBook=library.findBook(book);
        Member returnMember=library.findMember(member);

        library.findLoan(returnBook,returnMember);

    }


}