# org.moment

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>org.moment</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:org.moment:0.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/org.moment-0.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String id = "id_example"; // String | 
        try {
            apiInstance.atividadeBuscarAtividadeIdGet(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#atividadeBuscarAtividadeIdGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**atividadeBuscarAtividadeIdGet**](docs/DefaultApi.md#atividadeBuscarAtividadeIdGet) | **GET** /atividade/buscar-atividade/{id} | Buscar uma atividade .
*DefaultApi* | [**atividadeCadastrarPost**](docs/DefaultApi.md#atividadeCadastrarPost) | **POST** /atividade/cadastrar | Cadastrar Atividade
*DefaultApi* | [**atividadeListarGet**](docs/DefaultApi.md#atividadeListarGet) | **GET** /atividade/listar | Listar atividades
*DefaultApi* | [**atividadeListarTiposGet**](docs/DefaultApi.md#atividadeListarTiposGet) | **GET** /atividade/listar-tipos | Listar tipos de atividades
*DefaultApi* | [**eventoListarGet**](docs/DefaultApi.md#eventoListarGet) | **GET** /evento/listar | listar eventos
*DefaultApi* | [**eventoMudarEstadoIdGet**](docs/DefaultApi.md#eventoMudarEstadoIdGet) | **GET** /evento/mudar-estado/{id} | Mudar estado do evento.
*DefaultApi* | [**usuarioCadastrarPost**](docs/DefaultApi.md#usuarioCadastrarPost) | **POST** /usuario/cadastrar | Cadastra Usuário
*DefaultApi* | [**usuarioEmailGet**](docs/DefaultApi.md#usuarioEmailGet) | **GET** /usuario/{email} | Mostrar Usuário
*DefaultApi* | [**usuarioIdMinhasInscricoesGet**](docs/DefaultApi.md#usuarioIdMinhasInscricoesGet) | **GET** /usuario/{id}/minhas-inscricoes/ | Retorna inscrições do usuario
*DefaultApi* | [**usuarioListarGet**](docs/DefaultApi.md#usuarioListarGet) | **GET** /usuario/listar | listar usuarios
*DefaultApi* | [**usuarioLoginPost**](docs/DefaultApi.md#usuarioLoginPost) | **POST** /usuario/login | Logar Usuário


## Documentation for Models



## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



