package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        /*zofka.drawPig(500,400,120);
        zofka.polygon(50,90,30,8,false);
        zofka.polygon(150,80,15,16,false);
        zofka.polygon(280,80,15,16,true);*/

        zofka.polygon(120,80,15,16,true);

        double positionX=50;
        double size=100;

        for (int i = 0; i < 5; i++) {
            zofka.drawHouse(positionX,300,size);
            positionX=positionX+size+100;
        }

        positionX=50;
        for (int i = 0; i < 2; i++) {
            zofka.drawHouse(positionX,470,size);
            positionX=positionX+size+700;
        }

        zofka.drawPig(550,470,size);

        zofka.setLocation(300,640);
        zofka.drawP(size);
        zofka.drawE(size);
        zofka.drawT(size);
        zofka.drawR(size);
        zofka.drawA(size);

    }

}
