package day30_CustomClass_Info2;

public class Dog {


        public String name;
        public String breed;
        public int age;
        public char gender;
        public String color;
        public String size;


        public void setInfo(String dogName,String dogBreed, int dogAge,char dogGender,String dogColor,String dogSize){
                name=dogName;
                breed=dogBreed;
                age=dogAge;
                gender=dogGender;
                color=dogColor;
                size=dogSize;
        }


        public void eating () {

            System.out.println(name + " is eating");
        }
        public void barking () {
            System.out.println(name + " is barking");
        }

        public String toString() {
                return "Dog{" +
                        "name='" + name + '\'' +
                        ", breed='" + breed + '\'' +
                        ", age=" + age +
                        ", gender=" + gender +
                        ", color='" + color + '\'' +
                        ", size='" + size + '\'' +
                        '}';
        }
}


