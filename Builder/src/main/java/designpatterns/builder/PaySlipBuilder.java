package designpatterns.builder;

public class PaySlipBuilder {
    private float basic;
    private float hra;
    private float tax;
    private float pf;
    private float da;

    public PaySlipBuilder setBasic(float basic) {
        this.basic = basic;
        return this;
    }

    public PaySlipBuilder setHra(float hra) {
        this.hra = hra;
        return this;
    }

    public PaySlipBuilder setTax(float tax) {
        this.tax = tax;
        return this;
    }

    public PaySlipBuilder setPf(float pf) {
        this.pf = pf;
        return this;
    }

    public PaySlipBuilder setDa(float da) {
        this.da = da;
        return this;
    }

    public PaySlip getPaySlip() {
        return new PaySlip(basic, hra, tax, pf, da);
    }
}
