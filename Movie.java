
/**
 * this class represent a movie in the lists
 * 
 * @author (R. Morosi) 
 * @version (06/12)
 */
public class Movie
{
    private int duration;
    private String name;
    private String director;
    private int fechaEstreno;
 
    /**
     * Constructor for objects of class Movie
     * @precondicion: duration and fechaEstreno no pueden ser menores a 0. name
     * and director no pueden ser nulos o vacio
     * @param duration, name, director, fechaEstreno
     * 
     */
    public Movie(int duration , String name , String director, int fechaEstreno)
    {
        if(duration < 0){
            throw new IllegalArgumentException("la duracion es invalida");   
        }
        if(fechaEstreno < 0){
            throw new IllegalArgumentException("la fecha es invalida");   
        }
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar vacio");   
        }
        if(director == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("director no puede estar vacio");   
        }
        duration = duration;
        name = name;
        director = director;
        fechaEstreno = fechaEstreno;
    }

    /**
     * this method get duration of movie
     * @precondition name cant be more small to 0
     * @param name
     * @return the duration of moive (int)
     */
    public int getDuration()
    {
        System.out.println("the duration of the movie is: " + duration + " mins");
        return duration;
    }
    
    /**
     * this method get name of movie
     * @precondition name cant be null or empty
     * @param name
     * @return the name of moive (string)
     */
    public String getName()
    {
        System.out.println("the name of the movie is: " + name + ".");
        return name;
    }
    
    /**
     * this method get director of movie
     * @precondition director cant be null or empty
     * @param name
     * @return the director of moive (string)
     */
    public String getDirector()
    {
        System.out.println("the name of the movie is: " + director + ".");
        return director;
    }
    
    /**
     * this method get fechaEstreno of movie
     * @precondition fechaEstreno cant be more small to 0
     * @param name
     * @return the fechaEstreno of moive (int)
     */
    public int getFechaEstreno()
    {
        System.out.println("the release date of the movie is: " + fechaEstreno + " mins");
        return fechaEstreno;
    }
    
    /**
     * This methoid return all data of the movie
     * @precondition: the same conditions of the constructor
     * @return the name + the director + release date + duration of movie.
     */    
    public String toString(){
        assert repOk();
        if(duration < 0){
            throw new IllegalArgumentException("la duracion es invalida");   
        }
        if(fechaEstreno < 0){
            throw new IllegalArgumentException("la fecha es invalida");   
        }
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar vacio");   
        }
        if(director == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("director no puede estar vacio");   
        }
        return "el nombre de la pelicula es: " + name + ", del director: " + director + "la cual se lanzo el: " + fechaEstreno + " y dura: " + duration + " minutos";
    }
    
    public boolean repOk(){
        if(duration < 0){
            return false;
        }
        if(fechaEstreno < 0){
            return false;
        }
        if(name == null || name.trim().isEmpty()){
            return false;
        }
        if(director == null || name.trim().isEmpty()){
            return false;
        }
        return true;
    }
}
