interface Animal {
    String name();
    String sound();
}

class Dog implements Animal {
    public String name() {
        return "dog";
    }

    public String sound() {
        return "Woof";
    }
}

class Cat implements Animal {
    public String name() {
        return "cat";
    }

    public String sound() {
        return "Meow";
    }
}

class Cow implements Animal {
    public String name() {
        return "cow";
    }

    public String sound() {
        return "Moo";
    }
}

class Duck implements Animal {
    public String name() {
        return "duck";
    }

    public String sound() {
        return "Quack";
    }
}

void main() {
    int n = Integer.parseInt(IO.readln().trim());
    String[] types = IO.readln().trim().split("\\s+");
    Animal[] animals = new Animal[n];

    for (int i = 0; i < n; i++) {
        String type = types[i];
        animals[i] = switch (type) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            case "cow" -> new Cow();
            case "duck" -> new Duck();
            default -> throw new IllegalArgumentException("Tipo desconhecido: " + type);
        };
    }

    for (Animal animal : animals) {
        IO.println("The " + animal.name() + " says " + animal.sound() + "!");
    }
}
