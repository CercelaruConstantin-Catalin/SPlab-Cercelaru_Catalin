public class Image implements Element{
    public String imageName;

    public Image(String name){
        this.imageName=name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String name) {
        this.imageName = name;
    }

    public void print(){
        System.out.println("Image name: "+this.imageName+"\n");
    }

    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }


}
