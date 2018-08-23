# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**atividadeBuscarAtividadeIdGet**](DefaultApi.md#atividadeBuscarAtividadeIdGet) | **GET** /atividade/buscar-atividade/{id} | Buscar uma atividade .
[**atividadeCadastrarPost**](DefaultApi.md#atividadeCadastrarPost) | **POST** /atividade/cadastrar | Cadastrar Atividade
[**atividadeListarGet**](DefaultApi.md#atividadeListarGet) | **GET** /atividade/listar | Listar atividades
[**atividadeListarTiposGet**](DefaultApi.md#atividadeListarTiposGet) | **GET** /atividade/listar-tipos | Listar tipos de atividades
[**eventoCadastrarPost**](DefaultApi.md#eventoCadastrarPost) | **POST** /evento/cadastrar | Cadastrar Evento
[**eventoCancelarIdGet**](DefaultApi.md#eventoCancelarIdGet) | **GET** /evento/cancelar/{id} | Cancelar evento.
[**eventoDeleteIdDelete**](DefaultApi.md#eventoDeleteIdDelete) | **DELETE** /evento/delete/{id} | Deletar evento.
[**eventoListarGet**](DefaultApi.md#eventoListarGet) | **GET** /evento/listar | listar eventos
[**eventoMudarEstadoIdGet**](DefaultApi.md#eventoMudarEstadoIdGet) | **GET** /evento/mudar-estado/{id} | Mudar estado do evento.
[**eventoParticiparIdGet**](DefaultApi.md#eventoParticiparIdGet) | **GET** /evento/participar/{id} | Participar do evento.
[**usuarioCadastrarPost**](DefaultApi.md#usuarioCadastrarPost) | **POST** /usuario/cadastrar | Cadastra Usuário
[**usuarioEmailGet**](DefaultApi.md#usuarioEmailGet) | **GET** /usuario/{email} | Mostrar Usuário
[**usuarioIdMinhasInscricoesGet**](DefaultApi.md#usuarioIdMinhasInscricoesGet) | **GET** /usuario/{id}/minhas-inscricoes/ | Retorna inscrições do usuario
[**usuarioListarGet**](DefaultApi.md#usuarioListarGet) | **GET** /usuario/listar | listar usuarios
[**usuarioLoginPost**](DefaultApi.md#usuarioLoginPost) | **POST** /usuario/login | Logar Usuário


<a name="atividadeBuscarAtividadeIdGet"></a>
# **atividadeBuscarAtividadeIdGet**
> atividadeBuscarAtividadeIdGet(id)

Buscar uma atividade .

Retorna uma atividade baseado no id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.atividadeBuscarAtividadeIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#atividadeBuscarAtividadeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="atividadeCadastrarPost"></a>
# **atividadeCadastrarPost**
> atividadeCadastrarPost(nome, termino, valor, tipoAtividade, evento)

Cadastrar Atividade

Recebe uma response de atividade

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String nome = "nome_example"; // String | 
String termino = "termino_example"; // String | 
Integer valor = 56; // Integer | 
Integer tipoAtividade = 56; // Integer | 
Integer evento = 56; // Integer | 
try {
    apiInstance.atividadeCadastrarPost(nome, termino, valor, tipoAtividade, evento);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#atividadeCadastrarPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nome** | **String**|  |
 **termino** | **String**|  |
 **valor** | **Integer**|  |
 **tipoAtividade** | **Integer**|  |
 **evento** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="atividadeListarGet"></a>
# **atividadeListarGet**
> atividadeListarGet()

Listar atividades

Retorna uma lista de atividades.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.atividadeListarGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#atividadeListarGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="atividadeListarTiposGet"></a>
# **atividadeListarTiposGet**
> atividadeListarTiposGet()

Listar tipos de atividades

Retorna uma lista dos tipos de atividades.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.atividadeListarTiposGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#atividadeListarTiposGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventoCadastrarPost"></a>
# **eventoCadastrarPost**
> eventoCadastrarPost(descricao, dataInicio, dataTermino, estadoEvento, usuario, atividades)

Cadastrar Evento

Recebe uma response de evento

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String descricao = "descricao_example"; // String | 
String dataInicio = "dataInicio_example"; // String | 
Integer dataTermino = 56; // Integer | 
Integer estadoEvento = 56; // Integer | 
Integer usuario = 56; // Integer | 
List<Integer> atividades = Arrays.asList(56); // List<Integer> | 
try {
    apiInstance.eventoCadastrarPost(descricao, dataInicio, dataTermino, estadoEvento, usuario, atividades);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventoCadastrarPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **descricao** | **String**|  |
 **dataInicio** | **String**|  |
 **dataTermino** | **Integer**|  |
 **estadoEvento** | **Integer**|  |
 **usuario** | **Integer**|  |
 **atividades** | [**List&lt;Integer&gt;**](Integer.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventoCancelarIdGet"></a>
# **eventoCancelarIdGet**
> eventoCancelarIdGet(id)

Cancelar evento.

Cancelamento do evento relacionado ao id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.eventoCancelarIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventoCancelarIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventoDeleteIdDelete"></a>
# **eventoDeleteIdDelete**
> eventoDeleteIdDelete(id)

Deletar evento.

Deletar evento relacionado ao id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.eventoDeleteIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventoDeleteIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventoListarGet"></a>
# **eventoListarGet**
> eventoListarGet()

listar eventos

Retorna uma lista de usuário.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.eventoListarGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventoListarGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="eventoMudarEstadoIdGet"></a>
# **eventoMudarEstadoIdGet**
> eventoMudarEstadoIdGet(id)

Mudar estado do evento.

Muda o estado do evento relacionado ao id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.eventoMudarEstadoIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventoMudarEstadoIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventoParticiparIdGet"></a>
# **eventoParticiparIdGet**
> eventoParticiparIdGet(id)

Participar do evento.

Participar do evento relacionado ao id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.eventoParticiparIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventoParticiparIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usuarioCadastrarPost"></a>
# **usuarioCadastrarPost**
> usuarioCadastrarPost(nome, email, password, evento)

Cadastra Usuário

Recebe uma response de usuário

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String nome = "nome_example"; // String | 
String email = "email_example"; // String | 
String password = "password_example"; // String | 
Integer evento = 56; // Integer | 
try {
    apiInstance.usuarioCadastrarPost(nome, email, password, evento);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usuarioCadastrarPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nome** | **String**|  |
 **email** | **String**|  |
 **password** | **String**|  |
 **evento** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usuarioEmailGet"></a>
# **usuarioEmailGet**
> usuarioEmailGet(email)

Mostrar Usuário

Retorna uma usuário baseado no email.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String email = "email_example"; // String | 
try {
    apiInstance.usuarioEmailGet(email);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usuarioEmailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usuarioIdMinhasInscricoesGet"></a>
# **usuarioIdMinhasInscricoesGet**
> usuarioIdMinhasInscricoesGet(id)

Retorna inscrições do usuario

Retorna uma lista com as inscrições do usuario baseados no seu id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.usuarioIdMinhasInscricoesGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usuarioIdMinhasInscricoesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usuarioListarGet"></a>
# **usuarioListarGet**
> usuarioListarGet()

listar usuarios

Retorna uma lista de usuário.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.usuarioListarGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usuarioListarGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usuarioLoginPost"></a>
# **usuarioLoginPost**
> usuarioLoginPost(email, password)

Logar Usuário

Recebe uma response de usuário

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String email = "email_example"; // String | 
String password = "password_example"; // String | 
try {
    apiInstance.usuarioLoginPost(email, password);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usuarioLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |
 **password** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

