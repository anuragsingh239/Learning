public class FactorialByRecursion {
    int fact1=1;
    public static void main(String[] args) {

    }
    void calfact(int value){
        if(value>=1)
        {
            fact1=fact1*value;
            calfact(value-1);
        }
    }
}
