package dev.smars.oauth2_TSTWM.reservacion;

import dev.smars.oauth2_TSTWM.producto.Producto;
import dev.smars.oauth2_TSTWM.servicio.Servicio;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "detallereservacion")
public class DetalleReservacion {
  @Id
  @GeneratedValue
  private int detalle_reservacion_id;

  private String total;
  private String subtotal;

  @ManyToOne
  private Reservacion reservacion;

  @ManyToOne
  private Producto producto;
  @ManyToOne
  private Servicio servicio;

}
