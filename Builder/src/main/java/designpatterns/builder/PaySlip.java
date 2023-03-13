package designpatterns.builder;

public class PaySlip {
    private float basic;
    private float hra;
    private float tax;
    private float pf;
    private float da;

    public PaySlip(float basic, float hra, float tax, float pf, float da) {
        this.basic = basic;
        this.hra = hra;
        this.tax = tax;
        this.pf = pf;
        this.da = da;
    }

    @Override
    public String toString() {
        return "PaySlip{" +
                "Basic=" + basic +
                ", HRA=" + hra +
                ", Tax=" + tax +
                ", PF=" + pf +
                ", DA=" + da +
                '}';
    }
}
