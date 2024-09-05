public class CalculatorLogic {
    public int convertFromDecimal(int a) {
        int mutableA = a;
        int quotient = 1;
        StringBuilder strA = new StringBuilder();
        //https://www.convzone.com/decimal-to-quaternary/
        while (quotient > 0){
            strA.insert(0,mutableA%4);
            mutableA = quotient;
            quotient = Math.floorDiv(mutableA, 4);

        }
        return Integer.parseInt(String.valueOf(strA));
    }


    public int convertToDecimal(int a){
        return convertToDecimalHelper(a+"");
    }

    public int convertToDecimalHelper(String a){
        if (a.length() == 1){
            return Integer.parseInt(a);
        }
        //://www.convzone.com/quaternary-to-decimal/
        int digit = Integer.parseInt(String.valueOf(a.charAt(0)));
        int power = (int) Math.pow(4, a.length()-1);
        int multiplication = digit * power;
        return multiplication + convertToDecimalHelper(a.substring(1));
    }

    public int addQuaternary(int a, int b){
        int decimalValueA = convertToDecimal(a);
        int decimalValueB = convertToDecimal(b);
        int decimalSum = decimalValueA + decimalValueB;
        int quarternarySum = convertFromDecimal(decimalSum);
        return quarternarySum;
    }

    public int subQuaternary(int a, int b){
        int decimalValueA = convertToDecimal(a);
        int decimalValueB = convertToDecimal(b);
        int decimalDiff = decimalValueA - decimalValueB;
        int quarternaryDiff = convertFromDecimal(decimalDiff);
        return quarternaryDiff;
    }

    public int multQuaternary(int a, int b){
        int decimalValueA = convertToDecimal(a);
        int decimalValueB = convertToDecimal(b);
        int decimalProduct = decimalValueA * decimalValueB;
        int quarternaryProduct = convertFromDecimal(decimalProduct);
        return quarternaryProduct;
    }

    public int divQuaternary(int a, int b){
        int decimalValueA = convertToDecimal(a);
        int decimalValueB = convertToDecimal(b);
        int decimalQuotient = decimalValueA / decimalValueB;
        int quarternaryQuotient = convertFromDecimal(decimalQuotient);
        return quarternaryQuotient;
    }

}
