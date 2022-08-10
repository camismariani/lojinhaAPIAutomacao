package modulos.produto;

import dataFactory.ProdutoDataFactory;
import dataFactory.UsuarioDataFactory;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.ComponentePojo;
import pojo.ProdutoPojo;
import pojo.UsuarioPojo;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


@DisplayName("Teste de API Rest do módulo de produto")
public class ProdutoTest {
    private String token;
    @BeforeEach
    public void beforeEach(){
        // COnfigurando os dados da API Rest da lojinha
        baseURI = "http://165.227.93.41";
        // port = 8082;
        basePath = "/lojinha";



        // obter o token do usuario admin
        this.token = given()
                .contentType(ContentType.JSON)
                .body(UsuarioDataFactory.CriarUsuarioAdmin())
                .when()
                .post("/v2/login")
                .then()
                .extract()
                .path("data.token");



    }
    @Test
    @DisplayName("Validar o limite proibido igual 0 do valor do Produto")
    public void testValidarLimitesProibidosValorProduto(){
        //tentar inserir um produto com valor 0.00 e validar que a msg de erro foi apresentada
        // e o status code retornado foi 422

        given()
            .contentType(ContentType.JSON)
            .header("token",this.token)
            .body(ProdutoDataFactory.criarProdutoComumComoOValorIgualAI(0.00))
        .when()
            .post("/v2/produtos")
        .then()
            .assertThat()
                .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"))
                .statusCode(422);
    }

    @Test
    @DisplayName("Validar o limite proibido maior que 7000 do valor do Produto")
    public void testValidarLimitesMaiorSeteMilProibidosValorProduto(){

        //tentar inserir um produto com valor 7000.01 e validar que a msg de erro foi apresentada
        // e o status code retornado foi 422
        given()
            .contentType(ContentType.JSON)
            .header("token",this.token)
            .body(ProdutoDataFactory.criarProdutoComumComoOValorIgualAI(7000.01))
        .when()
            .post("/v2/produtos")
        .then()
            .assertThat()
                .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"))
                .statusCode(422);
    }

}
