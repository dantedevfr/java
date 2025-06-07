package Models;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpleados {
    List<Empleado> listaEmpleados = new ArrayList<>();

    public void addEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    public void mostratListaEmpleados(){
        for (Empleado empleado: listaEmpleados){
            System.out.println(empleado.mostrarInformacion());
        }
    }
}
