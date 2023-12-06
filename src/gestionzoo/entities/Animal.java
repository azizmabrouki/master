package gestionzoo.entities;

public class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;

    
    public Animal(String family, String name, int age, boolean isMammal) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + getIsMammal() +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getFamily(){
        return family;
    }

    public void setFamily(String family)
    {
        this.family=family;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age)
    {
        if(age>0)
        { this.age=age;}
    }

    public boolean getIsMammal()
    {
        return isMammal;
    }

    public void setIsMammal(boolean isMammal)
    {
        this.isMammal=isMammal;
    }
}