package laclasearrays;

import java.util.Comparator;

public class ComparatorEmpleadoNombre implements Comparator<Empleado>{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
