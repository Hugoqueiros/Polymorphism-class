package trabalho_2_lpp;

public class Passageiro extends Pessoa {

    private String passaporte;

    public Passageiro() {
        super();
        passaporte = "";
    }

    public Passageiro(String nome, String nacionalidade, int idade, String passaporte) {
        super(nome, nacionalidade, idade);
        this.passaporte = passaporte;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
    
    public void verificaNacionalidade(String origem){
        this.nacionalidade = this.nacionalidade.toLowerCase();
        origem = origem.toLowerCase();
        if(this.nacionalidade.equals(origem)){
            System.out.println("Cidadão Residente");
        }
        else{
            System.out.println("Cidadão Estrangeiro");
        }
    }

    @Override
    public String toString() {
        return "Passageiro{" + "passaporte=" + passaporte + '}';
    }

    public void print() {
        super.print();
        System.out.println("Nº Passaporte: " + passaporte);
    }

}
