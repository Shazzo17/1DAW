/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personas_con_el_mismo_pelo_edad;

/**
 *
 * @author mesteso
 */
public class Personas_Con_el_mismo_pelo_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servicios ser=new Servicios();
       Personas[] per=new Personas[50];
       Pelos_iguales[] pi=new Pelos_iguales[30];
       int longitud_personas;
       int longitud_pelo_edad;
       longitud_personas = ser.entrada_datos(per);
       longitud_pelo_edad= ser.Personas_mismo_pel_edad(per, longitud_personas, pi);
       
       
        
    }
    
}
