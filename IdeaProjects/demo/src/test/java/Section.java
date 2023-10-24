public class Section implements Element{
    public String title;

    List<Element> elementList;
    @Override
    public void add(Element e) {
        elementList.add(e);
    }

    @Override
    public void remove(Element e) {
        elementList.remove(e);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : elementList) {
            element.print();
        }
    }


    public Section(String titlu){
        this.title=titlu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titlu) {
        this.title = titlu;
    }


    public void add(Paragraph motoCapitol) {



    }
}
