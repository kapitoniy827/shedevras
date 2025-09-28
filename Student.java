public class Student {private String name;
    private String group;
    private int course;
    private Map<String, Double> grades; // предмет - оценка

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    // Метод для добавления оценки
    public void addGrade(String subject, double grade) {
        grades.put(subject, grade);
    }

    // Метод для расчета среднего балла
    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Метод для удаления студентов со средним баллом < 3
    public static void removeWeakStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calculateAverage() < 3.0) {
                iterator.remove();
            }
        }
    }

    // Метод для перевода на следующий курс
    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.calculateAverage() >= 3.0) {
                student.course++;
            }
        }
    }

    // Метод для печати студентов определенного курса
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты курса " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", группа: " + group + ", курс: " + course +
                ", средний балл: " + calculateAverage();
    }
}

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        // Создаем студентов
        Student student1 = new Student("Иван Петров", "М-1", 1);
        Student student2 = new Student("Анна Сидорова", "М-1", 1);
        Student student3 = new Student("Петр Иванов", "М-2", 2);

        // Добавляем оценки
        student1.addGrade("Математика", 4.0);
        student1.addGrade("Физика", 3.5);
        student2.addGrade("Математика", 2.0);
        student2.addGrade("Физика", 2.5);
        student3.addGrade("Программирование", 4.5);

        // Добавляем в коллекцию
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Выводим всех студентов до обработки
        System.out.println("Список студентов до обработки:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Удаляем студентов со средним баллом < 3
        Student.removeWeakStudents(students);

        // Переводим на следующий курс подходящих студентов
        Student.promoteStudents(students);

        // Выводим результат после обработки
        System.out.println("\nСписок студентов после обработки:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Печатаем студентов определенного курса
        System.out.println("\nСтуденты 2 курса:");
        Student.printStudents(students, 2);
    }
}

