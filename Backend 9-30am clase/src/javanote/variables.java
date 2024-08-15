package javanote;

public class variables {
    public static void main(String[] args){


    byte moveLeft; // declarando la varible
    moveLeft =127;
    short moveLeft2 = (short) moveLeft;
System.out.println(moveLeft2);
    moveLeft2 =130;
    // recibe dos valores numericos pero uno de ellos es de tipo String

        int num1 = 19;
        String num2 = "23";
        //parseo de variables
        int newNum2= Integer.parseInt(num2);
        float promedio = (num1 + newNum2)/ 2;
        System.out.println(promedio);

}
}