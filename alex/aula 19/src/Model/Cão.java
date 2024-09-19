package Model;

public class Cão extends Animal{
    private int Tam_Pata;

   public Cão(String Nome, int Idade, String Cor) {
        super(Nome, Idade, Cor);
        
    }

    @Override
    public void fazer_barulho(){
        System.out.println("au au");
    }
    
    

}
