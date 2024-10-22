package dev.smars.oauth2_TSTWM.hotel;

import dev.smars.oauth2_TSTWM.empresa.Empresa;
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
@Table(name = "hotel")
public class Hotel {
  @Id
  @GeneratedValue
  private int hotel_id;

  private String nombre_hotel;
  private String direccion;
  private String descripcion;
  private Boolean estado;

  @ManyToOne
  private Empresa empresa; // Relación con la empresa
}
