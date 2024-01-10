public enum SpeciesEnum {
    MAMMIFERO("Mammifero"),
    ANFIBIO("Anfibo"),
    RETTILE("Rettile");

    private final String descrizione;

    SpeciesEnum(String descrizione){
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
