package main;

public class lesson5ex3 {// Пользовательское исключение для ошибки размера массива
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
	    /**
	     * Метод для обработки двумерного строкового массива
	     * @param array входной массив для обработки
	     * @return сумма всех элементов массива
	     * @throws MyArraySizeException если размер массива не 4x4
	     * @throws MyArrayDataException если в ячейке не число
	     */
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
	        // Создаем тестовые массивы
	        String[][] correctArray = {
	                {"1", "2", "3", "4"},
	                {"5", "6", "7", "8"},
	                {"9", "10", "11", "12"},
	                {"13", "14", "15", "16"}
	        };
	        
	        String[][] wrongSizeArray = {
	                {"1", "2", "3"},  // Размер не 4x4
	                {"4", "5", "6"},
	                {"7", "8", "9"}
	        };
	        
	        String[][] wrongDataArray = {
	                {"1", "2", "три", "4"},  // Некорректные данные
	                {"5", "6", "7", "8"},
	                {"9", "10", "11", "12"},
	                {"13", "14", "15", "16"}
	        };
	        
	        // Тестируем обработку массивов
	        try {
	            System.out.println("Тестирование корректного массива:");
	            int result = processArray(correctArray);
	            System.out.println("Сумма элементов: " + result);
	            
	            System.out.println("\nТестирование массива с неправильным размером:");
	            processArray(wrongSizeArray);
	            
	        } catch (MyArraySizeException e) {
	            System.err.println("Ошибка размера массива: " + e.getMessage());
	        } catch (MyArrayDataException e) {
	            System.err.println("Ошибка данных в массиве: " + e.getMessage());
	        }
	        
	        try {
	            System.out.println("\nТестирование массива с некорректными данными:");
	            int result = processArray(wrongDataArray);
	            System.out.println("Сумма элементов: " + result);
	            
	        } catch (MyArraySizeException | MyArrayDataException e) {
	            System.err.println("Произошла ошибка: " + e.getMessage());
	        }
	    }
	}


}
