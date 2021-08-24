package Chapter5;

public class PersonTest {
  public static void main(String[] args) {
    /*
     * Person person = new Person(); person.age = 40; person.name = "James";
     * person.isMarried = true; person.children = 3;
     */

    Person person = new Person(40, "James", true, 3);
    person.showinfo();

    Person person2 = new Person(30, "Peter");
    person2.showinfo();
  }
}
