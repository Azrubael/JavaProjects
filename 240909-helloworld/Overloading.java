import java.util.Scanner;


class Overloading {
    String lang;
    int version;

    Overloading() {
        this.lang = "Java";
        this.version = 21;
    }

    Overloading(String lang) {
        this.lang = lang;
        if (lang == "Java") {
            this.version = 21;
        } else if (lang == "Python") {
            this.version = 3;
        }
    }

    Overloading(String lang, int version) {
        this.lang = lang;
        this.version = version;
    }
    
    Overloading(int version, String lang) {
        this.lang = lang;
        this.version = version;
    }

    public void getLang() {
        System.out.println("The setted language is: " + this.lang + " version " + this.version);
    }

    public void setVersion(int version) {
        this.version = version;
        System.out.println("Set the language: " + this.lang + " to version " + this.version);
    }

    public static void main(String[] args) {
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading("Python");
        Overloading obj3 = new Overloading(17, "Java");
        Overloading obj4 = new Overloading("Python", 2);
        obj1.getLang();
        obj2.getLang();
        obj3.getLang();
        obj4.getLang();
        obj4.setVersion(8);
    }

}