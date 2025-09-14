// Интерфейс для геометрических фигур

public interface Фигура {

    // Дефолтный метод для расчета периметра
    default double getПериметр() {
        return 0.0;
    }

    // Метод для расчета площади
    double getПлощадь();

    // Методы для работы с цветами
    String getЦветФона();

    String getЦветГраницы();
}

// Класс для круга
public class Круг implements Фигура {

    private double радиус;
    private String цветФона;
    private String цветГраницы;

    public Круг(double радиус, String цветФона, String цветГраницы) {
        this.радиус = радиус;
        this.цветФона = цветФона;
        this.цветГраницы = цветГраницы;
    }

    @Override
    public double getПериметр() {
        return 2 * Math.PI * радиус;
    }

    @Override
    public double getПлощадь() {
        return Math.PI * радиус * радиус;
    }

    @Override
    public String getЦветФона() {
        return цветФона;
    }

    @Override
    public String getЦветГраницы() {
        return цветГраницы;
    }
}

// Класс для прямоугольника
public class Прямоугольник implements Фигура {

    private double ширина;
    private double высота;
    private String цветФона;
    private String цветГраницы;

    public Прямоугольник(double ширина, double высота, String цветФона, String цветГраницы) {
        this.ширина = ширина;
        this.высота = высота;
        this.цветФона = цветФона;
        this.цветГраницы = цветГраницы;
    }

    @Override
    public double getПериметр() {
        return 2 * (ширина + высота);
    }

    @Override
    public double getПлощадь() {
        return ширина * высота;
    }

    @Override
    public String getЦветФона() {
        return цветФона;
    }

    @Override
    public String getЦветГраницы() {
        return цветГраницы;
    }
}

// Класс для треугольника
public class Треугольник implements Фигура {

    private double сторонаA;
    private double сторонаB;
    private double сторонаC;
    private String цветФона;
    private String цветГраницы;

    public Треугольник(double a, double b, double c, String цветФона, String цветГраницы) {
        this.сторонаA = a;
        this.сторонаB = b;
        this.сторонаC = c;
        this.цветФона = цветФона;
        this.цветГраницы = цветГраницы;
    }

    @Override
    public double getПериметр() {
        return сторонаA + сторонаB + сторонаC;
    }

    @Override
    public double getПлощадь() {
        double p = getПериметр() / 2; // полупериметр
        return Math.sqrt(p * (p - сторонаA) * (p - сторонаB) * (p - сторонаC));
    }

    @Override
    public String getЦветФона() {
        return цветФона;
    }

    @Override
    public String getЦветГраницы() {
        return цветГраницы;
    }
}

// Основной класс для демонстрации
public class Main {

    public static void main(String[] args) {
        // Создаем фигуры
        Фигура круг = new Круг(5, "Красный", "Черный");
        Фигура прямоугольник = new Прямоугольник(4, 6, "Зеленый", "Синий");
        Фигура треугольник = new Треугольник(3, 4, 5, "Желтый", "Фиолетовый");

        // Выводим информацию о круге
        System.out.println("Круг:");
        System.out.println("Периметр: " + круг.getПериметр());
        System.out.println("Площадь: " + круг.getПлощадь());
        System.out.println("Цвет фона: " + круг.getЦветФона());
        System.out.println("Цвет границы: " + круг.getЦветГраницы());
        System.out.println();

        // Выводим информацию о прямоугольнике
        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + прямоугольник.getПериметр());
        System.out.println("Площадь: " + прямоугольник.getПлощадь())

    ;
