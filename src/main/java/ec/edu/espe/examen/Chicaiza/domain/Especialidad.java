package ec.edu.espe.examen.Chicaiza.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ESPECIALIDAD")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ESPECIALIDAD", nullable = false)
    private String codEspecialidad;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Version
    private Long version;

    public Especialidad() {
    }

    public Especialidad(String codEspecialidad) {
        this.codEspecialidad = codEspecialidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codEspecialidad == null) ? 0 : codEspecialidad.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Especialidad other = (Especialidad) obj;
        if (codEspecialidad == null) {
            if (other.codEspecialidad != null)
                return false;
        } else if (!codEspecialidad.equals(other.codEspecialidad))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Especialidad [codEspecialidad=" + codEspecialidad + ", nombre=" + nombre + ", version=" + version + "]";
    }

    
    

    

}
