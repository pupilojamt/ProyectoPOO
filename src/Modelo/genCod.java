package Modelo;

public class genCod {

    private int dato;
    private int cont = 1;
    private String num = "";

    public void generar(int dato) {
        this.dato = dato;

        if ((this.dato >= 100) || (this.dato < 1000)) {
            int can = cont + this.dato;
            num = "" + can;
        }
        if ((this.dato >= 9) || (this.dato < 100)) {
            int can = cont + this.dato;
            num = "0" + can;
        }
        if (this.dato < 9) {
            int can = cont + this.dato;
            num = "00" + can;
        }

    }

    public String serie() {
        return this.num;
    }
}
