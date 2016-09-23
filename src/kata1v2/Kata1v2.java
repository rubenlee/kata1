package kata1v2;

import java.util.Date;

public class Kata1v2 {
    public static void main(String[] args) {
        person erson = new person("daboi2", new Date (666,43,2));
        System.out.println(erson.getName() + " tiene " + erson.getAge() + " años!");
    }
}
