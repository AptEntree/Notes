# Task Manager App

> Bilingual README – English below 🇬🇧
---

## 📌 Visão Geral (Português)

Este é um projeto Android multimodular desenvolvido com arquitetura MVVM.  
Ele foi projetado com o objetivo de ensinar um novo desenvolvedor a programar do zero, separando responsabilidades de forma clara.

O sistema divide os módulos para facilitar o aprendizado, boas práticas e escalabilidade.

---

## 🧱 Estrutura dos Módulos

- **`app`**: Módulo principal responsável pela UI (Interface de Usuário) e controle de navegação.
- **`contract`**: Define contratos e interfaces entre módulos, facilitando a inversão de dependências.
- **`core`**: Contém modelos compartilhados, Result wrapper, extensões e utilitários comuns.
- **`data`**: Repositórios e fontes de dados fake (sem frameworks), simulando persistência local.
- **`domain`**: Contém os *Use Cases*, com toda a lógica de negócio. É onde o novo programador atua.
- **`dsm`**: *Design System Module* — contém componentes atômicos de UI reutilizáveis, como botões, inputs, temas, cores, espaçamentos e configurações visuais globais.
- **`di`**: Responsável pela injeção de dependência entre os módulos.

---

## 🚀 Tecnologias utilizadas

- Kotlin
- MVVM puro
- Coroutines e StateFlow
- Gradle Multimodular
- Sem uso de frameworks externos para facilitar o aprendizado

---

## 💡 Objetivo Educacional

Este projeto serve como base para que um novo desenvolvedor possa:
- Aprender boas práticas sem depender de frameworks prontos
- Trabalhar com separação clara de camadas
- Entender arquitetura limpa e modular
- Implementar regras de negócio reais nos use cases

---

## 📌 Overview

This is a modular Android project built with MVVM architecture.  
It was designed to help a beginner developer learn programming from scratch, with a strong focus on clean architecture and separation of concerns.

The codebase is split into modules to improve maintainability, testability, and learning experience.

---

## 🧱 Module Structure

- **`app`**: The main module responsible for the user interface and navigation.
- **`contract`**: Contains interfaces and contracts that define communication between modules.
- **`core`**: Shared models, Result wrapper, utility classes, and Kotlin extensions.
- **`data`**: Simulated repositories and data sources (in-memory or fake), without external frameworks.
- **`domain`**: Contains business logic in the form of *Use Cases*. This is where the beginner developer contributes.
- **`dsm`** (*Design System Module*): Contains atomic and reusable UI components such as buttons, inputs, spacing, color palette, themes, and general UI configurations — supporting a clean and consistent design system.
- **`di`**: Handles dependency injection setup between modules.

---

## 🚀 Technologies Used

- Kotlin
- MVVM architecture
- Coroutines & StateFlow
- Gradle Multimodular setup
- No external frameworks (for educational simplicity)

---

## 🎯 Educational Purpose

This project aims to:

- Teach clean code practices without relying on magic or abstracted frameworks
- Encourage a modular and layered architecture
- Provide hands-on experience implementing business rules through use cases
- Reinforce separation of concerns and single responsibility principles

---

## ▶️ Como rodar/ How to Build



```bash
./gradlew assembleDebug
