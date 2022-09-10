package Yawer.Yawer.Domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import Yawer.Yawer.Enums.Roles;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long id;

    @Column (name = "NombreEmpleado")
    public String Nombre_Empleado;

    @Column (name = "Email", unique = true, nullable = false)
    public String Email;

    @Column (name = "Empresa")
    public String Empresa;


    @Enumerated(EnumType.STRING)
    @Column (name = "Roles")
    public Roles Roles;


    // @ManyToOne
    // @JoinColumn(name = "Empresa")
    //  private Empresa empresa;


    @OneToMany
    @JoinColumn(name = "MovimientoDinero")
    private List<MovimientoDinero> movimientoDinero;

   // @OneToMany
    //@JoinColumn(name = "Roles")
    //  List<Roles> roles;

}
