    package futbol;
public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;
    public final String posicion="portero";
    public Portero(String nombre, int edad, short gr, byte dorsal){
        super(nombre,edad,"portero");
        this.golesRecibidos=gr;
        this.dorsal=dorsal;
    }
    @Override
    public boolean jugarConLasManos(){
    return true;
}
@Override
public String toString(){
    String futbolistaInfo=super.toString();
    return futbolistaInfo+"con el dorsal"+dorsal+". Le han marcado "+golesRecibidos;
}
@Override
    public int compareTo(Object f) {
        if (f instanceof Portero) {
            Portero p = (Portero) f;
            return Math.abs(this.golesRecibidos - p.golesRecibidos);
        }
        else {return this.golesRecibidos;}
    }
}
