<h2 align="center">
  💣 Campo Minado em Java
</h2>

<p align="center">
  Versão evoluída do clássico Campo Minado, desenvolvida em <b>Java</b>, migrando do <b>terminal</b> para uma
  <b>interface gráfica com Java Swing</b>.
</p>

---

## 📌 Sobre o Projeto

Este projeto é uma implementação do clássico **Campo Minado**, inicialmente desenvolvido para rodar apenas no
**console**.  
Com o passar do tempo e a evolução das minhas habilidades em **Java e POO**, o projeto foi revisitado e ganhou
uma **interface gráfica utilizando Java Swing**, proporcionando uma experiência mais visual e interativa.

---

## 🛠️ Tecnologias Utilizadas

- ☕ Java
- 🪟 Java Swing
- 🧠 Programação Orientada a Objetos (POO)
- 🔧 Git & GitHub

---

## 🎮 Funcionalidades

- Geração dinâmica do campo
- Posicionamento aleatório de minas
- Cálculo de minas adjacentes
- Interação por cliques do mouse
- Interface gráfica intuitiva
- Detecção de vitória e derrota

---

## 📁 Estrutura do Projeto

O projeto está organizado seguindo boas práticas de separação de responsabilidades, com foco em **POO** e **arquitetura MVC**:

```bash
src/
 └── br/
     └── com/
         └── cod3r/
             └── calculadora/
                 ├── model/
                 │   ├── Memoria.java
                 │   └── MemoriaObservador.java
                 └── view/
                     ├── Botao.java
                     ├── Calculadora.java
                     ├── Display.java
                     └── Teclado.java

test/
README.md

