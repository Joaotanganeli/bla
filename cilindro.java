
public class cilindro {
    
    private double alturaBase;
    private double raioBase;
    String msg="ERRO!";
    
    //Método contrutor
    public cilindro (double alturaBase,double raioBase){
       setAlturaBase(alturaBase);
       /*Também pode ser feito:
       this.alturaBase=alturaBase;
       this.raioBase=raioBase;
       */
       this.alturaBase=alturaBase;
       this.raioBase=raioBase;

       
    }
    public cilindro(){
    
    
    }
    
    //getters and setters
    //métodos de acessos modificadores
    //Double = Float em Python
    public double getAlturaBase(){
        return alturaBase;
    }
    
//Métodos para validar os cálculos(If e Else)
    public void setAlturaBase(double alturaBase){
        if(alturaBase<=0)
            System.out.println(msg);
        else
            this.alturaBase=alturaBase;
    }

    public double getRaioBase(){
        return raioBase;
    }
    public void setRaioBase(double raioBase){
        this.raioBase = raioBase;
    }
    public double areaTotal(){
        //Resolução para calcular a área de um cilindro
        //areatotal = 2(p.r²) + 2(p.r.h)
        return 2* (3.14*(raioBase*raioBase))+ 2*(3.14*(raioBase*alturaBase)); 
    }
}
