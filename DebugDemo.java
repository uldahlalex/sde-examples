class StartingPoint {
    public static void main(String[] args) {
        Person a = new Person();
        Person b = a;
        a.age = a.giveMeANumber();
        b.age = b.giveMeANumber()*2;
        System.out.println(a.age);
        System.out.println(b.age);
    }
}
class Person {
    int age;
    int giveMeANumber() {
        return 10;
    }
}
