import java.util.List;
import java.util.ArrayList;

public class Book{
    public String title;
    public Chapter chapter;
    public List<Author> authors;
    public List<Paragraph> paragraphs;


    public Book(String title) {
        this.title = title;
    }

    public Book(String title, List<Author> authors, String chapterName, String name, String imgName, String parText, String tTitle) {
        this.title = title;
        this.chapter = new Chapter(chapterName, name, imgName, parText, tTitle);
        this.paragraphs = new ArrayList<Paragraph>();
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addParagraph(Paragraph paragraphText) {
        paragraphs.add(paragraphText);
    }

    public void print() {
        System.out.print("Title: " + this.title + "\n");
    }

    public void addContent(Paragraph paragraph) {
        this.paragraphs.add(paragraph);
    }
}
