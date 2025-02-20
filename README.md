# Desafio em Java: Simulação de uma conta bancária

Desafio final do curso "Java: criando a sua primeira aplicação", da Alura. 

## Conteúdos trabalhados:
1. Compreensão do processo de compilação e execução de uma aplicação Java
2. Conhecimento dos principais tipos de dados
3. Uso do Scanner para leitura de dados
4. Controle do fluxo da aplicação com o uso de condicionais e loops

## Como o programa deve funcionar:
#### 1. Ao inicializar o programa, ele irá solicitar que você digite seu nome, tipo de conta bancária e saldo inicial da conta.
##### Exemplo:

```Sistema: Qual é seu nome?```

Usuário: Luana

```Sistema:  Informe seu tipo de conta:```

Usuário: Corrente


```Sistema:  E o valor inicial da conta bancária:```

Usuário: 100

#### Após isso, o sistema retornará o seguinte texto:
```plaintext
Dados iniciais do cliente:
Nome: Luana 
Tipo conta: Corrente
Saldo inicial: 100
**********************************************
```

---  

#### 2. Após imprimir os seus dados, irá solicitar que você escolha uma das opções do menu!
```plaintext
Operações
  1- Consultar saldo
  2- Receber valor
  3- Transferir valor
  4- Sair
```
##### Opção 1: irá retornar o seu valor em conta.

```Sistema: O saldo é R$100```

##### Opção 2: irá te solicitar qual valor quer receber, e te retornar seu novo saldo em conta.

##### Exemplo:

```Sistema: Informe o valor que quer receber:```

Usuário: 50

```Sistema: O saldo atualizado é R$150```

##### Opção 3: irá te solicitar qual valor quer transferir da conta, e te retornar seu novo saldo em conta. Caso o valor da transferência seja maior que o seu saldo em conta, irá retornar que seu saldo não é suficiente.

##### Exemplo:

```Sistema: Informe o valor que quer receber:```

Usuário: 40

```Sistema: O saldo atualizado é R$60```

Usuário: 200

```Sistema: Impossível transferir, valor maior que seu saldo em conta.```

##### Opção 4: irá encerrar o programa.

---

#### Observações:
- Toda opção depois de dar a resposta irá retonar ao menu novamente para que possa escolher uma nova opção ou encerrar o programa;
- Caso digite uma opção inválida (ou seja, diferente de 1, 2, 3 ou 4) o sistema irá retornar o texto
  ```Opção inválida, tente novamente.```
