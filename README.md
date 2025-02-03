# Credit Card Brand Validator

This project contains a Java class `CardValidator` that identifies the brand of a credit card based on its number. The class uses a series of conditional checks to determine the brand based on the provided prefixes.

## Project Purpose

The purpose of this project is to create a Credit Card Brand Validator using GitHub Copilot. This project is part of the course "Criando um Validador de Bandeiras de Cartão de Crédito com o GitHub Copilot" on the DIO.me platform.

## Supported Card Brands

The `CardValidator` class can identify the following card brands based on their prefixes:

- **Visa**: Prefix 4
- **MasterCard**: Prefixes 51-55, 2221-2720
- **American Express (Amex)**: Prefixes 34, 37
- **Diners Club**: Prefixes 300-305, 36, 38, 39
- **Discover**: Prefixes 6011, 622126-622925, 644-649, 65
- **EnRoute**: Prefixes 2014, 2149
- **JCB**: Prefixes 3528-3589
- **Voyager**: Prefix 8699
- **HiperCard**: Prefix 6060
- **Aura**: Prefix 50

## Usage

To use the `CardValidator` class, create an instance of the class and call the `identifyCardBrand` method with a credit card number as a string. The method will return the brand name as a string.

### Example

```java
public class Main {
    public static void main(String[] args) {
        CardValidator validator = new CardValidator();
        String cardNumber = "4111111111111111"; // Example card number
        String brand = validator.identifyCardBrand(cardNumber);
        System.out.println("Card Brand: " + brand);
    }
}
```

---

# Validador de Bandeira de Cartão de Crédito

Este projeto contém uma classe Java `CardValidator` que identifica a bandeira de um cartão de crédito com base no seu número. A classe utiliza uma série de verificações condicionais para determinar a bandeira com base nos prefixos fornecidos.

## Objetivo do Projeto

O objetivo deste projeto é criar um Validador de Bandeira de Cartão de Crédito utilizando o GitHub Copilot. Este projeto faz parte do curso "Criando um Validador de Bandeiras de Cartão de Crédito com o GitHub Copilot" na plataforma DIO.me.

## Bandeiras de Cartão Suportadas

A classe `CardValidator` pode identificar as seguintes bandeiras de cartões com base nos seus prefixos:

- **Visa**: Prefixo 4
- **MasterCard**: Prefixos 51-55, 2221-2720
- **American Express (Amex)**: Prefixos 34, 37
- **Diners Club**: Prefixos 300-305, 36, 38, 39
- **Discover**: Prefixos 6011, 622126-622925, 644-649, 65
- **EnRoute**: Prefixos 2014, 2149
- **JCB**: Prefixos 3528-3589
- **Voyager**: Prefixo 8699
- **HiperCard**: Prefixo 6060
- **Aura**: Prefixo 50

## Como Usar

Para usar a classe `CardValidator`, crie uma instância da classe e chame o método `identifyCardBrand` passando o número do cartão como uma string. O método retornará o nome da bandeira como uma string.

### Exemplo

```java
public class Main {
    public static void main(String[] args) {
        CardValidator validator = new CardValidator();
        String cardNumber = "4111111111111111"; // Número de cartão de exemplo
        String brand = validator.identifyCardBrand(cardNumber);
        System.out.println("Bandeira do Cartão: " + brand);
    }
}
```