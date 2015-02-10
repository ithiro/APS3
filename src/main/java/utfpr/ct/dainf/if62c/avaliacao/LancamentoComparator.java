package utfpr.ct.dainf.if62c.avaliacao;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class LancamentoComparator implements Comparator<Lancamento>{
    public int compare(Lancamento a, Lancamento b){
        if (a.getConta() == b.getConta()) {return a.getData()-b.getData();}
        else {return a.getConta()-b.getConta();}
    }
    
}
