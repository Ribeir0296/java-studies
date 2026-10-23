void main() {
    int n = Integer.parseInt(IO.readln().trim());

    for (int i = 0; i < n; i++)
    {
        String[] parts = IO.readln().trim().split(" ");
        String name = parts[0];
        int age = Integer.parseInt(parts[1]);

        Person person = new Person(name, age);
        System.out.println(person.introduce());
    }
}

class Person { 
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    String introduce()
    {
        return "Hi, I'm " + name + " and I'm " + age + " years old.";
    }

}
