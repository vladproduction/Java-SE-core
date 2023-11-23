package Finalize.ch01;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Constructor()");
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize()");
            String text = null;
            System.out.println("text="+text);
            text.toLowerCase();
            System.out.println("finalize completed");
        }catch (NullPointerException ex){
            //ex.printStackTrace();
            System.out.println("exception.getMessage="+ex.getMessage());
        } finally {
            super.finalize();
        }

    }
}
