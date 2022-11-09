package lk.ijse.dep9.dto;

public class BookDTO {
    private String isbn;
    private String title;
    private String author;
    private Integer copies;

    public BookDTO() {
    }

    public BookDTO(String isbn, String title, String author, int copies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }
}
