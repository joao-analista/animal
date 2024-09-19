import javax.sound.sampled.SourceDataLine;

import Model.Animal;
import Model.Cão;

public class App {
    public static void main(String[] args) throws Exception {
        Animal A = new Animal("nasus",200,"Cinza");
   System.out.println("Nome do animal:"+ A.getNome());
   System.out.println("Idade"+ A.getIdade());
   System.out.println("Cor"+A.getCor());
    
    Cão C = new Cão("warwick",40,"azul");
  System.out.println("Nome:"+C.getNome());
    C.fazer_barulho();
    }
}
