package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.drawPig(500,400,120);
        zofka.polygon(50,90,30,8,false);
        zofka.polygon(150,80,15,16,false);
        zofka.polygon(280,80,15,16,true);

    }

}
