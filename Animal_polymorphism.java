public class Animal_polymorphism {
    public void animalSound() {
        System.out.println("Animal Sound is: ");
    }
}
    class zebra extends Animal_polymorphism {
        public void animalSound() {
            System.out.println("Sound of zebra: " + "zeeeee");
        }
    }

    class loin extends Animal_polymorphism {
        public void animalSound() {
            System.out.println("Sound of zebra: " + "huuuurrrr");
        }
    }

    class Main {
        public static void main(String[] args) {
            Animal_polymorphism ap = new Animal_polymorphism();
            Animal_polymorphism z = new zebra();
            Animal_polymorphism l = new loin();
            ap.animalSound();
            z.animalSound();
            l.animalSound();
        }
    }
