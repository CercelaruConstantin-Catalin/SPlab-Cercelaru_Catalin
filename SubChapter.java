public class SubChapter {
    public String name;
    public Image image;
    public Paragraph paragraph;
    public Table table;

    public SubChapter(String name, String imgName, String parText, String tableTitle){
        this.name=name;
        this.image=new Image(imgName);
        this.paragraph=new Paragraph(parText);
        this.table=new Table(tableTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Nume Subcapitol: "+this.name+"\n");
        System.out.println();
    }


}
