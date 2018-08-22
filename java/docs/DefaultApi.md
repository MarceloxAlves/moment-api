# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usuarioCadastrarPost**](DefaultApi.md#usuarioCadastrarPost) | **POST** /usuario/cadastrar | Retorna uma lista de usuário.
[**usuarioListarGet**](DefaultApi.md#usuarioListarGet) | **GET** /usuario/listar | Retorna uma lista de usuário.


<a name="usuarioCadastrarPost"></a>
# **usuarioCadastrarPost**
> usuarioCadastrarPost()

Retorna uma lista de usuário.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.usuarioCadastrarPost();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usuarioCadastrarPost");
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

