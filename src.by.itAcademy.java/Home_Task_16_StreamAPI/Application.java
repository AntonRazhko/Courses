package Home_Task_16_StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        //Task 1
        System.out.println(getMath("JDSHJAHA", s -> s.startsWith("J") || s.startsWith("N") && s.endsWith("A")));
        //Task2
        List<Book> library = new ArrayList<>();
        library.add(new Book("Мастер и Маргарита", 1920));
        library.add(new Book("Скотный двор", 1911));
        library.add(new Book("Идиот", 1933));
        library.add(new Book("Стив Джобс", 2011));
        List<Book> sortLibrary = library.stream().sorted(Comparator.comparing(Book::getYear)).collect(Collectors.toList());
        System.out.println(sortLibrary);


        //Task 3
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", "Ivanov", 19));
        people.add(new Person("Ivan", "Smirnov", 16));
        people.add(new Person("Ivan", "Petrov", 27));
        people.add(new Person("Ivan", "Fateev", 18));
        people.add(new Person("Ivan", "Sidorov", 20));

        List<String> surnamesPerson = people.stream()
                .filter(person -> person.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getAge))
                .sorted(Comparator.comparing(Person::getName))
                .limit(4)
                .map(person -> person.getSurname())
                .collect(Collectors.toList());
        System.out.println(surnamesPerson);

    }
    public static boolean getMath(String S, Predicate<String> predicate) {
        return predicate.test(S);
    }
}
