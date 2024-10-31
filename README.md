    O projeto tem por finalidade buscar informações a partir do CEP.
    (Inicialmente o tema do meu projeto seria um quiz, mas no meio do caminho eu resolvi mudar 
    porque estava com dificuldade).
Rotas para requisição:

- **Método:** GET
- **Rota:** "/{cep}"
- http://localhost:8080/api/cep/{cep}
- **Exemplo de retorno:** { "cep": "88815-518", "logradouro": "Rua Maximiliano Gaidzinski", "complemento": "", "unidade": "", "bairro": "Jardim Maristela", "localidade": "Criciúma", "uf": "SC", "estado": "Santa Catarina", "regiao": "Sul", "ibge": "4204608", "gia": "", "ddd": "48", "siafi": "8089" }


- **Método:** POST
- **Rota:** "/"
- http://localhost:8080/api/cep/
- **Exemplo de retorno:**
{
"cep": "01001-000",
"logradouro": "Praça da Sé",
"complemento": "lado ímpar",
"unidade": "",
"bairro": "Sé",
"localidade": "São Paulo",
"uf": "SP",
"estado": "São Paulo",
"regiao": "Sudeste",
"ibge": "3550308",
"gia": "1004",
"ddd": "11",
"siafi": "7107"
}

