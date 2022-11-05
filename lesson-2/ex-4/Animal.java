interface Animal {
  public void animalSound();
}

class Dog implements Animal{
    String name;
    int age;
    public Dog (String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void animalSound(){
        System.out.println("Wof, Wof!");
    }
}

class Cat implements Animal{
    String name;
    int age;
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void animalSound(){
        System.out.println("Meeoow, Meow..");
    }
}

class Main {
    public static void main(String[] args){
        Cat animalCat = new Cat("Garfield", 4);
        System.out.println(animalCat.name + " " + animalCat.age + " yo");
        animalCat.animalSound();

        Dog animalDog = new Dog("Szarik", 7);
        System.out.println(animalDog.name + " " + animalDog.age + " yo");
        animalDog.animalSound();
    }
}
