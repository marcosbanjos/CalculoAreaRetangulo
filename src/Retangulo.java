public class Retangulo {
    double lado;
    double  altura;
    double area;

    Retangulo (double lado, double altura) {
        this.lado = lado;
        this.altura = altura;

    }
    double calcArea(){
        return this.altura * this.lado;
    }
}
