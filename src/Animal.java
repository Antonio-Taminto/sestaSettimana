import java.util.Objects;

public class Animal {
    private  Integer id ;
    private String name;
    private SpeciesEnum specie;
    private static Integer counter = 1;

    public Animal(String name,SpeciesEnum specie){
        this.name = name;
        this.specie = specie;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpeciesEnum getSpecie() {
        return specie;
    }

    public void setSpecie(SpeciesEnum specie) {
        this.specie = specie;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && specie == animal.specie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specie);
    }

    public String getDettagli(){
        return specie.getDescrizione() + " si chiama : " + name + " con id : " + id;
    }
}
