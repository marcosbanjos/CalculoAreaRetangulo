import java.util.Scanner;
public class testarRetangulo {

    public static void main(String[] args) {


        Scanner strDist = new Scanner(System.in);

        System.out.print("Informe o lado do retandgulo: ");
        double lado = strDist.nextDouble();

        System.out.print("Informe a altura do retangulo: ");
        double altura = strDist.nextDouble();

        Retangulo retangulo = new Retangulo(lado, altura);

        double area = retangulo.calcArea();
        System.out.print("A area é " + area);
    }
}
