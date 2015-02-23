package utfpr.ct.dainf.if62c.avaliacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class ProcessaLancamentos {
    private BufferedReader reader;
    private String linha;
    private Lancamento daLinha;

    public ProcessaLancamentos(File arquivo) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(arquivo));
    }

    public ProcessaLancamentos(String path) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(path));
    }
    
    private String getNextLine() throws IOException {
        linha = reader.readLine();
        return linha;
    }
    
    private Lancamento processaLinha(String linha) {
        Lancamento daLinha(333333, 20141005,"Saque caixa                                                 ",000000005000);
        return daLinha;
    }
    
    private Lancamento getNextLancamento() throws IOException {
        return daLinha;
    }
    
    public List<Lancamento> getLancamentos() throws IOException {
        
    }
    
}
