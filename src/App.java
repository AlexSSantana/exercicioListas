import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.entities.Pessoas;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Pessoas pessoa;
        List<Pessoas> list = new ArrayList<>();

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            pessoa = new Pessoas(nome, idade, altura);
            list.add(pessoa);
        }

        Double somaAlturas = 0.0;
        Integer somaMenorIdade = 0;
        
        List<String> menorIdade = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            somaAlturas += list.get(i).getAltura();
            if(list.get(i).getAltura() < 16) {
                menorIdade.add(list.get(i).getNome());
                somaMenorIdade++;
            }
        }


        Double mediaAltura = somaAlturas / list.size();
         Double porMenores16 = (double) somaMenorIdade / list.size() * 100.0;

        System.out.printf("Altura média: %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f\n", porMenores16);
        System.out.println(menorIdade);

        input.close();

    }
}
