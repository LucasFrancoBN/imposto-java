import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Renda anual com salário: ");
    double annualIncome = sc.nextDouble();
    System.out.print("Renda anual com prestação de serviço: ");
    double annualServiceIncome = sc.nextDouble();
    System.out.print("Renda anual com ganho de capital: ");
    double annualCapitalGainsIncome = sc.nextDouble();
    System.out.print("Gastos médicos: ");
    double medicalExpenses = sc.nextDouble();
    System.out.print("Gastos educacionais: ");
    double educationalExpenses = sc.nextDouble();

    double maxDeductible = 0.0;
    double deductibleExpenses = medicalExpenses + educationalExpenses;
    double deduction = 0.0;

    double salaryTax = 0.0;
    double servicesTax = 0.0;
    double gainCapitalTax = 0.0;
    double bruteTax = 0.0;
    double taxDue = 0.0;

    if(annualIncome / 12 < 5000.0) {
      salaryTax = annualIncome * 0.1;
    } else {
      salaryTax = annualIncome * 0.2;
    }

    if(annualServiceIncome > 0.0) {
      servicesTax = annualServiceIncome * .15;
    }

    if(annualCapitalGainsIncome > 0.0) {
      gainCapitalTax = annualCapitalGainsIncome * .2;
    }

    bruteTax = gainCapitalTax + servicesTax + salaryTax;
    maxDeductible = bruteTax * .3;

    if(deductibleExpenses < maxDeductible) {
      deduction = deductibleExpenses;
    } else {
      deduction = maxDeductible;
    }

    taxDue = bruteTax - deduction;

    System.out.println();
    System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
    System.out.println();
    System.out.println("CONSOLIDADO DE RENDA:");
    System.out.printf("Imposto sobre salário: %.2f%n", salaryTax);
    System.out.printf("Imposto sobre serviços: %.2f%n", servicesTax);
    System.out.printf("Imposto sobre ganho de capital: %.2f%n", gainCapitalTax);
    System.out.println();
    System.out.println("DEDUÇÕES:");
    System.out.printf("Máximo dedutível: %.2f%n", maxDeductible);
    System.out.printf("Gastos dedutíveis: %.2f%n", deductibleExpenses);
    System.out.println();
    System.out.println("RESUMO:");
    System.out.printf("Imposto bruto total: %.2f%n", bruteTax);
    System.out.printf("Abatimento: %.2f%n", deduction);
    System.out.printf("Imposto devido: %.2f%n", taxDue);

    sc.close();

  }
}
