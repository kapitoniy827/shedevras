package main;

public class lesson5ex2 {
	// Пользовательское исключение для ошибки размера массива
	class MyArraySizeException extends Exception {
	    public MyArraySizeException(String message) {
	        super(message);
	    }
	}

	// Пользовательское исключение для некорректных данных
	class MyArrayDataException extends Exception {
	    public MyArrayDataException(String message) {
	        super(message);
	    }
	}

	public class ArrayProcessor {
	    	    public static int processArray(String[][] array) 
	        throws MyArraySizeException, MyArrayDataException {
	        
	        // Проверка размера внешнего массива
	        if (array.length != 4) {
	            throw new MyArraySizeException("Ошибка: размер внешнего массива должен быть 4");
	        }
	        
	        int sum = 0;
	        
	        // Проверка каждого внутреннего массива и преобразование
	        for (int i = 0; i < array.length; i++) {
	            String[] innerArray = array[i];
	            
	            // Проверка размера внутреннего массива
	            if (innerArray.length != 4) {
	                throw new MyArraySizeException("Ошибка: размер внутреннего массива должен быть 4");
	            }
	            
	            for (int j = 0; j < innerArray.length; j++) {
	                try {
	                    // Попытка преобразования строки в число
	                    int number = Integer.parseInt(innerArray[j]);
	                    sum += number;
	                } catch (NumberFormatException e) {
	                    // Формирование информативного сообщения об ошибке
	                    throw new MyArrayDataException(
	                        "Ошибка в ячейке [" + i + "][" + j + "]: " + 
	                        "некорректное значение '" + innerArray[j] + "'"
	                    );
	                }
	            }
	        }
	        
	        return sum;
	    }
	    
	    public static void main(String[] args) {
	        try {
	            // Пример корректного массива
	            String[][] correctArray = {
	                {"1", "2", "3", "4"},
	                {"5", "6", "7", "8"},
	                {"9", "10", "11", "12"},
	                {"13", "14", "15", "16"}
	            };
	            
	            System.out.println("Сумма: " + processArray(correctArray));
	            
	            // Пример массива с ошибкой
	            String[][] wrongArray = {
	                {"1", "2", "три", "4"},  // Ошибка в третьей ячейке
	                {"5",
	

}
