package main;

public class lesson5ex4 {
	public class ArrayIndexDemo {
    public static void main(String[] args) {
        // Создаем массив из 5 элементов
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Попытка доступа к несуществующему элементу
        try {
            // Здесь мы пытаемся получить доступ к 6-му элементу (индекс 5)
            // хотя в массиве всего 5 элементов (индексы от 0 до 4)
            System.out.println("Попытка доступа к элементу с индексом 5: " + numbers[5]);
            
            // Дополнительно покажем попытку отрицательного индекса
            System.out.println("Попытка доступа к элементу с индексом -1: " + numbers[-1]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Обработка исключения
            System.err.println("Поймано исключение: " + e.getMessage());
            System.err.println("Сообщение об ошибке: Индекс выходит за границы массива");
            System.err.println("Допустимые индексы: от 0 до " + (numbers.length - 1));
        }
        
        // Демонстрация корректного доступа к элементам
        System.out.println("\nКорректный доступ к элементам массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент [" + i + "] = " + numbers[i]);
        }
    }
}


}
