import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Materia {
  private String nombre;
  private Set<Materia> correlativas;

  public Materia(String nombre, Set<Materia> correlativas) {
    this.nombre = nombre;
    this.correlativas = correlativas;
  }

  public void agregarCorrelativa(Materia correlativa) {
    this.correlativas.add(correlativa);
  }

  public boolean cumpleCorrelativas(Set<Materia> materias) {
    return materias.containsAll(correlativas);
  }

  public Set<Materia> getMateriasAprobadas() {
    return correlativas;
  }
}
