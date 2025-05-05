# 📦 Sistema de Gerenciamento de Produtos com Clean Architecture

[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![H2 Database](https://img.shields.io/badge/H2%20Database-2.1.214-lightgrey.svg)](https://www.h2database.com)

Um sistema de gerenciamento de produtos desenvolvido seguindo os princípios da Clean Architecture, com separação clara de camadas e foco nas regras de negócio.

## 🚀 Funcionalidades

- ✅ Cadastro de produtos
- ✅ Consulta de produtos por ID
- ✅ Listagem de todos os produtos
- ✅ Atualização de produtos
- ✅ Exclusão de produtos
- ✅ Validação de dados de entrada

## 🏗️ Arquitetura

```
produtos-clean-architecture/
├── core/          # Regras de negócio e entidades
├── infrastructure/# Implementações concretas (JPA, Web)
└── application/   # Controllers e pontos de entrada
```

### Princípios aplicados:
- **Inversão de Dependência**
- **Separação de Responsabilidades**
- **Testabilidade**
- **Baixo Acoplamento**

## 🛠️ Tecnologias

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Data JPA**
- **H2 Database** (para desenvolvimento)
- **Lombok** (para redução de boilerplate)
- **Validation API** (para validação de dados)

## ⚙️ Configuração

### Pré-requisitos
- JDK 17+
- Maven 3.6+
- Postman ou similar (para testar a API)

### Como executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/produtos-clean-architecture.git
```

2. Execute a aplicação:
```bash
cd produtos-clean-architecture
mvn spring-boot:run
```

3. Acesse a API em:
```
http://localhost:8080/produtos
```

## 📚 Documentação da API

### Endpoints

| Método | Endpoint           | Descrição                     |
|--------|--------------------|-------------------------------|
| POST   | /produtos          | Cria um novo produto          |
| GET    | /produtos/{id}     | Obtém um produto por ID       |
| GET    | /produtos          | Lista todos os produtos       |
| PUT    | /produtos/{id}     | Atualiza um produto existente |
| DELETE | /produtos/{id}     | Remove um produto             |

### Exemplo de requisição (POST /produtos)
```json
{
    "nome": "Notebook Elite",
    "descricao": "Notebook com 16GB RAM e SSD 512GB",
    "preco": 5299.90,
    "quantidadeEstoque": 15
}
```

## 🎯 Testando a API

1. **Console H2**: Acesse `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:produtos_db`
   - User: `sa`
   - Password: (vazio)

2. **Coleção Postman**: [Importe esta coleção](#) (link para arquivo JSON da coleção)

## 🤝 Contribuição

Contribuições são bem-vindas! Siga estes passos:

1. Fork o projeto
2. Crie uma branch (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

Desenvolvido por [Flávio Santos]
