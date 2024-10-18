public class Candidato {

    private String nome ;
    private int numoro_candidato;
    private int numero_votos;


    public int getNumero_votos(){
        return  numero_votos;
    }
    public void setNumero_votos(int numero_votos){
        this.numero_votos = numero_votos;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public int getNumoro_candidato(){
        return numoro_candidato;
    }
    public void setNumoro_candidato(int numoro_candidato) {
        this.numoro_candidato = numoro_candidato;
    }


    public void incremento_votos(int incremento){
     numero_votos = numero_votos + incremento;
    }

    public Candidato(int numero_candidato , String nome){
        numero_votos = 0;
        this.numoro_candidato = numero_candidato;
        this.nome = nome;
    }




}
