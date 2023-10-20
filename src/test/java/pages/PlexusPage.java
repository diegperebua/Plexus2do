package pages;


public class PlexusPage extends BasePage {
private String botonSubirCV= "//input[@id='cv']";
private String botonUnetealequipo="/html/body/div[1]/div[2]/section[1]/div[1]/div/div[2]/div/div/div/div/nav/ul/li[4]/a/span";
private String botonCheckbox= "//body/div[@id='boxed-wrapper']/div[@id='wrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/fieldset[1]/div[1]/label[1]";
    public PlexusPage() {
        super(driver);


    }
    public void navegaraPlexus () {
        navigateTo("https://www.plexus.es");
    }
    public void clickUneteAlEquipo(){
        clickElement(botonUnetealequipo);

    }



public String tituloPagina(){

     return obtenerTitulo();





}
public void subirCV(){

        subirArchivo(botonSubirCV,"C:\\Users\\casa\\Desktop\\cv.pdf");
}
public void clickCheckBox(){
    clickElement(botonCheckbox);
}


}





