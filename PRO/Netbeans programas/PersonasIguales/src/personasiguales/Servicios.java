/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personasiguales;

/**
 *
 * @author daw1-25
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
public class Servicios {
    
    
    public Personas PersonasIguales(HashSet<Personas> per) {
        ArrayList<NombresRepetidos> nr=new ArrayList<>();
        Iterator<NombresRepetidos> itrrep=nr.iterator();
        Iterator<Personas> itrper=per.iterator();
        Personas p;
        NombresRepetidos rep=null,r;
        while(itrper.hasNext()) {
            p = itrper.next();
            if(nr.isEmpty()) {
                rep = new NombresRepetidos(p.getNombre(),1);
                nr.add(rep);
            }
            else{
                r=itrrep.next();
                while(itrrep.hasNext() && p.getNombre().compareTo(r.getNombre())!=0){
                    r=itrrep.next();
                }
                if(p.getNombre().compareTo(r.getNombre())==0) {
                    rep.setRepeticiones(rep.getRepeticiones()+1);
                }
                else{
                rep = new NombresRepetidos(p.getNombre(),1);
                nr.add(rep);
                }
            }
        }
    }
    /**
     * Dado un conjunto de personas una estructura de datos con Hashset y me pide que devuelva aquellas personas que tienen el nombre igual,los campos de las personas son,el dni, el nombre, 
     * el apellido y la edad, me piden una funcion que me devuelva el conjunto de personas que tienen el nombre igual. 
     * para aquellos nombres que esten entre 2 dni dados por el usuario, el primer dni dado debe ser el menor que el segundo (no es necesario comprobar)
     */
    
    public ArrayList<NombresRepetidos> NombresIgualesSegunDniIntervalo(HashSet<Personas> per, String dni1, String dni2) {
            ArrayList<NombresRepetidos> p = new ArrayList<>();
            Iterator<NombresRepetidos> itrn=p.iterator();
            Iterator<Personas> itr=per.iterator();
            Personas pe;
            
            while(itr.hasNext()) {
                pe = itr.next();
                if(pe.getDni().compareTo(dni1)>=0 && pe.getDni().compareTo(dni2)<=0) {
                    if(pe.isEmpty()) {
                        nr=new NombresRepetidos(pe.getNombre(),1);
                        p.add(nr);
                        
                    }
                    else{
                        nr=itrn.next();    
                        while(itrn.hasNext() && pe.getNombre().compareTo(nr.getNombre())!=0) {
                            nr=itrn.next();
                        }
                        if(itrn.hasNext()){
                            nr=new NombresRepetidos(pe.getNombre(),1);
                            p.add(nr)
                        }
                        else {
                            nr.setRepeticiones(nr.getRepeticiones()+1);
                        }    
                    }
                        
                    }
                }  
    }
    /**
     * Dado un conjunto de personas, y un dni, se pide realizar una funcion que me devuelva,
     * aquellas personas que tengan el dni superior al dado.
     */
    public ArrayList<Personas> PersonasSuperioresDniDado (HashSet<Personas> per, String dni) {
        ArrayList<Personas> pe=new ArrayList<>();
        Iterator<Personas> itr=per.iterator();
        Personas p;
        while (itr.hasNext()) {
            p=itr.next();
            if (p.getDni().compareTo(dni)>0) {
                p=new Personas(p.getDni(),p.getNombre(),p.getApellido(),p.getEdad());
                pe.add(p);
            }
        }
        return pe;
    }     
    
}
