package ml.pevgen.interview.example;


/**
 * Is it immutable class ?
 * If it is not, what should we change to do this class immutable ?
 */
public class ImmutablePerson {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult(){
        return this.age >= 18;
    }


}
