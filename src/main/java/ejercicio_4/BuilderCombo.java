package ejercicio_4;

import java.awt.*;

public class BuilderCombo {

    private Combo combo;

    public  BuilderCombo(ComboFamiliar combo){
        this.combo = combo;
    }

    public BuilderCombo ConExtraTomate(){
        this.combo= new ExtraTomate(this.combo);
        return this;
    }
    public BuilderCombo ConExtraQueso(){
        this.combo= new ExtraQueso(this.combo);
        return this;
    }

    public BuilderCombo  conExtraCarne(){
        this.combo= new ExtraCarne(this.combo);
        return this;
    }

    public BuilderCombo  conExtraPapa(){
        this.combo= new ExtraPapa(this.combo);
        return this;
    }

    public Combo build(){
        return this.combo;
    }


}
