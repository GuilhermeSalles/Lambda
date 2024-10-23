
# 🧠 Lambda em Java
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/GuilhermeSalles/Lambda/blob/master/LICENSE) 

Este projeto demonstra como usar expressões lambda em Java e por que elas são tão úteis no nosso dia a dia de programação.

## 🤔 O que são Lambdas?
Lambda é uma forma mais curta e direta de escrever funções. Ao invés de ter que criar uma classe anônima para implementar uma interface funcional, você escreve tudo de maneira mais simples, rápida e legível.

Basicamente, lambda é uma função sem nome que pode ser usada como argumento em métodos ou atribuída a variáveis.

### 📝 Antes do Lambda:
```java
List<String> nomes = Arrays.asList("João", "Maria", "Pedro");

for (String nome : nomes) {
    System.out.println(nome);
}
```

### 🚀 Com Lambda:
```java
List<String> nomes = Arrays.asList("João", "Maria", "Pedro");

nomes.forEach(nome -> System.out.println(nome));
```

## ⚡ Por que usar Lambda?
- **Menos código**: O exemplo acima mostra que a sintaxe é mais curta, eliminando a necessidade de criar uma classe anônima.
- **Leitura mais fácil**: O código fica mais direto e fácil de entender.
- **Performance**: Lambdas podem trazer melhorias de performance, especialmente quando combinados com Streams.
- **Moderno**: É uma das funcionalidades mais modernas e adotadas do Java desde a versão 8.

## 🛠️ Como rodar o projeto

Clone o repositório:
```bash
git clone https://github.com/GuilhermeSalles/Lambda.git
```

Para rodar direto no seu ambiente de desenvolvimento:
1. Abra o projeto na sua IDE.
2. Execute a classe principal.

## 💡 Funcionalidades
- Exemplos básicos de uso de Lambdas.
- Integração com Streams.
- Funções de alta ordem (passando lambdas como parâmetros).

## 🎯 Para que serve?
Este projeto foi criado para você entender como e por que usar lambdas no seu código. Usar lambdas deixa o código mais enxuto e, em muitos casos, até mais eficiente.

---

## 📖 Autor

Guilherme Baltazar Vericimo de Sales

<a href="https://www.linkedin.com/in/guilhermebaltazar-v/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> 
<a href="https://instagram.com/yguilhermeb" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a>
