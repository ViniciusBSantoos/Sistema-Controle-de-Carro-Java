# 🚗 Sistema de Controle de Carro em Java

Projeto desenvolvido para simular o funcionamento de um carro com regras de negócio realistas, utilizando Java e Programação Orientada a Objetos.

---

## 🚀 Funcionalidades

- Ligar o carro;
- Desligar o carro;
- Acelerar;
- Diminuir velocidade;
- Virar para esquerda/direita
- Verificar velocidade;
- Trocar a marcha
---

## 📋 Regras de Negócio

- O carro inicia:
  - Desligado
  - Velocidade = 0 km/h
  - Marcha = 0 (ponto morto)

- O carro desligado não executa ações

- Velocidade:
  - Máxima: 120 km/h
  - Mínima: 0 km/h

- Marchas:
  - Não é permitido pular marchas
  - Cada marcha possui um limite de velocidade:

| Marcha | Velocidade |
|--------|-----------|
| 1ª     | 0 - 20 km/h |
| 2ª     | 20 - 40 km/h |
| 3ª     | 40 - 60 km/h |
| 4ª     | 60 - 80 km/h |
| 5ª     | 80 - 100 km/h |
| 6ª     | 100 - 120 km/h |

- O carro:
  - Não pode acelerar em ponto morto
  - Só pode virar entre 1 km/h e 40 km/h
  - Só pode desligar com velocidade 0 e marcha 0

---

## Tecnologias
- Java
- Programação Orientada a Objetos (POO)

## Autor
- Vinicius Batista Santos


## 🐛 Bug encontrado e corrigido no exercício 

Durante o desenvolvimento, foi identificado um problema na regra de troca de marchas:

### ❌ Problema:
- A 1ª marcha ia até 20 km/h
- A 2ª marcha começava em 21 km/h
- O carro não conseguia passar de 20 km/h
- Resultado: não era possível trocar para a 2ª marcha por exemplo 

### ✅ Solução:
- Ajuste dos limites para evitar “buraco” entre marchas
- Agora a transição é contínua:

```text
1ª marcha: 0 - 20 km/h
2ª marcha: 20 - 40 km/h ...
