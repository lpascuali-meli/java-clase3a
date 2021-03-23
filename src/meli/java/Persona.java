package meli.java;

public class Persona implements Precedable<Persona>{
    private String name;
    private int document;

    public Persona(String name, int document) {
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    @Override
    public int precedeA(Persona p) {
        return p.getDocument() - this.document;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", document=" + document +
                '}';
    }
}
