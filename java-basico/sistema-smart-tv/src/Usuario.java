public class Usuario {
    public static void main(String[] args) throws Exception {   

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada ? " + smartTv.on);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("volume atual : " + smartTv.volume);

        //chamando os métodos

        //testando a chamada de método aumentar volume

        System.out.println("volume atual : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Estado 1 -> volume atual : " + smartTv.volume);

        //testando chamada do método diminuir volume
        System.out.println("volume atual : " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Estado 1 -> volume atual : " + smartTv.volume);

        //testando chamada do método aumentar canal
        System.out.println("Canal atual : " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Estado 1 -> Canal atual : " + smartTv.canal);

        //testado chamada de método diminuir canal
        System.out.println("Canal atual : " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Estado 1 -> Canal atual : " + smartTv.canal);

        //testando chamada de método setar canal
        System.out.println("Canal atual : " + smartTv.canal);
        smartTv.setarCanal(16);
        System.out.println("Estado 1 -> Canal atual : " + smartTv.canal);
    
    }
    
}