public class Calculate {
    private int value1;
    private int value2;

    public Calculate(int value1, int value2){
        this.value1=value1;
        this.value2=value2;
    }

    public int addValue(){
        return value1+value2;
    }
    public int subValue(){
        return value1-value2;
    }
    public int multiplyValue(){
        return value1*value2;
    }
    public double divideValue(){
        double double1 = value1;
        double double2 = value2;
        return double1/double2;
    }
}
