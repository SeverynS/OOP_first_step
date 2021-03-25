public class User {

    private String name;
    private String surname;
    private String email;
    private boolean sex;
    private int age;

    private void walking() {
        System.out.println(this.name + " walks");
    }

    private void eating() {
        System.out.println(this.name + " eats");
    }

    private void sleaping() {
        System.out.println(this.name + " sleeps");
    }

    private void reading() {
        System.out.println(this.name + " reading");
    }

    private void breathing() {
        System.out.println(this.name + " breathing");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
