package lesson8;

public class FinalTest {
    private final String name;
    private final String surname;
    private final int age;

//    public FinalTest() {
//    }
// C конструктором по-умолчанию переменные будут name, surname = null, age = 0, и записать туда ничего нельзя и ИДЕя не
// хочет работать

    public FinalTest(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    //Setter нельзя создать так как перезаписать переменную с "final" нельзя


}
