# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usuarioCadastrarPost**](DefaultApi.md#usuarioCadastrarPost) | **POST** /usuario/cadastrar | Cadastra Usuário
[**usuarioListarGet**](DefaultApi.md#usuarioListarGet) | **GET** /usuario/listar | Retorna uma lista de usuário.
[**usuarioLoginPost**](DefaultApi.md#usuarioLoginPost) | **POST** /usuario/login | Logar Usuário


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

