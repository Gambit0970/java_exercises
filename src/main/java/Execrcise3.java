public class Execrcise3 {
    public static class Person{
        String firstName;
        String surname;
        int age;
        boolean hasAge;

        // minimum data
        public Person(String firstName, String surname) {
            this.firstName = firstName;
            this.surname = surname;
            this.hasAge = false;
        }
        public Person(String firstName, String surname, int age){
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
            this.hasAge = true;
        }
        public int getAge(){
            if (hasAge) return age;
            else return 0;
        }
    }

    public static void main(String[] args) {
        Person Bob = new Person("Bob", "Trotter", 46);
        Person Jacqui = new Person("Jacqui", "Smith");
        System.out.println(Bob.getAge());
        System.out.println(Jacqui.getAge());
    }
}
