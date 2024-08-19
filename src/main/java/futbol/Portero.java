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
public int compareTo(Portero j){
    return Math.abs(this.golesRecibidos - j.golesRecibidos);
}
}
