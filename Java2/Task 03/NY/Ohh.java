package Java2_02.Ex.NY;

import Java2_02.Ex.Contact_1.Contact;

public class Ohh {
    private String name;
    private String Character;

    public Ohh(String name, String Character){
        this.name = name;
        this.Character = Character;
    }
    public static Ohh createContact(String name, String Character){
        return new Contact(name, Character);
    }

    public Ohh getName() {
        return name;
    }

    public String getCharacter() {
        return Character;
    }
}
