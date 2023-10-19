import java.util.List;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Iterator;

class Vertice{
    private double x;
    private double y;
    public Vertice (double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX (double x){this.x = x;}
    public void setY (double y){this.y = y;}
    public double getX (){return x;}
    public double getY (){return y;}

}

class Poligono{
    private List<Vertice> listaVertices;

    public Poligono(List<Vertice> listaVertices){
        this.listaVertices = listaVertices;
    }

    public boolean regular(){
        int sum = 0;
        boolean flag = true;
        Iterator<Vertice> it = listaVertices.iterator();
        List<Angulo> angulos = new ArrayList<Angulo>();
        while (it.hasNext()){
            Vertice temp1 = it.next();
            Vertice temp2 = it.next();
            sum += comprimento(temp1, temp2);
            angulos.add(new Angulo(angulo(temp1, temp2)));
        }
        for (int i = 0; i < angulos.size() - 1; i++) {
            if (angulos.get(i).equals(angulos.get(i + 1))){
                continue;
            }
            flag = false;
            break;
        }
        if (!flag)
            return flag;
        else{
            if (sum/angulos.size() == comprimento(listaVertices.get(0), listaVertices.get(1))){
                return true;
            }
            return false;
        }
    }
    private double normaVetores (Vertice temp1, Vertice temp2){
        return Math.sqrt(Math.pow(temp1.getX(), 2) + Math.pow(temp1.getY(), 2)) + Math.sqrt(Math.pow(temp2.getX(), 2) + Math.pow(temp2.getY(), 2));
    } 
    private double produtoInterno (Vertice temp1, Vertice temp2){
        return temp1.getX() * temp2.getX() + temp1.getY() + temp2.getY();
    } 
    private double angulo (Vertice temp1, Vertice temp2){
        return Math.acos(produtoInterno(temp1, temp2)/normaVetores(temp1, temp2));
    }
    private double comprimento (Vertice temp1, Vertice temp2){
        return normaVetores(temp1, temp2);
    }

}

public class Exe5 {
    public static void main(String[] args) {
        List<Vertice> listaVertices = new ArrayList<Vertice>();
        listaVertices.add(new Vertice(1, 0));
        listaVertices.add(new Vertice(2, 0));
        listaVertices.add(new Vertice(1, 1));
        listaVertices.add(new Vertice(2, 1));
        Poligono novoPoligono = new Poligono(listaVertices);
        if (novoPoligono.regular()) System.out.println("YES");
        else System.out.println("NO");

    }
}
