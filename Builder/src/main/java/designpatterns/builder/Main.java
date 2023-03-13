package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        PaySlip payslip = new PaySlipBuilder().setBasic(15000).setHra(2000).setPf(18000).getPaySlip();
        System.out.println(payslip);
    }
}
