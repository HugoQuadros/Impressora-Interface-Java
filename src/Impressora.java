import java.util.ArrayList;

public class Impressora {

    ArrayList<Imprimivel> listaImprimivel = new ArrayList<Imprimivel>();

    public void imprimirTudo(){
        for(int i = 0; i < listaImprimivel.size(); i++){
            listaImprimivel.get(i).imprimir();
        }
    }

    public void adicionarImprimivel (Imprimivel umImprimivel){
        listaImprimivel.add(umImprimivel);
    }

}
