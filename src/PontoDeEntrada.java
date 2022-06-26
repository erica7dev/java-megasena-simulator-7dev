import java.util.*;

public class PontoDeEntrada {
    public static void main (String[] args){
        Scanner novo = new Scanner(System.in);
        System.out.println("Quantos jogos deseja fazer?");
        int numJogos = novo.nextInt();
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 60; i++) numeros.add(i);
        for (int i = 1; i <= numJogos; i++) {
            Collections.shuffle(numeros);
            for (int j = 0; j < 6; j++) System.out.println(numeros.get(j));
            System.out.println();
        }


    }
}
