package dev.smars.oauth2_TSTWM.reporte;

import dev.smars.oauth2_TSTWM.empresa.Empresa;
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
@Table(name = "reporteocupacion")
public class ReporteOcupacion {
  @Id
  @GeneratedValue
  private int reporte_ocupacion_id;

  private Date fecha_inicio;
  private Date fecha_fin;
  private String ocupacion_porcentaje;

  @ManyToOne
  private Empresa empresa;
}

