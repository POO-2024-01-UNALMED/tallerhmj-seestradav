package futbol;
public class Jugador extends Futbolista {
public short golesMarcados;
public byte dorsal;
public Jugador(String nombre, int edad, String posicion, short gm,byte dorsal){
    super(nombre,edad,posicion);
    this.golesMarcados=gm;
    this.dorsal=dorsal;
}
public Jugador(){
    super();
    this.golesMarcados=289;
    this.dorsal=7;
}
public int compareTo(Jugador j){
    return Math.abs(this.getEdad() - j.getEdad());
}
@Override
public String toString(){
    String futbolistaInfo=super.toString();
    return futbolistaInfo+"con el dorsal"+dorsal+". Ha marcado "+golesMarcados;
}
@Override
public boolean jugarConLasManos(){
    return false;
}


}
