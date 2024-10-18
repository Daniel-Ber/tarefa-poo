import java.util.Scanner;

public class Votacao  {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantos candidatos existem ? : ");
    int numero_de_candidatos = ler.nextInt();

    Candidato[] candidato = new Candidato[numero_de_candidatos];


        for (int i = 0; i < numero_de_candidatos ; i++)
        {
            System.out.print("Digite o nome do(a) candidato(a) " + (i + 1 ) + " : ");
            ler.nextLine();
            String nome = ler.nextLine();

            System.out.print("Digite o numero do(a) candidato(a) " + (i + 1 )+ " : " );
            int numero = ler.nextInt();

            candidato[i] = new Candidato(numero , nome);
        }

        System.out.print("Digite quantos votos em sequência serão lidos : ");
        int numero_votos_sequencia = ler.nextInt();

        for (int i = 1 ; i <= numero_votos_sequencia ;i++)
        {
         System.out.print("Numero do(a)  candidato(a) que deseja votar : ");
         int numero_cand = ler.nextInt();

            for (int x  = 0 ; x < numero_de_candidatos ; x++ )
            {
                 if (numero_cand == candidato[x].getNumoro_candidato()){
                 candidato[x].incremento_votos(1);
                }
            }

        }

        for (int i = 0; i < numero_de_candidatos; i++)
        {
        System.out.println("O(A) candidato(a) "+ candidato[i].getNome() + " (" + candidato[i].getNumoro_candidato()+ ") " +" recebeu "+
                candidato[i].getNumero_votos() + " votos .");

        }

    }
}