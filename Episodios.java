
/**
 * this class represent a Episodes of the series 
 * 
 * @author (R. Morosi) 
 * @version (06/12)
 */
public class Episodios
{
    private int capitulo; //this is a one specific episode on the list of episodes of the serie
    private int capituloDuracion;
    private String name;
    private int fechaEstreno;
    private boolean visto;
 
    /**
     * Constructor for objects of class Movie
     * @precondicion: duration and fechaEstreno no pueden ser menores a 0. name
     * and director no pueden ser nulos o vacio
     * @param duration, name, director, fechaEstreno
     * 
     */
    public Episodios(int capitulo , String name , int fechaEstreno, int capituloDuracion)
    {
        if(capitulo < 0){
            throw new IllegalArgumentException("el capitulo es invalido");   
        }
        if(fechaEstreno < 0){
            throw new IllegalArgumentException("la fecha es invalida");   
        }
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar vacio");   
        }

        if(capituloDuracion < 1){
            throw new IllegalArgumentException("duracion invalida para un capitulo");
        }
        this.capitulo = capitulo;
        this.name = name;
        this.fechaEstreno = fechaEstreno;
        this.capituloDuracion = capituloDuracion;
        this.visto = false;
    }
    
    
    /**
     * Constructor for objects of class Movie. when Episode have not name, the name is capitulo
     * @precondicion: duration and fechaEstreno no pueden ser menores a 0. director no pueden ser nulos o vacio
     * @param duration, director, fechaEstreno
     * 
     */
    public Episodios(int capitulo , int fechaEstreno, int capitulosDuracion)
    {
        if(capitulo < 0){
            throw new IllegalArgumentException("el capitulo es invalido");   
        }
        if(fechaEstreno < 0){
            throw new IllegalArgumentException("la fecha es invalida");   
        }

        if(capituloDuracion < 1){
            throw new IllegalArgumentException("duracion invalida para un capitulo");
        }
        this.capitulo = capitulo;
        this.name = "episode " + capitulo;
        this.fechaEstreno = fechaEstreno;
        this.capituloDuracion = capituloDuracion;
        this.visto = false;
    }

    /**
     * this method get duration of the episode
     * @precondition name cant be more small to 0
     * @param name
     * @return the duration of episode (int)
     */
    public int getCapitulo()
    {
        return capitulo;
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
     * this method get fechaEstreno of movie
     * @precondition fechaEstreno cant be more small to 0
     * @param name
     * @return the fechaEstreno of moive (int)
     */
    public int getDurationCaps(int capitulo){
        return capituloDuracion;
    }
    
    
    /**
     * este metodo marca como "visto" un episodio
     */
    public void marcarVisto(){
        this.visto = true;
    }
    
    /**
     * This methoid return all data of the movie
     * @precondition: the same conditions of the constructor
     * @return the name + the director + release date + duration of movie.
     */    
    public String toString(){
        assert repOk();
        if(capitulo < 0){
            throw new IllegalArgumentException("el num de capitulos es invalida");   
        }
        if(fechaEstreno < 0){
            throw new IllegalArgumentException("la fecha es invalida");   
        }
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar vacio");   
        }

        return "el nombre del capitulo es: " + name + "el cual se lanzo el: " + fechaEstreno + " y dura: " + capituloDuracion + " segundos";
    }
    
    /**
     * invariable de clase
     */
    public boolean repOk(){
        if(capitulo < 0){
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
