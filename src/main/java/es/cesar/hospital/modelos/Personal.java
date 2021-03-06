package es.cesar.hospital.modelos;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "personal")
public class Personal {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "dni", nullable = false)
    private String dni;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @OneToOne
    @Column(name = "turno", nullable = false)
    private Turno turno;

    @OneToOne
    @Column(name = "tipo_personal", nullable = false)
    private TipoPersonal tipoPersonal;

    @OneToMany
    @Column(name = "cita", nullable = false)
    private List<Cita> cita;
    
}
