import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
  private Set<Materia> materiasACursar;
  private boolean fueAprobada;
  private Alumno alumno;

  public Inscripcion(Alumno alumno, Set<Materia> materiasACursar) {
    this.alumno = alumno;
    this.materiasACursar = materiasACursar;
  }

  public void agregarMateria(Materia materia) {
    this.materiasACursar.add(materia);
  }

  public boolean aprobada() {
    fueAprobada = this.materiasACursar
        .stream()
        .allMatch(m -> m.cumpleCorrelativas(alumno.getMateriasAprobadas()));
    return fueAprobada;
  }
}
