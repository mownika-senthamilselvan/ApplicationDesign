
import java.time.LocalDate;

public class Loan implements LoanIN {
    private LocalDate takeDate;
    private LocalDate returnDate;
    private Book book;
    private Member member;

    public  Loan(Book book,Member member) {
          if(book.isAvailable()){
              this.takeDate=LocalDate.now();
              this.returnDate=LocalDate.now();
              this.book=book;
              this.member=member;

              book.setAvailable(false);
              System.out.println("Borrowed sucessfully and it updated");


       }else{
              System.out.println("Book is not available");
          }
    }

    public void setReturnDate(LocalDate D){
        returnDate=D;
    }


    @Override
    public LocalDate gettakeDate() {
        return takeDate;
    }

    @Override
    public LocalDate getreturnDate() {
        return returnDate;
    }

    public Book getBook() {
        return book; // Return the book associated with this loan
    }
}

