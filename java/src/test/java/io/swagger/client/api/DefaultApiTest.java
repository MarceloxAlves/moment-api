/*
 * api de eventos
 * Api utilizada no projeto final de disciplina do curso de ADS no IFPI
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Cadastra Usuário
     *
     * Pa
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuarioCadastrarPostTest() throws ApiException {
        api.usuarioCadastrarPost();

        // TODO: test validations
    }
    
    /**
     * Retorna uma lista de usuário.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuarioListarGetTest() throws ApiException {
        api.usuarioListarGet();

        // TODO: test validations
    }
    
}
