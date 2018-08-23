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
     * Buscar uma atividade .
     *
     * Retorna uma atividade baseado no id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void atividadeBuscarAtividadeIdGetTest() throws ApiException {
        String id = null;
        api.atividadeBuscarAtividadeIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Cadastrar Atividade
     *
     * Recebe uma response de atividade
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void atividadeCadastrarPostTest() throws ApiException {
        String nome = null;
        String termino = null;
        Integer valor = null;
        Integer tipoAtividade = null;
        Integer evento = null;
        api.atividadeCadastrarPost(nome, termino, valor, tipoAtividade, evento);

        // TODO: test validations
    }
    
    /**
     * Listar atividades
     *
     * Retorna uma lista de atividades.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void atividadeListarGetTest() throws ApiException {
        api.atividadeListarGet();

        // TODO: test validations
    }
    
    /**
     * Listar tipos de atividades
     *
     * Retorna uma lista dos tipos de atividades.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void atividadeListarTiposGetTest() throws ApiException {
        api.atividadeListarTiposGet();

        // TODO: test validations
    }
    
    /**
     * Cancelar do evento.
     *
     * Cancelamento do evento relacionado ao id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventoCancelarIdGetTest() throws ApiException {
        String id = null;
        api.eventoCancelarIdGet(id);

        // TODO: test validations
    }
    
    /**
     * listar eventos
     *
     * Retorna uma lista de usuário.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventoListarGetTest() throws ApiException {
        api.eventoListarGet();

        // TODO: test validations
    }
    
    /**
     * Mudar estado do evento.
     *
     * Muda o estado do evento relacionado ao id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventoMudarEstadoIdGetTest() throws ApiException {
        String id = null;
        api.eventoMudarEstadoIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Participar do evento.
     *
     * Participar do evento relacionado ao id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventoParticiparIdGetTest() throws ApiException {
        String id = null;
        api.eventoParticiparIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Cadastra Usuário
     *
     * Recebe uma response de usuário
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuarioCadastrarPostTest() throws ApiException {
        String nome = null;
        String email = null;
        String password = null;
        Integer evento = null;
        api.usuarioCadastrarPost(nome, email, password, evento);

        // TODO: test validations
    }
    
    /**
     * Mostrar Usuário
     *
     * Retorna uma usuário baseado no email.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuarioEmailGetTest() throws ApiException {
        String email = null;
        api.usuarioEmailGet(email);

        // TODO: test validations
    }
    
    /**
     * Retorna inscrições do usuario
     *
     * Retorna uma lista com as inscrições do usuario baseados no seu id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuarioIdMinhasInscricoesGetTest() throws ApiException {
        String id = null;
        api.usuarioIdMinhasInscricoesGet(id);

        // TODO: test validations
    }
    
    /**
     * listar usuarios
     *
     * Retorna uma lista de usuário.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuarioListarGetTest() throws ApiException {
        api.usuarioListarGet();

        // TODO: test validations
    }
    
    /**
     * Logar Usuário
     *
     * Recebe uma response de usuário
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usuarioLoginPostTest() throws ApiException {
        String email = null;
        String password = null;
        api.usuarioLoginPost(email, password);

        // TODO: test validations
    }
    
}
