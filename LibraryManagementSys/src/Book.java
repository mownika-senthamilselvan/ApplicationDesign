public class Book implements BookIN {
    private String author;
    private String title;
    private boolean available;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
        this.available = true;
    }

    @Override
    public String title() {
        return title;
    }
    public String getAuthor() {
        return author;
    }


    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean val){
        available=val;
    }
}
