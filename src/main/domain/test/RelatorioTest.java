package main.domain.test;

import main.domain.relatorio.Relatorio;
import main.domain.lancamento.LancamentoBase;
import main.domain.lancamento.LancamentoDespesa;
import main.domain.lancamento.LancamentoReceita;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatorioTest {

    @Test
    public void GeraTotalReceita() {
        List<LancamentoBase> lista = new ArrayList<>();
        lista.add(new LancamentoDespesa("Descricao", 300.00,10,12,2023));
        lista.add(new LancamentoReceita("Descricao", 300.00,10,12,2023));
        lista.add(new LancamentoReceita("Descricao", 300.00,10,12,2023));

        Double total = new Relatorio().GeraTotalReceita(lista);

        assertEquals(600.00, total);
    }
    @Test
    public void GeraTotalDespesa() {
        List<LancamentoBase> lista = new ArrayList<>();
        lista.add(new LancamentoDespesa("Descricao", 300.00,10,12,2023));
        lista.add(new LancamentoReceita("Descricao", 300.00,10,12,2023));
        lista.add(new LancamentoDespesa("Descricao", 300.00,10,12,2023));

        Double total = new Relatorio().GeraTotalDespesa(lista);

        assertEquals(600.00, total);
    }
    @Test
    public void GeraReceitasMenosDespesas() {
        List<LancamentoBase> lista = new ArrayList<>();
        lista.add(new LancamentoDespesa("Descricao", 300.00,10,12,2023));
        lista.add(new LancamentoReceita("Descricao", 300.00,10,12,2023));
        lista.add(new LancamentoReceita("Descricao", 100.00,10,12,2023));

        Double total = new Relatorio().GeraReceitasMenosDespesas(lista);

        assertEquals(100.00, total);
    }

}
