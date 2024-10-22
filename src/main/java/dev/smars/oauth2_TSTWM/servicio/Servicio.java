package dev.smars.oauth2_TSTWM.servicio;

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
@Table(name = "servicio")
public class Servicio {
  @Id
  @GeneratedValue
  private int servicio_id;

  private String nombre_servicio;
  private String descripcion;
  private String precio;
  private Boolean disponibilidad;

  @ManyToOne
  private Hotel hotel; // Relación con el hotel
}
