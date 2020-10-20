package mx.com.caressing.facebook;

public class Contatco {
    private String urlFoto;
    private String txtImag;
    private String imagenfondo;
    private String fondo;
    private String txtdesc;
    public Contatco(String juanjo_sanchez, String s){

    }

    public Contatco(String urlFoto, String txtImag, String imagenfondo,String fondo,String txtdesc) {
        this.urlFoto = urlFoto;
        this.txtImag = txtImag;
        this.imagenfondo = imagenfondo;
        this.fondo=fondo;
        this.txtdesc=txtdesc;
    }

    public Contatco() {

    }

    public String getUrlFoto(){
    return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    public String getTxtImag(){
        return txtImag;
    }

    public void setTxtImag(String txtImag) {
        this.txtImag = txtImag;
    }

    public String getImagenfondo() {
        return imagenfondo;
    }

    public String getTxtdesc() {
        return txtdesc;
    }

    public void setTxtdesc(String txtdesc) {
        this.txtdesc = txtdesc;
    }

    public void setImagenfondo(String imagenfondo) {
        this.imagenfondo = imagenfondo;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }
}
