package trabalho_2_lpp;

public class Aviao extends Veiculo {

    private String origem;
    private String destino;
    private int lotacao_pa;
    private int lotacao_pi;
    
    public Aviao(){
        super();
        origem= "";
        destino = "";
        lotacao_pa = 0;
        lotacao_pi = 0;
    }
    
    public Aviao (int capacidade, String matricula, String origem, String destino, int lotacao_pa, int lotacao_pi){
        super(capacidade, matricula);
        this.origem = origem;
        this.destino = destino;
        this.lotacao_pa = lotacao_pa;
        this.lotacao_pi = lotacao_pi;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getLotacao_pa() {
        return lotacao_pa;
    }

    public void setLotacao_pa(int lotacao_pa) {
        this.lotacao_pa = lotacao_pa;
    }

    public int getLotacao_pi() {
        return lotacao_pi;
    }

    public void setLotacao_pi(int lotacao_pi) {
        this.lotacao_pi = lotacao_pi;
    }

    @Override
    public String toString() {
        return "\nVeículo- Aviao" + "\nOrigem- " + origem + "\nDestino- " + destino + "\nLugares para passageiros- " + lotacao_pa + "\nLotação para piloto- " + lotacao_pi;
    }
}
