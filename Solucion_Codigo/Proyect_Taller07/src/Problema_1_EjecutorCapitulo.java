/**
 * Problema 1 - Jerarquía de clases para el capítulo de libro
 * Dibuje un diagrama de clases que muestre la estructura de un capítulo de libro;
 * un capítulo está compuesto por varias secciones, cada una de las cuales comprende
 * varios párrafos y figuras. Un párrafo incluye varias sentencias, cada una de las
 * cuales contiene varias palabras.
 * @author Junior Rodriguez
 * @version 1.0
 */
import java.util.ArrayList;
class Palabra{
    public String caracter;

    public Palabra(String caracter) {
        this.caracter = caracter;
    }    
}
class Sentencia{
    public ArrayList<Palabra> palabras= new ArrayList<>();
}
abstract class Componente{}
class Parrafo extends Componente{
    public ArrayList<Sentencia> sentencias= new ArrayList<>();
}
class Figuras extends Componente{}
class Seccion{
    public ArrayList<Componente> componentes= new ArrayList<>();
}
class Capitulo{
    public ArrayList<Seccion> secciones= new ArrayList<>();
}
public class Problema_1_EjecutorCapitulo {
    public static void main(String[] args) {
        Palabra p1 = new Palabra("Pedro");
        Palabra p2 = new Palabra("Pica");
        Palabra p3 = new Palabra("Piedra");

        Sentencia s1 = new Sentencia();
        s1.palabras.add(p1);
        s1.palabras.add(p2);

        Sentencia s2 = new Sentencia();
        s2.palabras.add(p2);
        s2.palabras.add(p3);

        Parrafo parrafo1 = new Parrafo();
        parrafo1.sentencias.add(s1);
        parrafo1.sentencias.add(s2);

        Figuras figura1 = new Figuras();

        Seccion seccion1 = new Seccion();
        seccion1.componentes.add(parrafo1); 
        seccion1.componentes.add(figura1);  

        Capitulo capitulo = new Capitulo();
        capitulo.secciones.add(seccion1);

        System.out.println("Secciones: " + capitulo.secciones.size());
        System.out.println("Componentes: " + seccion1.componentes.size());
        System.out.println("Sentencias: " + parrafo1.sentencias.size());
        System.out.println("Palabras s1: " + s1.palabras.size());
        System.out.println("Palabras s2: " + s2.palabras.size());                  
    }
}
/**
 * run:
Secciones: 1
Componentes: 2
Sentencias: 2
Palabras s1: 2
Palabras s2: 2
BUILD SUCCESSFUL (total time: 0 seconds)
 */