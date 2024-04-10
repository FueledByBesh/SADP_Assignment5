package applications.ex1.models;

import java.awt.*;

public class CharAppearance {

    private String skin;

    /*  .........  */

    public CharAppearance(String skin){
        this.skin = skin;
    }

    public String getInfo(){
        return "Skin : "+skin+"\n";
    }
}
