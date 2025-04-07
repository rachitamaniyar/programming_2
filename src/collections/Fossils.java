package collections;

public class Fossils {
    private String name;
    private String year;
    private String animal;

    public Fossils(String name, String year, String animal) {
        this.name = name;
        this.year = year;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Fossil{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", animal='" + animal + '\'' +
                '}';
    }
}
