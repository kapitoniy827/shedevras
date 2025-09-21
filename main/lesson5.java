package main;
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
public class ArrayProcessor {
    /**
     * Метод для обработки двумерного строкового массива
     * @param array входной массив для обработки
     * @throws MyArraySizeException если размер массива не соответствует 4x4
     */
    public static void processArray(String[][] array) throws MyArraySizeException {
        // Проверяем размер внешнего массива
        if (array.length != 4) {
            throw new MyArraySizeException("Ошибка: размер внешнего массива должен быть 4");
        }
        
        // Проверяем размер каждого внутреннего массива
        for (String[] innerArray : array) {
            if (innerArray.length != 4) {
                throw new MyArraySizeException("Ошибка: размер внутреннего массива должен быть 4");
            }
        }
        
        // Здесь можно добавить логику обработки массива
        System.out.println("Массив корректен и имеет размер 4x4");
    }
    
    public static void main(String[] args) {
        try {
            // Пример использования
            String[][] testArray = new String[4][4];
            processArray(testArray);
            
            // Этот вызов вызовет исключение
            String[][] wrongArray = new String[3][4];
            processArray(wrongArray);
            
        } catch (MyArraySizeException e) {
            System.err.println(e.getMessage());
        }
    }
}
