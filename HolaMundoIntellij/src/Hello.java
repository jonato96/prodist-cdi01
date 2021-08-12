public class Hello {
    public static void main(String[] args) {
        //esto es un comentario
        System.out.println("Hola mundo");
        System.out.println("Confirma pana cosmeco");
        int num1 = 2;
        int num2 = 5;
        int resultado = num1 + num2;
        System.out.println(resultado);
    }
}

class Phone{
    String phoneNumber = "123456789";
    void setNumber(){
        String phoneNumber;
        phoneNumber = "987654321";
    }
}
class TestPhone{
    public static void main(String[] args){
        Phone p1 = new Phone();
        p1.setNumber();
        System.out.println(p1.phoneNumber);
    }
}
