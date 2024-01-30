import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person [] persons = new Person[10];

        persons[0] = new Person("buse", "şentürk", 150);
        persons[1] = new Person("duru", "karacan", 151);
        persons[2] = new Person("azra", "erdem", 152);
        persons[3] = new Person("ege", "canyurt",153);
        persons[4] = new Person("selin", "arık", 154);
        persons[5] = new Person("kadir", "torun", 155);
        persons[6] = new Person("leyla", "fidanay", 156);
        persons[7] = new Person("can", "akkaya", 157);
        persons[8] = new Person("gökçen", "fırat", 158);
        persons[9] = new Person("mete", "gazoz", 159);

        MergeSort M = new MergeSort();
        System.out.println("Merge Sort by id descending order:\n");
        M.mergeSort(persons);
        printPersons(persons);


        Comparator<Person> nameComparator = Comparator.comparing(Person::getName).reversed();
        System.out.println("Merge Sort by name using Comparator in descending order:\n");
        M.mergeSort(persons, nameComparator);
        printPersons(persons);

        System.out.println("Merge Sort by surname using Comparator in descending order:\n");
        Comparator<Person> surnameComparator = Comparator.comparing(Person::getSurname).reversed();
        M.mergeSort(persons, surnameComparator);
        printPersons(persons);



        QuickSort Q = new QuickSort();
        System.out.println("Quick Sort by id in descending order :\n");
        Q.quickSort(persons);
        printPersons(persons);

        Comparator<Person> nameComparator2 = Comparator.comparing(Person::getName).reversed();
        System.out.println("Quick Sort by name using Comparatorin descending order:\n");
        Q.quickSort(persons, nameComparator2);
        printPersons(persons);

        Comparator<Person> surnameComparator2 = Comparator.comparing(Person::getSurname).reversed();
        System.out.println("Quick Sort by surname using Comparator in descending order:\n");
        Q.quickSort(persons, surnameComparator2);
        printPersons(persons);


    }
    private static void printPersons(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("------------------------------------------------------------");
    }
}
