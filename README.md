## Exercício: Santander - Atividade 01 - 01/03/2024 - Grupos

Alunos:

* Bernardo Gums Brack

* Gabriel Rodrigues Malaquias

* Thiago Figueiró Ribeiro

O código foi alterado para que as interfaces Criação de interfaces "Módulo elétrico" e "Sistema de Transporte" e implementação delas em classes que precisam delas.

![image](https://github.com/ThiagoFigueiroRibeiro/POOCarrosSantander/assets/8943388/0787154e-6bdb-4c3a-b2ef-3040fe345300)
Diagrama do sistema. Note que as linhas azuis representam herança e as linhas verdes representam implementação de interfaces.

As imagens abaixo mostram os diagramas de como ocorre a hierarquia de herança e implementação para cada classe desse sistema:

![image](https://github.com/ThiagoFigueiroRibeiro/POOCarrosSantander/assets/8943388/c56fd735-dc87-4d19-a6b1-cebeb18692ff)


* Caminhão elétrico: Herda de Caminhão e implementa de Módulo Elétrico. Caminhão, por sua vez, herda de Veículo e implementa de Sistema de Transporte.
* Carro elétrico: De forma semelhante ao Caminhão elétrico, o Carro Elétrico herda de Carro e implementa de Módulo Elétrico. Carro, por sua vez, herda de Veículo e implementa de Sistema de Transporte.
* Moto Especial: Herda de moto e implementa tanto Módulo Elétrico quanto Sistema de Transporte.
* MiniVan (Fora da imagem): Herda de Veículo e implementa Sistema de Transporte.

