
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
public class TipoMedicamento {

    @Id
    private int id;
    private String nombre;
    private boolean activo;

}