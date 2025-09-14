// Базовый класс
public class Животное {
    // Счетчик всех животных
    protected static int countAnimals = 0;
    protected String имя;

    public Животное(String имя) {
        this.имя = имя;
        countAnimals++;
    }

    // Метод бега
    public void run(int дистанция) {
        System.out.println(имя + " пробежал " + дистанция + " м.");
    }

    // Метод плавания
    public void swim(int дистанция) {
        System.out.println(имя + " проплыл " + дистанция + " м.");
    }

    // Получить количество всех животных
    public static int getCountAnimals() {
        return countAnimals;
    }
}

// Класс Собака
public class Собака extends Животное {
    // Счетчик собак
    private static int countDogs = 0;
    private final int maxRun = 500; // макс. дистанция бега
    private final int maxSwim = 10; // макс. дистанция плавания

    public Собака(String имя) {
        super(имя);
        countDogs++;
    }

    @Override
    public void run(int дистанция) {
        if (дистанция <= maxRun) {
            System.out.println(имя + " пробежал " + дистанция + " м.");
        } else {
            System.out.println(имя + " не смог пробежать " + дистанция + " м. (максимум " + maxRun + " м.)");
        }
    }

    @Override
    public void swim(int дистанция) {
        if (дистанция <= maxSwim) {
            System.out.println(имя + " проплыл " + дистанция + " м.");
        } else {
            System.out.println(имя + " не смог проплыть " + дистанция + " м. (максимум " + maxSwim + " м.)");
        }
    }

    // Получить количество собак
    public static int getCountDogs() {
        return countDogs;
    }
}

// Класс Кот
public class Кот extends Животное {
    // Счетчик котов
    private static int countCats = 0;
    private final int maxRun = 200; // макс. дистанция бега
    private boolean сытый = false; // сытость кота
    private int порция = 5; // количество еды, которое кот съедает за раз

    public Кот(String имя) {
        super(имя);
        countCats++;
    }

    @Override
    public void run(int дистанция) {
        if (дистанция <= maxRun) {
            System.out.println(имя + " пробежал " + дистанция + " м.");
        } else {
            System.out.println(имя + " не смог пробежать " + дистанция + " м. (максимум " + maxRun + " м.)");
        }
    }

    @Override
    public void swim(int дистанция) {
        System.out.println(имя + " не умеет плавать!");
    }

    // Метод для кормления
    public void покормиться(Миска миска) {
        if (миска.съесть(порция)) {
            сытый = true;
            System.out.println(имя + " поел и сыт!");
        } else {
            System.out.println(имя + " не смог поесть (мало еды)");
        }
    }

    // Проверка сытости
    public boolean isСытый() {
        return сытый;
    }

    // Сброс сытости
    public void setСытый(boolean сытый) {
        this.сытый = сытый;
    }

    // Получить количество котов
    public static int getCountCats() {
        return countCats;
    }
}

// Класс Миска
public class Миска {
    private int количествоЕды;

    public Миска(int начальноеКоличество) {
        this.количествоЕды = начальноеКоличество;
    }

    // Метод добавления еды
    public void добавитьЕду(int количество) {
        количествоЕды += количество;
        System.out.println("В миску добавлено " + количество + " единиц еды");
    }

    // Метод поедания еды
    public boolean съесть(int количество) {
        if (количествоЕды >= количество) {
            количествоЕды -= количество;
            return true;
        }
        return false;