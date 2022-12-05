public class SmartTv {
    boolean on = false;
    int canal = 1;
    int volume = 25; 

    //métodos

    public void ligar() {
        on = true;
    }

    public void desligar() {
        on = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando para canal  " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo para canal  " + canal);
    }

    public void setarCanal(int novoCanal){
        canal= novoCanal;
        System.out.println("O canal escolhido foi: " + canal);
    }
}
