import java.util.ArrayList; 
/**
 * Write a description of class Temporada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Temporada
{
    private ArrayList<Episodios> capitulos;
    private String name;
    private int fechaEstreno;

    /**
     * Constructor for objects of class Temporada
     */
    public Temporada(String name , int fechaEstreno, int capitulosDuracion)
    {
        if(fechaEstreno < 0){
            throw new IllegalArgumentException("la fecha es invalida");   
        }
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar vacio");   
        }
        this.capitulos = new ArrayList<Episodios>();
        this.name = name;
        this.fechaEstreno = fechaEstreno;
    }
    
    
    /**
     * Constructor for objects of class Movie. when Episode have not name, the name is capitulo
     * @precondicion: duration and fechaEstreno no pueden ser menores a 0. director no pueden ser nulos o vacio
     * @param duration, director, fechaEstreno
     * 
     */
    public Temporada(int fechaEstreno, int capitulosDuracion)
    {
        if(fechaEstreno < 0){
            throw new IllegalArgumentException("la fecha es invalida");   
        }

        this.capitulos = new ArrayList<Episodios>();
        this.name = "episode " + capitulos;
        this.fechaEstreno = fechaEstreno;
    }

    /**
     * this method get duration of the episode
     * @precondition name cant be more small to 0
     * @param name
     * @return the duration of episode (int)
     */
    public int getcapitulos()
    {
        int allCaps = 0;
        int i = 0;
        while(i < capitulos.size()){            //tambien pordia con un for comun
            allCaps++;
            i++;        
        }
        return allCaps;
    }
    
    /**
     * this method get name of the episode
     * @precondition name cant be null or empty
     * @param name
     * @return the name of moive (string)
     */
    public String getName()
    {
        return name;
    }
    
    
    /**
     * this method get fechaEstreno of movie
     * @precondition fechaEstreno cant be more small to 0
     * @param name
     * @return the fechaEstreno of moive (int)
     */
    public int getFechaEstreno()
    {
        return fechaEstreno;
    }
    
    /**
     * This methoid return all data of the movie
     * @precondition: the same conditions of the constructor
     * @return the name + the director + release date + duration of movie.
     */    
    public String toString(){
        assert repOk();
        return "el nombre de la temporada es: " + name + "la cual se lanzo el: " + fechaEstreno + " y tiene: " + capitulos + " capitulos";
    }
    
    /**
     * invariable de clase
     */
    public boolean repOk(){
        if(capitulos < 0){
            return false;
        }
        if(fechaEstreno < 0){
            return false;
        }
        if(name == null || name.trim().isEmpty()){
            return false;
        }

        return true;
    }
}

