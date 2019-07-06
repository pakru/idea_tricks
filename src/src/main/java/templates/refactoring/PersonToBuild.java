package templates.refactoring;

import templates.Settings;

public class PersonToBuild {
    private int personId;
    private int age;
    private String name;
    private String secondName;
    private Settings settings;

    public PersonToBuild(int personId, int age, String name, String secondName, Settings settings) {
        this.personId = personId;
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.settings = settings;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "PersonToBuild{" +
                "personId=" + personId +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", settings=" + settings +
                '}';
    }
}
