package ru.otus;

public class TestClass {
    byte b;
    SupplierClass subCls;
    double d = 999999999999.0000008;

    public TestClass() {
        this.b = 5;
        this.subCls = new SupplierClass();
    }

    public void mtd() {
        subCls.printElem();
    }

}
