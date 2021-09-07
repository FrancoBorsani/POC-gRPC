
package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Medicamento {

    @Id
    private int id;
    private String codigo;
    private String nombreComercial;
    private String nombreDroga;
    private String tipo;


}