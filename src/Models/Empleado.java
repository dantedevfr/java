package Models;

import Exceptions.SueldoException;

public class Empleado {
    int id;
    String nombre;
    float sueldo;



    public Empleado(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.sueldo = 0;
    }

    public void addSueldo(int sueldo){
        try {
            validateSueldo(sueldo);
            this.sueldo = sueldo;
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void validateSueldo(int value) throws SueldoException {
        if(value > 0){
            System.out.println("Correct salary");
        }else{
            throw new SueldoException("Sueldo no correcto");
        }
    }

    public void aumentarSueldo(int aumento){
        this.sueldo = this.sueldo+aumento;
    }
    public String mostrarInformacion(){
        return  "Id: "+id+ " Nombre: "+nombre+ " Sueldo: "+sueldo;
    }
}
