package U7.CORONAVIRUS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class coronavirus {

    private String nombre;
    private String localidad;
    private Map<String, Set<pacientes>> persona;
    private Object pacientes;

    public coronavirus(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        persona = new HashMap<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Map<String, Set<pacientes>> getPersona() {
        return persona;
    }

    public void setPersona(Map<String, Set<pacientes>> persona) {
        this.persona = persona;
    }

    public void addPaciente(String cepa, pacientes personas) {
        if (personas.getCepa().equals(cepa)) {
            if (!persona.containsKey(cepa)) {
                persona.put(cepa, new TreeSet<pacientes>());
            }
            persona.get(cepa).add(personas);
        } else {
            System.out.println("El paciente no tiene esa cepa");
        }
    }

    public boolean dardealtapaciente(pacientes personas) {
        if (!persona.containsKey(personas.getCepa())) {
            System.out.println("No se ha encontrado el paciente");
            return false;
        } else {
            if (persona.get(personas.getCepa()).contains(pacientes)) {
                return persona.get(personas.getCepa()).remove(pacientes);
            } else {
                System.out.println("No esta en la lista de infectados con esa cepa");
                return false;
            }
        }
    }

    public void pacientesPorPeso(String cepa) {
        if (!persona.containsKey(cepa)) {
            System.out.println("No hay pacientes");
        } else {
            System.out.println(persona.get(cepa));
        }
    }

    public void pacientesPorEdad(String cepa) {
        if (!persona.containsKey(cepa)) {
            System.out.println("No hay perros inscritos de esa raza");
        } else {
            List<pacientes> lista = new ArrayList<>(persona.get(cepa));

            Collections.sort(lista, new Comparator<pacientes>() {
                @Override
                public int compare(pacientes persona, pacientes t1) {
                    return t1.getEdad()-persona.getEdad();
                }
            });

            System.out.println(lista);
        }

    }

    public void pacientesdeundoctor(int id) {

        Collection<Set<pacientes>> conjunto = persona.values();
        int numpacientes = 0;

        Iterator it = conjunto.iterator();

        while (it.hasNext()) {
            Set<pacientes> paci = (Set<pacientes>) it.next();

            for (pacientes p : paci) {
                if (p.getMedico().getNum_colegiado() == id) {
                    System.out.println(p);
                    numpacientes++;
                }
            }
        }

        if (numpacientes==0) {
            System.out.println("El medico no trata ningun paciente");
        }

    }

    public void cargarPacientes() {
        try {
            ObjectInputStream u = new ObjectInputStream(new FileInputStream("pacientes.dat"));

            while (true) {
                pacientes p = (pacientes) u.readObject();
                addPaciente(p.getCepa(),p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void guardarPacientes() {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("pacientes.dat"));
            Collection<Set<pacientes>> conjunto = persona.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()) {
                Set<pacientes> paci = (Set<pacientes>) it.next();

                for (pacientes p : paci) {
                    o.writeObject(p);
                }
            }

            o.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
