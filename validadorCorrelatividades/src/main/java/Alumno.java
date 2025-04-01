
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;

public class Alumno {
  private String nombre;
  private String apellido;
  @Getter
  private Set<Materia> materiasAprobadas;

  public Alumno (String nombre, String apellido, Set<Materia> materiasAprobadas) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.materiasAprobadas = materiasAprobadas;
  }

  public void agregarMateriaAprobada(Materia materia) {
    this.materiasAprobadas.add(materia);
  }

}
