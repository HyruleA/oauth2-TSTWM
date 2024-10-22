package dev.smars.oauth2_TSTWM.reservacion;

import dev.smars.oauth2_TSTWM.habitacion.Habitacion;
import dev.smars.oauth2_TSTWM.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservacion")
public class Reservacion {
  @Id
  @GeneratedValue
  private int reservacion_id;

  private String folio_reservacion;
  private Date fecha_reservacion;
  private Date fecha_checkin;
  private Date fecha_checkout;
  private Boolean estado_reservacion;
  private String costo_total;

  @ManyToOne
  private Habitacion habitacion; // Relación con la habitación

  @ManyToOne
  private User user; // Relación con el usuario
}