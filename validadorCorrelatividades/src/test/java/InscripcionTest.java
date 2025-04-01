
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InscripcionTest {

  @Test
  public void InscripcionAprobada() {
    Materia algoritmos = new Materia("Algoritmos y estructuras de datos", Set.of() );
    Materia paradigmas = new Materia("Paradigmas de programacion", Set.of(algoritmos));

    Alumno tomas = new Alumno("Tomas", "Dallas", Set.of(algoritmos));
    Inscripcion inscripcion = new Inscripcion(tomas, Set.of(paradigmas));

    Assertions.assertTrue(inscripcion.aprobada());
  }

  @Test
  public void InscripcionRechazada() {
    Materia algoritmos = new Materia("Algoritmos y estructuras de datos", Set.of() );
    Materia paradigmas = new Materia("Paradigmas de programacion", Set.of(algoritmos));

    Alumno tomas = new Alumno("Tomas", "Dallas", Set.of());
    Inscripcion inscripcion = new Inscripcion(tomas, Set.of(paradigmas));

    Assertions.assertFalse(inscripcion.aprobada());
  }

}