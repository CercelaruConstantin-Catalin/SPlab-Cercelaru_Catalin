import java.util.ArrayList;
import java.util.List;

public class Chapter {
    public String chapterName;
    public SubChapter subChapter;

    public List<Paragraph> paragraphs;

    public Chapter(String chapterName, String name, String imgName, String parText, String tTitle) {
        this.chapterName = chapterName;
        this.subChapter = new SubChapter(name, imgName, parText, tTitle);
        this.paragraphs = new ArrayList<>();
    }

    public void addParagraph(String pText) {
        Paragraph paragraph = new Paragraph(pText);
        paragraphs.add(paragraph);
    }


}