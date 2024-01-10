import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ParzoZoologico {
    private ArrayList<Animal> animalArrayList;
    private HashMap<Integer , Animal> animalHashMap;
    private HashSet<Animal> animalHashSet;


    public ParzoZoologico() {
        this.animalArrayList = new ArrayList<>();
        this.animalHashMap = new HashMap<>();
        this.animalHashSet = new HashSet<>();

    }

    public ArrayList<Animal> getAnimalArrayList() {
        return animalArrayList;
    }

    public void setAnimalArrayList(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }

    public HashMap<Integer, Animal> getAnimalHashMap() {
        return animalHashMap;
    }

    public void setAnimalHashMap(HashMap<Integer, Animal> animalHashMap) {
        this.animalHashMap = animalHashMap;
    }

    public HashSet<Animal> getAnimalHashSet() {
        return animalHashSet;
    }

    public void setAnimalHashSet(HashSet<Animal> animalHashSet) {
        this.animalHashSet = animalHashSet;
    }

    public void addAnimalToMappa(Animal animal) throws Exception {
        //se la Mappa è vuota aggiungiamo direttamente
        if(animalHashMap.isEmpty()){
            animalHashMap.put(animal.getId(), animal);
        }else {
            //dobbiamo vedere se quell'id non è già contenuto nella mappa
            if(!animalHashMap.containsKey(animal.getId())){
                animalHashMap.put(animal.getId(), animal);
            }else{
                throw new Exception("attenzione animale duplicato");
            }
        }
    }
    public void addAnimalToHashSet(Animal animal) throws Exception {
        //se la lista è vuota aggiungiamo direttamente
        if(animalHashSet.isEmpty()){
            animalHashSet.add(animal);
        }else {
            //cicliamo all'interno del set
            boolean sameSpecies = false;
            for(Animal animalVar : animalHashSet){
                //controlliamo che non sia presente già una specie nella lista
                if (animalVar.getSpecie().equals(animal.getSpecie())) {
                    sameSpecies = true;
                    break;
                }
            }
            //se non presente aggiunge in caso contrario va in errore
            if(!sameSpecies){
                animalHashSet.add(animal);
            }else {
                throw new Exception("specie già presente non è possibile aggiungere all'HashSet");
            }
        }
    }
    public void addAnimalToArrayList(Animal animal) throws Exception {
        //se la lista è vuota aggiungiamo direttamente
        if(animalArrayList.isEmpty()){
            animalArrayList.add(animal);
        }else {
            //dobbiamo vedere se quell'id non è già contenuto nella lista
            if(!animalArrayList.contains(animal)){
                animalArrayList.add(animal);
            }else{
                throw new Exception("attenzione animale duplicato");
            }
        }
    }
    public StringBuilder mapToString(){
        StringBuilder dettagli = new StringBuilder();
        for (Animal animal : animalHashMap.values()){
            dettagli.append(animal.getDettagli());
            dettagli.append("\n");
        }
        return dettagli;
    }

    public StringBuilder animalsArrayToString(){
        StringBuilder dettagli = new StringBuilder();
        for (Animal animal : animalArrayList){
            dettagli.append(animal.getDettagli());
            dettagli.append("\n");
        }
        return dettagli;
    }
    public StringBuilder animalsHashSetToString(){
        StringBuilder dettagli = new StringBuilder();
        for (Animal animal : animalHashSet){
            dettagli.append(animal.getDettagli());
            dettagli.append("\n");

        }
        return dettagli;
    }
    public String printLists(){
        return "\nHashMappa:\n" + mapToString() +
                "--------------------------------------------\nArrayList:\n"+ animalsArrayToString()
                + "--------------------------------------------\nHashSet:\n"+ animalsHashSetToString();

    }
}
