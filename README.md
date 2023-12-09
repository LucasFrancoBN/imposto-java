# Desafio: Calculadora de Imposto em Java

Desafio proposto pelo curso DevSuperior, onde o principal objetivo é implementar um código em Java para calcular o imposto de renda de um país fictício. Abaixo estão as regras do cálculo:

1. **Imposto sobre Salário:**
   A pessoa paga imposto sobre seu salário conforme a tabela abaixo:

   | Salário mensal | Imposto   |
   | -------------  | --------- |
   | Abaixo de 3000 por mês | Isento |
   | 3000 até 5000 (exclusive) | 10% |
   | 5000 ou acima | 20% |

2. **Imposto sobre Prestação de Serviços:**
   Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de 15%.

3. **Imposto sobre Ganho de Capital:**
   Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de 20%.

4. **Deduções:**
   A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. No entanto, se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e educacionais podem ser abatidos.

## Exemplo
```plaintext
Renda anual com salário: 48000.00
Renda anual com prestação de serviço: 0.00
Renda anual com ganho de capital: 800.00
Gastos médicos: 400.00
Gastos educacionais: 5400.00
RELATÓRIO DE IMPOSTO DE RENDA
CONSOLIDADO DE RENDA:
Imposto sobre salário: 4800.00
Imposto sobre serviços: 0.00
Imposto sobre ganho de capital: 160.00
DEDUÇÕES:
Máximo dedutível: 1488.00
Gastos dedutíveis: 5800.00
RESUMO:
Imposto bruto total: 4960.00
Abatimento: 1488.00
Imposto devido: 3472.00
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/imposto-java.git

# Acesse o diretório do projeto
cd imposto-java/src
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java

# Execute o programa
java Program
```
