class Complex {

    double real;
    double image;

    void add(Complex other) {
        real += other.real;
        image += other.image;
    }

    void subtract(Complex other) {
        real -= other.real;
        image -= other.image;
    }
}