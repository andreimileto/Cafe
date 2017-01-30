/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

/**
 *
 * @author Mileto-pc
 */
public class ControlaCafe {
    Bebidas vetorBebidas[] = new Bebidas[1000];
    int count = 0;
    public boolean CadastrarBebida(Bebidas bebidas) {
        if(count < vetorBebidas.length){
            vetorBebidas[count]=bebidas;
            count ++;
            return true;
        }
        return false;
        
    }
    
    

}
