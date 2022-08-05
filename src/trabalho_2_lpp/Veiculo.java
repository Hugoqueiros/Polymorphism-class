package trabalho_2_lpp;

public class Veiculo {

    private int capacidade;
    private String matricula;
    Aviao aviao;

    public Veiculo() {
        capacidade = 0;
        matricula = "";
    }
    
    public Veiculo(int capacidade, String matricula){
    this.capacidade = capacidade;
    this.matricula = matricula;
    }
    
    public Veiculo( int capacidade, String matricula, Aviao aviao){
        this.capacidade = capacidade;
        this.matricula = matricula;
        this.aviao = aviao;
    }
    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "capacidade=" + capacidade + ", matricula=" + matricula + '}';
    }
    
    public void print(){
        System.out.println("Lotação Máxima: " + capacidade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Detalhes do Transporte: " + aviao);
    }
}
