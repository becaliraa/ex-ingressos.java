# Sistema de Cinema, Usuários e Relógios em Java

Este projeto em Java exemplifica conceitos de Programação Orientada a Objetos (POO) por meio de três hierarquias principais:

- 🎟️ Ingressos para cinema com cálculo de valores (Meia Entrada e Família)
- 👥 Hierarquia de usuários do sistema (Gerente, Vendedor, Atendente)
- 🕒 Relógios internacionais (Brasileiro e Americano)

---

## Estrutura do Projeto

src/<br>
├── ingressos/<br>
│ ├── Ingresso.java<br>
│ ├── MeiaEntrada.java<br>
│ └── IngressoFamilia.java<br>
├── usuarios/<br>
│ ├── Usuario.java<br>
│ ├── Gerente.java<br>
│ ├── Vendedor.java<br>
│ └── Atendente.java<br>
├── relogios/<br>
│ ├── Relogio.java<br>
│ ├── RelogioBrasileiro.java<br>
│ └── RelogioAmericano.java<br>
└── Main.java<br>


---

## Funcionalidades

### Ingressos

- `Ingresso` é uma classe abstrata que contém valor, nome do filme e se é dublado.
- `MeiaEntrada` retorna metade do valor.
- `IngressoFamilia` calcula o valor total multiplicando pelo número de pessoas, com 5% de desconto para grupos maiores que 3.

### Usuários

- Classe base `Usuario` com atributos comuns.
- `Gerente`: administrador, com métodos para gerar relatórios e consultar vendas.
- `Vendedor`: conta número de vendas e realiza vendas.
- `Atendente`: gerencia valor em caixa e pagamentos.

### Relógios

- `Relogio` é abstrato com hora, minuto e segundo.
- `RelogioBrasileiro`: formato 24h.
- `RelogioAmericano`: formato 12h com AM/PM.
- Método para sincronizar relógios entre si.

---

## Como Executar

1. Clone o repositório:
```bash
   git clone https://github.com/becaliraa/ex-ingressos.java
```

2. Importe o projeto em sua IDE preferida (IntelliJ IDEA, Eclipse, VS Code)
3. Compile e execute a classe Main.
4. Veja a saída dos testes no console.

## ✍️ Autora

Desenvolvido com 💻 por *Rebeca de Oliveira Lira*

<div align="left">
  <a href="https://github.com/becaliraa" target="_blank">
    <img alt="GitHub" src="https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=white"/>
  </a>
  <a href="https://www.linkedin.com/in/becalira/" target="_blank">
    <img alt="LinkedIn" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/>
  </a>
  <a href="https://linktr.ee/devbeca" target="_blank">
    <img alt="Linktree" src="https://img.shields.io/badge/Linktree-39e09b?style=for-the-badge&logo=linktree&logoColor=white"/>
  </a>
</div>
