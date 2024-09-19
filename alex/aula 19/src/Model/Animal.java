package Model;

public class Animal {
    private String Nome;
    private int Idade;
    private String Cor;

    public Animal(String Nome, int Idade, String Cor){
        this.Nome= Nome;
        this.Idade=Idade;
        this.Cor=Cor; 

    }
    public void fazer_barulho(){
        System.out.println("Fazendo barulho!!!");
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public void setCor(String cor) {
        Cor = cor;
    }
    public String getNome() {
        return Nome;
    }
    public int getIdade() {
        return Idade;
    }
    public String getCor() {
        return Cor;
    }
    
    
    
 
   
}