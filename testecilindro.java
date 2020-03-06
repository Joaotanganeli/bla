
public class testecilindro {
    
    public static void main (String[]args){
    /*()= Método construtor: constrói um objeto e,
    o primeiro método que roda.
      - Tem o mesmo nome da Classe.
      - Não retorna valor / não é VOID.
      - Atribui valores iniciais ao objeto.
        
      */
    cilindro c1 = new cilindro(15,2.5);
            //c1.setAlturaBase(23);
            //c1.setRaioBase(2.5);
             
             System.out.println("Area Total C1:" +c1.areaTotal());
             
    cilindro c2 = new cilindro(5,2.5);         
             System.out.println("Area Total C2:" +c2.areaTotal());
    }
}
