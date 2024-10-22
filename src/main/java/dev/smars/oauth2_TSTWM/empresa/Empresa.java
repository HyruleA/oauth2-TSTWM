package dev.smars.oauth2_TSTWM.empresa;

import dev.smars.oauth2_TSTWM.hotel.Hotel;
import dev.smars.oauth2_TSTWM.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "empresa")
public class Empresa {
  @Id
  @GeneratedValue
  private int empresa_id;

  private String nombre_empresa;
  private String direccion;
  private String email_contacto;
  private String telefono_contacto;
  private Boolean estado;

  @ManyToOne
  private User user; // Relación con el usuario

  @OneToMany(mappedBy = "empresa")
  private List<Hotel> hoteles;
}
