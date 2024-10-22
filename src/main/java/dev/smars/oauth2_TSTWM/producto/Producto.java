package dev.smars.oauth2_TSTWM.producto;

import dev.smars.oauth2_TSTWM.hotel.Hotel;
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
@Table(name = "producto")
public class Producto {
  @Id
  @GeneratedValue
  private int producto_id;

  private String nombre_producto;
  private String descripcion;
  private String precio;
  private Boolean disponibilidad;

  @ManyToOne
  private Hotel hotel;
}
