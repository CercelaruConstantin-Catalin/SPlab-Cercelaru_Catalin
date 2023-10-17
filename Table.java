public class Table {
    public String title;

    public Table(String titlu){
        this.title=titlu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titlu) {
        this.title = titlu;
    }

    public void print() {
        System.out.println("Title: "+this.title+"\n");
    }


}
