import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;



    public Library() {
       books = new ArrayList<>();
        members = new ArrayList<>();
       loans = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void addLoan(Loan loan){
         loans.add(loan);
    }


    public Member findMember(String MemberName){
        for(Member m:members){
            if(m.memberName().equalsIgnoreCase(MemberName)){
                return m;
            }
        }

        return null;
    }

    public Book findBook(String booktitle){
        for(Book b:books){
              if(b.title().equalsIgnoreCase(booktitle)){
                     return b;
              }
        }

        return null;
    }

    public Loan findLoan(Book b,Member m){
        for (Loan loan : loans) {
            if (loan.getBook().equals(b)) {
               loan.setReturnDate( LocalDate.now());
               loan.getBook().setAvailable(true);
                return loan; // Return the loan object associated with this book
            }
        }
        return null; // No loan found for this book
    }

    public void displayBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println("Title: " + book.title() + ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
        }
    }


}











