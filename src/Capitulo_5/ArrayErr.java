package Capitulo_5;

/**
 *
 * @author Guilherme
 */

//demonstra uma situação que execede um array
public class ArrayErr {
    public static void main(String[] args) {
        int sample[] = new int[10];
        
        //gera a transposição de um array
        for (int i = 0; i < 100; i = i+1) {
            sample[i] = i;
        }
    }
}
