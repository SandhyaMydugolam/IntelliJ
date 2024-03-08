package com.inter.def;

public class MainDef {
    public static void main(String[] args) {
        IBonusCalculator bonusCalculator = new CalculatorImpl();
        bonusCalculator.calculate(2000);
        bonusCalculator.policyType();
        IBonusCalculator.show();

        IAllowanceCalculator allowance = (IAllowanceCalculator) bonusCalculator;
                allowance.calculate(10000);
        allowance.policyType();
    }
}
