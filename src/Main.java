public class Main {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Animal("Riccardo",SpeciesEnum.MAMMIFERO);
        Animal animal2 = new Animal("Giorgio",SpeciesEnum.MAMMIFERO);
        Animal animal3 = new Animal("Roberto",SpeciesEnum.RETTILE);


        ParzoZoologico parzoZoologico = new ParzoZoologico();

        parzoZoologico.addAnimalToMappa(animal1);
        parzoZoologico.addAnimalToMappa(animal2);
        parzoZoologico.addAnimalToMappa(animal3);

        parzoZoologico.addAnimalToArrayList(animal1);
        parzoZoologico.addAnimalToArrayList(animal2);
        parzoZoologico.addAnimalToArrayList(animal3);

        parzoZoologico.addAnimalToHashSet(animal1);
        parzoZoologico.addAnimalToHashSet(animal3);

        System.out.println(parzoZoologico.mapToString());
        System.out.println(parzoZoologico.animalsArrayToString());
        System.out.println(parzoZoologico.animalsHashSetToString());
        System.out.println(parzoZoologico.printLists());




    }
}