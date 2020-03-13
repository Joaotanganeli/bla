package Main;

/**
 *
 * @author Aluno
 */
public class Main {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String[] contas = {"Conta c1", "Conta c2", "Conta c3"};
          
        for (int i = 0; i < contas.length; i++) {
        Conta c1 = new Conta(contas[0],1000, "batata", 1);
        Conta c2 = new Conta(contas[1],3000, "esquerda", 2);
                    c2.creditar(100);
        Conta c3 = new Conta(contas[2],4000, "offnile", 3);
        c1.almondega();
        c2.almondega();
        c3.almondega();
        }
    }
        
    
}
