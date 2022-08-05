package trabalho_2_lpp;

public class Pessoa {
        
    // variaveis de instancia
    protected String nome;
    public String nacionalidade ;
    private int idade;
    public Pessoa clone;
    private Pessoa Copia;
    
    // construtor sem parametros
    public Pessoa(){
        nome = "";
        nacionalidade = "";
        idade = 0;
    }
    
    // construtor com parametros
    public Pessoa( String nome, String nacionalidade, int idade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }
    
    public Pessoa(Pessoa copia){
        clone.nome = copia.nome;
        clone.nacionalidade = copia.nacionalidade;
        clone.idade = copia.idade;
    }
    
    public Pessoa clone(){
        clone = new Pessoa();
        clone.nome = this.nome;
        clone.nacionalidade = this.nacionalidade;
        clone.idade = this.idade;
        System.out.println(clone);
        return clone;
    }
    
    
    // metodos de instancia - metodos de acesso
    // os metodos de instancia apenas atuam sobre as variaveis de instancia
    public void setNome( String nome ){  // metodo modificador
        this.nome = nome;
    }
    
    public String getNome(){  // metodo interrogador
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public void setIdade( int idade ){  // metodo modificador
        this.idade = idade;
    }
    
    public int getIdade(){  // metodo interrogador
        return idade;
    }
    
    
    // outros metodos de instancia
    // metodo para escrever as variaveis privadas 
    public void print(){
        System.out.println("\n__________Informações_________");
        System.out.println( "Nome  : " + nome );
        System.out.println( "Nacionalidade: " + nacionalidade );
        System.out.println( "Idade : " + idade );
        
    }
    
    @Override // sobreposiÃ§Ã£o (override) do mÃ©todo toString
    public String toString(){
        return "" + nome + "|" + nacionalidade + "|" + idade;
    }
}

