package ejercicio_4;

public  class ComboExtra implements Combo {

    protected Combo combo;
    protected Double precioAdicional = 0.0;
    protected String descripcionAdicional = "";

    public ComboExtra(Combo combo) {
        this.combo = combo;
    }

    @Override
    public Double precio() {
        return combo.precio() + precioAdicional;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + descripcionAdicional;
    }

    public ComboExtra ConExtraTomate(){

        return new ExtraTomate(this);
    }

    public ComboExtra  ConExtraQueso(){
        return new ExtraQueso(this);
    }

    public ComboExtra  conExtraCarne(){
        return new ExtraCarne(this);
    }

  public ComboExtra  conExtraPapa(){
        return new ExtraPapa(this);
  }





}
