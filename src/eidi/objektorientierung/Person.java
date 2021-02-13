package eidi.objektorientierung;

public class Person {
    private String name;
    private int age;
    private long licenseId;

    public Person(String name, int age, long licenseId) {
        this.name = name;
        this.age = age;
        this.licenseId = licenseId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getLicenseId() {
        return licenseId;
    }
}
