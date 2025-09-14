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
        System.out.println("Дата производства: " + 
                датаПроизводства.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println("Производитель: " + производитель);
        System.out.println("Страна происхождения: " + странаПроисхождения);
        System.out.println("Цена: " + цена + " руб.");
        System.out.println("Статус бронирования: " + 
                (забронирован ? "Забронирован" : "Свободен"));
        System.out.println("---------------------------");
    }

    // Геттеры и сеттеры (можно добавить по необходимости)
    // ...

    public static void main(String[] args) {
        // Объявляем массив объектов
        Товар[] productsArray = new Товар[5];

        // Заполняем массив объектами
        productsArray[0] = new Товар(
                "Samsung S25 Ultra",
                "2025-02-01",
                "Samsung Corp.",
                "South Korea",
                55990.0,
                true
        );

        productsArray[1] = new Товар(
                "iPhone 16 Pro Max",
                "2025-03-15",
                "Apple Inc.",
                "China",
                99990.0,
                false
        );

        productsArray[2] = new Товар(
                "Xiaomi 15 Ultra",
                "2025-04-20",
                "Xiaomi Corporation",
                "China",
                49990.0,
                true
        );

        productsArray[3] = new Товар(
                "Google Pixel 9",
                "2025-05-10",
                "Google LLC",
                "USA",
                79990.0,
                false
        );

        productsArray[4] = new Товар(
                "Huawei P60 Pro",
                "2025-06-05",
                "Huawei Technologies",
                "China",
                69990.0,
                true
        );

        // Выводим информацию обо всех товарах
        for (Товар product : productsArray) {
            product.показатьИнформацию();
        }
    }
}
