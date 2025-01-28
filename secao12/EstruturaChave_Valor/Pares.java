import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {
    //assim eu vou decidir os tipos que vão ter nos pares dos itens vai
    //ser definido na hora que instanciar a classe

    private final Set<Par<C , V>> itens = new LinkedHashSet<>();
    //o linked organizará sem problemas, já o treeset necessita de um 
    //comparable para dizer como ele será ordenado

    public void adicionar(C chave, V valor){
        //forma nova para garantir que não terá um null adicionado
        if(chave == null) return;
        
        Par<C, V> novoPar = new Par<C, V>(chave, valor);

        if(itens.contains(novoPar)){
            itens.remove(novoPar);
        }//caso tire isso o comportamento padrão do Set 
        //é ignorar se tento adicionar algo igual
    
        itens.add(novoPar);
    }

    public V getValor(C chave){
        if(chave == null) 
        return null;

        Optional<Par<C,V>> parOpcional =  itens.stream()
               .filter(par -> chave.equals(par.getChave()))
               .findFirst();

        return parOpcional.isPresent() 
               ? parOpcional.get().getValor() : null;
    }
}
