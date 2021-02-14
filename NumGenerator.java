import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.Math.*;

/**
 *@author Pedro Arriola 20188
 *@author Esteban Aldana 20591
 *@author Andrés de la Roca 20332
 */
public class NumGenerator{

    /**
     *Genera numeros aleatorio dentro de un rango determinado, lo escribe en un archivo de texto y devuelve un Array conteniendo los datos.
     *@return Array con numeros aleatoriamente generados
     * @param datos
     */
    public static void generate(ArrayList<Integer> datos){
        datos.clear();
        try{
            Random rand = new Random();
            String ruta = "data.txt";
            String contenido;
            StringBuilder builder = new StringBuilder();


            //Se generan de 0 a 3000 numeros aleatoriamente
            for(int i=0;i<10;i++){
                boolean ciclo = true;
                int aleatorio = rand.nextInt(10);
                do{
                    if(datos.contains(aleatorio)){
                        aleatorio = rand.nextInt(10);
                    }else{
                        datos.add(aleatorio);
                        ciclo=false;
                    }
                }while(ciclo);
            }


            for(Integer item : datos){
                builder.append(item + " ");
            }
            contenido = builder.toString();


            File file = new File(ruta);
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(contenido);
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
