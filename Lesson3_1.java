
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Товар {

    // Поля класса
    private String название;
    private LocalDate датаПроизводства;
    private String производитель;
    private String странаПроисхождения;
    private double цена;
    private boolean забронирован;

    // Конструктор класса
    public Товар(String название, String датаПроизводства, String производитель,
            String странаПроисхождения, double цена, boolean забронирован) {
        this.название = название;
        this.датаПроизводства = LocalDate.parse(датаПроизводства, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.производитель = производитель;
        this.странаПроисхождения = странаПроисхождения;
        this.цена = цена;
        this.забронирован = забронирован;
    }

    // Метод для вывода информации о товаре
    public void показатьИнформацию() {
        System.out.println("Название: " + название);
        System.out.println("Дата производства: "
                + датаПроизводства.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println("Производитель: " + производитель);
        System.out.println("Страна происхождения: " + странаПроисхождения);
        System.out.println("Цена: " + цена + " руб.");
        System.out.println("Статус бронирования: "
                + (забронирован ? "Забронирован" : "Свободен"));
    }

    // Геттеры и сеттеры (можно добавить по необходимости)
    public String getНазвание() {
        return название;
    }

    public void setНазвание(String название) {
        this.название = название;
    }

    public LocalDate getДатаПроизводства() {
        return датаПроизводства;
    }

    public void setДатаПроизводства(LocalDate датаПроизводства) {
        this.датаПроизводства = датаПроизводства;
    }

    public String getПроизводитель() {
        return производитель;
    }

    public void setПроизводитель(String производитель) {
        this.производитель = производитель;
    }

    public String getСтранаПроисхождения() {
        return странаПроисхождения;
    }

    public void setСтранаПроисхождения(String странаПроисхождения) {
        this.странаПроисхождения = странаПроисхождения;
    }

    public double getЦена() {
        return цена;
    }

    public void setЦена(double цена) {
        this.цена = цена;
    }

    public boolean isЗабронирован() {
        return забронирован;
    }

    public void setЗабронирован(boolean забронирован) {
        this.забронирован = забронирован;
    }

    // Пример использования класса
    public static void main(String[] args) {
        Товар товар = new Товар(
                "Смартфон iPhone 15",
                "2024-09-12",
                "Apple Inc.",
                "Китай",
                99990.0,
                false
        );

        товар.показатьИнформацию();
    }
}
