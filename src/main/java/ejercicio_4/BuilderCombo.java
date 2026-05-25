package ejercicio_4;

import java.awt.*;

public class BuilderCombo {

    private Combo combo;

    public  BuilderCombo(){

    }

    public BuilderCombo BuilderComboDe(ComboFamiliar combo){
        validarComboIniciado(); //para no buildear un comboX y sobre este buildearle otro comboX
        this.combo= combo;
        return this;
    }

    public BuilderCombo BuilderComboDe(ComboEspecial combo){
       validarComboIniciado();
       this.combo= combo;
       return this;
    }

    public BuilderCombo BuilderComboDe(ComboSimple combo){
        validarComboIniciado();
        this.combo= combo;
        return this;
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
        Combo comboConstruido = this.combo;
        this.combo = null; //se reinicia el builder para poder construir otro combo
        return comboConstruido;
    }

    private void validarComboIniciado(){
        if(this.combo!=null) throw new IllegalStateException("El combo ya fue iniciado");
    }

}
