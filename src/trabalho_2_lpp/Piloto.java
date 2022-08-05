package trabalho_2_lpp;

public class Piloto extends Pessoa{
    
    private String carta_piloto;

    public Piloto() {
        super();
        carta_piloto = "";
    }

    public Piloto(String nome, String nacionalidade, int idade, String carta_piloto) {
        super(nome, nacionalidade, idade);
        this.carta_piloto = carta_piloto;
    }

    public String getCarta_piloto() {
        return carta_piloto;
    }

    public void setCarta_piloto(String carta_piloto) {
        this.carta_piloto = carta_piloto;
    }

    @Override
    public String toString() {
        return "Piloto{" + "carta_piloto=" + carta_piloto + '}';
    }

    public void print() {
        super.print();
        System.out.println("Carta de Piloto: " + carta_piloto);
    }
    
}
