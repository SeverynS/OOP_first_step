public class Animal {

    private String subspecies;
    private String byname;
    private int age;
    private int weight;
    private String color;

    private void playing(){
        System.out.println(this.byname + "playing");
    }

    private void breathing() {
        System.out.println(this.byname + " breathing");
    }

    private void sleaping() {
        System.out.println(this.byname + " sleeping");
    }

    private void eating() {
        System.out.println(this.byname + " eating");
    }

    private void byteing() {
        System.out.println(this.byname + "bytes you!");
    }


    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
