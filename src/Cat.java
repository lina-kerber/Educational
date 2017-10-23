public class Cat {
    private int age; // вораст кота
    private String name; // имя кота
    private String color; // цвет кота

    public void voice() {  //кот мяукает
        System.out.println("mew...\n");
    }

    public void jump() { //кот прышает
        for (int i = 5; i <= age; i++) {
            System.out.println("Leaping cat.....pam-pam...\n");
        }
    }

    public String playwiththings(String things) { // так же, например, предположительно созданный класс вещей,т.е. клубок,мышь
        String mouse = things + " pipipi ffffff maauuuu....\n";
        return mouse;
    }

    Cat(String name, int age, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Larik", 7, "white");
        cat1.jump();
        cat1.voice();
        String play = cat1.playwiththings("play with mouse");
        System.out.println(play);
    }
}


