package modulos.produto;

import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste de API Rest do módulo de produto")
public class ProdutoTest {
    @Test
    @DisplayName("Validar os limites proibidos do valor do Produtos")
    public void testValidarLimitesProibidosValorProduto(){
        double valor=0;

        Assertions.assertTrue(valor >= 0);
    }
}
