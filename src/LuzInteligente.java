public class LuzInteligente {
    private String idLuz;
    private int nivelBrillo;
    private boolean encendida;

    public LuzInteligente(String idLuz) {
        this.idLuz = idLuz;
        nivelBrillo = 0;
        encendida = false;
    }

    public void encender(){
        encendida = true;
    }

    public void apagar(){
        encendida = false;
    }

    public void mostrarEstado(){

        System.out.println("ID: " + idLuz);
        System.out.println("Brillo: " + nivelBrillo);
        System.out.println("Encendida: " + encendida);
    }
}
