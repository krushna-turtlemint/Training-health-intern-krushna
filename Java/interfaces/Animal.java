
interface sound {
    void soundOfAnimal();
}

interface speed {
    void speedUp();
}

public class Animal implements sound, speed {
    String name;

    Animal(String animal) {
        name = animal;
    }

    public void soundOfAnimal() {
        System.out.println("The animal " + name + "will bark");
    }

    public void speedUp() {
        System.out.println("The animal " + name + "will not run");
    }
}