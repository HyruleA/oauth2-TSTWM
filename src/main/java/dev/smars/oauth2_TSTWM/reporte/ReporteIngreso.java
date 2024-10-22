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
@Table(name = "reporteingreso")
public class ReporteIngreso {
  @Id
  @GeneratedValue
  private int reporte_ingreso_id;

  private Date fecha_inicio;
  private Date fecha_fin;
  private String ingreso_total;

  @ManyToOne
  private Empresa empresa;
}
