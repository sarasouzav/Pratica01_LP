import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        double velocidade, tempo, distancia,kmlitro;
        double consumo;
        //antes de ler temos que inserir o scanner
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a velocidade");
        velocidade = ler.nextDouble();

        System.out.println("Digite tempo gasto");
        tempo = ler.nextDouble();

        System.out.println("Digite o KM/L");
        kmlitro = ler.nextDouble();

        distancia = velocidade * tempo;
        consumo = distancia /kmlitro;
        // tudo dentro de aspas eh texto
        System.out.println("Consumo médio:" +  String.format("%.2f",consumo));

    }
}
