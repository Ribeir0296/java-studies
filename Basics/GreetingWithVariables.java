void main() {
    String name = IO.readln().trim();
    int age = Integer.parseInt(IO.readln().trim());

    System.out.println("Hello, " + name + "!");
    System.out.println("Next year you will be " + (age + 1) + " years old.");
}
