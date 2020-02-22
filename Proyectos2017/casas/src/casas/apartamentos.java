
package casas;

public class apartamentos {
    private float bloque, listones2x2, listones2x4, cemento, lta, ltatritu, valorh, tejas, varillas1med, varillas1cuar;
    apartamentos datos;

    public apartamentos() {
        bloque=0;
        listones2x2=0;
        cemento=0;
        lta=0;
        ltatritu=0;
        valorh=0;
        tejas=0;
        varillas1med=0;
        varillas1cuar=0;
        listones2x4=0;
    }

    public apartamentos getDatos() {
        return datos;
    }

    public void setDatos(apartamentos datos) {
        this.datos = datos;
    }

    public float getListones2x4() {
        return listones2x4;
    }

    public void setListones2x4(float listones2x4) {
        this.listones2x4 = listones2x4;
    }

    public float getBloque() {
        return bloque;
    }

    public void setBloque(float bloque) {
        this.bloque = bloque;
    }

    public float getListones2x2() {
        return listones2x2;
    }

    public void setListones2x2(float listones) {
        this.listones2x2 = listones;
    }

    public float getCemento() {
        return cemento;
    }

    public void setCemento(float cemento) {
        this.cemento = cemento;
    }

    public float getLta() {
        return lta;
    }

    public void setLta(float lta) {
        this.lta = lta;
    }

    public float getLtatritu() {
        return ltatritu;
    }

    public void setLtatritu(float ltatritu) {
        this.ltatritu = ltatritu;
    }

    public float getValorh() {
        return valorh;
    }

    public void setValorh(float valorh) {
        this.valorh = valorh;
    }

    public float getTejas() {
        return tejas;
    }

    public void setTejas(float tejas) {
        this.tejas = tejas;
    }

    public float getVarillas1med() {
        return varillas1med;
    }

    public void setVarillas1med(float varillas) {
        this.varillas1med = varillas;
    }

    public float getVarillas1cuar() {
        return varillas1cuar;
    }

    public void setVarillas1cuar(float varillas1cuar) {
        this.varillas1cuar = varillas1cuar;
    }
    
    
    
    public float valorParedes(float area){
        return ((bloque*10)+(cemento/2)+(lta*4)+(valorh*4))*area;
    }
    
    public float valorpisos(float area){
        return (cemento+varillas1med+varillas1cuar+(lta*4)+(ltatritu*2)+(valorh*8))*area;
    }
    
    public float valortechos(float area){
        return ((tejas*2)+(listones2x2*2)+(listones2x4)+(valorh*3))*area;
    }

    


}
