public class Paragraph implements Element{
    public String text;

    public Paragraph(String text){
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print(){
        System.out.println("Paragraph: "+this.text+"\n");
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }


}
