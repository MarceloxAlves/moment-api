# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**atividadeCadastrarPost**](DefaultApi.md#atividadeCadastrarPost) | **POST** /atividade/cadastrar | Cadastrar Atividade
[**atividadeListarGet**](DefaultApi.md#atividadeListarGet) | **GET** /atividade/listar | Retorna uma lista de atividades.
[**atividadeListarTiposGet**](DefaultApi.md#atividadeListarTiposGet) | **GET** /atividade/listar-tipos | Retorna uma lista dos tipos de atividades.
[**usuarioCadastrarPost**](DefaultApi.md#usuarioCadastrarPost) | **POST** /usuario/cadastrar | Cadastra Usuário
[**usuarioEmailGet**](DefaultApi.md#usuarioEmailGet) | **GET** /usuario/{email} | Retorna uma usuário baseado no email.
[**usuarioIdMinhasInscricoesGet**](DefaultApi.md#usuarioIdMinhasInscricoesGet) | **GET** /usuario/{id}/minhas-inscricoes/ | Retorna uma lista com as inscrições do usuario.
[**usuarioListarGet**](DefaultApi.md#usuarioListarGet) | **GET** /usuario/listar | Retorna uma lista de usuário.
[**usuarioLoginPost**](DefaultApi.md#usuarioLoginPost) | **POST** /usuario/login | Logar Usuário


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

Retorna uma lista com as inscrições do usuario.

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

