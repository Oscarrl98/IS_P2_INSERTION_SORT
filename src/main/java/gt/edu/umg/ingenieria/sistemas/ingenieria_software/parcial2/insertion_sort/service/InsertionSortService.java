package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort.service;

public class InsertionSortService {

    /**
     * metodo que ordena array de strings  divide virtualmente en una parte ordenada y otra sin clasificar. Los valores de la parte sin clasificar se seleccionan y colocan en la posición correcta en la parte clasificada.
     * @param array
     */
    public  void sort_sub(String array[]){
        int f = array.length;
        String temp="";
        for(int i=0;i<f;i++){
            for(int j=i+1;j<f;j++){
                if(array[i].compareToIgnoreCase(array[j])>0){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    /**
     * 
     * @param arr
     */
    public void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
