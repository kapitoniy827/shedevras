public class TriangleAreaCalculator {public double calculateArea(double a, double b, double c) {
    // Формула Герона
    double p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}
}
