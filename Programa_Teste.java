public class Programa_Teste {

    public static void main(String[] args) {
    Candidato cand = new Candidato(40 , "João Campus");
    System.out.println("Numero de votos do(a) candidato(a) "+ cand.getNome()+ "( "+cand.getNumoro_candidato()+" ) : " + cand.getNumero_votos() );
    cand.incremento_votos(1);
    System.out.println("Numero de votos do candidato "+ cand.getNome()+ "( "+cand.getNumoro_candidato()+" ) : "+ cand.getNumero_votos() );

    }
}