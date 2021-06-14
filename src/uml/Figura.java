/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.awt.Canvas;

/**
 *
 * @author User
 */
public class Figura {
    public double calcArea (){
        return 0;
    };
    public void dibujar (Canvas canvas){};
}


class Rectangulo extends Figura{
}


class Elipse extends Figura{
}

class Cuadreado extends Rectangulo{
}


class Circulo extends Elipse {
}
