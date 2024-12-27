import java.util.ArrayList;
/**
 * this class represent a Episodes of the series 
 * 
 * @author (R. Morosi) 
 * @version (06/12)
 */
public class Serie
{
    private ArrayList<Temporada> temporadasSerie;
    private String director;
    private String nombre;
    private boolean emision;

    
    /**
     * devuelve el nombre de la serie
     */
    public String getNombre(){
        return nombre;
    }
    
    ;/**
     * Método para identificar cuál temporada tiene más episodios. 
     */
    public String masCapsTemp(){
        int bigestTemp = 0;
        String name = "";
        for(int i = 0 ; i < temporadasSerie.size() ; i++){
            int currTemp = i;
            if(currTemp > bigestTemp){
                bigestTemp = currTemp;
                name = currTemp.getName();
            }    
        }
        return "la temporada con mas capitulos es la " + bigestTemp + ", llamada " + name + "de la serie " + getNombre();
    }
    
    /**
     * Método que sume la duración de todos los episodios y retorne el total en minutos.
     */
    
    /**
     * Método para actualizar el estado de la serie (vista/no vista).
     */
    
    
    /**
     * Filtrar episodios por duración: Método para listar episodios que duren más o menos de una cantidad específica de tiempo.
     */
    
    
    /**
     * Método para asignar o actualizar la calificación de la serie.
     */
    
}    