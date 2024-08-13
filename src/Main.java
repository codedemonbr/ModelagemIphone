import com.codedemonbr.launch.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone(86.2);
        System.out.println(myIphone.getStatusBateria());
        myIphone.adicionarNovaAba();
        myIphone.atender();
        myIphone.ligar("5511986082341");
        myIphone.iniciarCorreioVoz();
        myIphone.tocar();
    }
}