import java.util.Scanner;
public class Carro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String placa;
        int ano;
        System.out.println("Digite a Placa:");
        // next.LINE (line ler a frase) e NEXT eh uma palavra
        placa = ler.next();

        System.out.println("Digite o ano:");
        ano = ler.nextInt();
        // se colocar ; no IF ele nao funciona o comando d baixo
        if(ano <= 2010)
        System.out.println("Carro velho");

        else if(ano <=2022)
            System.out.println("Carro seminovo");

        else if (ano==2023)
            System.out.println("Carro novo");

        else
            System.out.println("Inválido");
        // Desta forma coloco a placa apenas em maiusculo
        placa = placa.toUpperCase();
 // length retornar o tamanho da string
        // == é comparação e 1 = é atribuição
        for (int i = 0;i<placa.length();i++){
            if (placa.charAt(i)=='A' || placa.charAt(i)=='E' ||  placa.charAt(i)=='I' ||  placa.charAt(i)=='O' ||  placa.charAt(i)=='U' )
       placa = placa.replace(placa.charAt(i),'*');

        }

        System.out.println("Placa alterada" + placa);


    }
}
