
public class main {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");

        Author rpGheo = new Author("Radu Pavel Gheo");

        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");

        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));

        cap1.add(new Paragraph("Moto capitol"));

        cap1.add(cap11);

        cap11.add(new Paragraph("Text from subchapter 1.1"));


    }

}