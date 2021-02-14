/**
*@author Pedro Arriola 20188
*@author Esteban Aldana 20591
*@author Andrés de la Roca 20332
*/

public class Numeros implements Comparable<Numeros>{
    private Integer finalNum;

    public Numeros(Integer value){
        finalNum = value;
    }

    public String toString(){

        return String.valueOf(finalNum);
    }

    public int compareTo(Numeros num){
        Integer result;
        Integer otroDato = (num).getlastNum();
        result=otroDato.compareTo(finalNum);

        return result;
    }

    public Integer getlastNum(){
        return finalNum;
    }
}