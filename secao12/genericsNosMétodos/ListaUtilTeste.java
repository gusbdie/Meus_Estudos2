import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        String ultimaLinguagem = (String) ListaUtil.getUltimo(langs);
        //preciso especificar que é String pq o método retornará um Object
    
        Integer ultimoNumero = (Integer) ListaUtil.getUltimo(nums);

        System.out.println(ultimaLinguagem);
        System.out.println(ultimoNumero);


        List<String> langs2 = Arrays.asList("JS", "PHP", "Java");

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs2);
    
        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums2);

        System.out.println(ultimaLinguagem2);
        System.out.println(ultimoNumero2);
    }
}
