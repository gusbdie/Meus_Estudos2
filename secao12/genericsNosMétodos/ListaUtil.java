import java.util.List;

public class ListaUtil {

    public static Object getUltimo(List<?> lista){
        return lista.get(lista.size() -1);
    }

    //versão melhorada para não precisa deixar explícito toda vez no main

    public static<T> T getUltimo2(List<T> lista){
        return lista.get(lista.size() -1);
    }
}
