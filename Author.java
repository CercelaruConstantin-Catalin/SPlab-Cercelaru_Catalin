public class Author {
    public String name;

    public Author(){
        this.name="";
    }

    public Author(String nume){
        this.name=nume;
    }

    public void print(){
        System.out.print("Author: "+this.name+"\n");
    }
}
