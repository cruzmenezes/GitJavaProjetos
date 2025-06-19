package JogoDaForca;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // definir a palavra a ser advinhada

        String palavraSecreta = "JAVA";

        char[] palavraOculta =  new char[palavraSecreta.length()];

        for (int i = 0; i < palavraSecreta.length(); i++){
            palavraOculta[i] = '_';


        }
        System.out.println(Arrays.toString(palavraOculta));

        // numero maximo de tentativas
        int tentattivas = 6;
        boolean venceu = false;

        //loop que solicita as letras para o usuario
        while (tentattivas > 0){
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentattivas);
            System.out.println("Digite uma letra; ");

            char letra =  scanner.next().toUpperCase().charAt(0);
            System.out.println(letra);

            boolean acertou = false;

            for (int i = 0; i < palavraSecreta.length(); i++){
                if (palavraSecreta.charAt(i) == letra){
                    palavraOculta[i] = letra;
                    acertou = true;

                }
            }

            // dedução de tentativas
            if (!acertou){
                tentattivas --;
                System.out.println("letras incorreta");

            }else {
                System.out.println("letra correta");
            }



            if (String.valueOf(palavraOculta).equals(palavraSecreta)){
                venceu = true;
                break;

            }


        }

        // a condição de vitoria

        if (venceu){
            System.out.println(" parabéns vc venceu " + tentattivas + " tentativas");


        }else {
            System.out.println(" vc perdeu!!! ");


        }

        System.out.println("A palavra era: " + palavraSecreta);
        scanner.close();





    }
}
