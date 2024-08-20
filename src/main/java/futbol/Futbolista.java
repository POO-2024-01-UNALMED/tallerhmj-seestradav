package futbol;
public abstract class Futbolista implements Comparable<Object> {
private String nombre;
private int edad;
private final String posicion;  
public Futbolista(String nombre, int edad, String posicion){
    this.nombre=nombre;
    this.edad=edad;
    this.posicion=posicion;
}
public Futbolista(){
    this.nombre="Maradona";
    this.edad=30;
    this.posicion="delantero";
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad=edad;
}
public String getPosicion(){
    return posicion;
}
@Override
public String toString(){
    return "El futbolista" + getNombre() + "tiene" +getEdad()+ ", y juega de" + getPosicion();
}
public boolean equals(Object obj ){
    if (this==obj)
        return true;
    if (obj==null|| getClass()!=obj.getClass())
        return false;
    Futbolista c = (Futbolista) obj;
    
    return this.nombre.equals(c.nombre) &&
            this.posicion.equals(c.posicion) &&
            this.edad==c.edad;
}
public abstract boolean jugarConLasManos();
}
