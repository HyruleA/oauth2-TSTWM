package dev.smars.oauth2_TSTWM.habitacion;

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
@Table(name = "habitacion")
public class Habitacion {
  @Id
  @GeneratedValue
  private int habitacion_id;

  private String nombre_habitacion;
  private String tipo_habitacion;
  private String precio;
  private Boolean disponibilidad;
  private String capacidad;

  @ManyToOne
  private Hotel hotel; // Relación con el hotel
}
