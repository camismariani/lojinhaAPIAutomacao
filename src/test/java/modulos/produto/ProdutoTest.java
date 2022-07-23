package modulos.produto;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


@DisplayName("Teste de API Rest do módulo de produto")
public class ProdutoTest {
    @Test
    @DisplayName("Validar os limites proibidos do valor do Produto")
    public void testValidarLimitesProibidosValorProduto(){
        // COnfigurando os dados da API Rest da lojinha
        baseURI = "http://165.227.93.41/";
        // port = 8082;
        basePath = "/lojinha";

        // obter o token do usuario admin

        //tentar inserir um produto com valor 0.00 e validar que a msg de erro foi apresentada
        // e o status code retornado foi 422
    }
}
