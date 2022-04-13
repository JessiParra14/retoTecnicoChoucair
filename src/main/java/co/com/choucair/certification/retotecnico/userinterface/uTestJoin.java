package co.com.choucair.certification.retotecnico.userinterface;

import com.google.inject.internal.cglib.core.$Local;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestJoin extends PageObject {
    public static final Target JOIN_BUTTON =Target.the("Boton que nos muestra formulario para registro").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRSTNAME = Target.the("Se escribe el primer nombre").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Se escribe el apellido").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Ingresa el correo electronico").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Ingresa el mes de nacimiento").located(By.id("birthMonth"));
    public static final Target SELECT_MONTHOPTIONS = Target.the("Selecciona el mes").located(By.xpath("//select[@id='birthMonth']//option[contains(text(), 'July')]"));
    public static final Target SELECT_DAY = Target.the("Ingresa el dia de nacimiento").located(By.id("birthDay"));
    public static final Target SELECT_DAYOPTIONS = Target.the("Selecciona el día").located(By.xpath("//select[@id='birthDay']//option[contains(text(), '14')]"));
    public static final Target SELECT_YEAR = Target.the("Ingresa el año de nacimiento").located(By.id("birthYear"));
    public static final Target SELECT_YEAROPTIONS = Target.the("Selecciona el año de nacimiento").located(By.xpath("//select[@id='birthYear']//option[contains(text(), '1998')]"));
    public static final Target CLICK_LANGUAGES = Target.the("Click en el espacio de idiomas").located(By.id("languages"));
    //public static final Target SELECT_LANGUAGE = Target.the("Selecciona el idioma buscado").located(By.xpath("//li[@id='ui-select-choices-2']//span[@class='ui-select-choices-row-inner']//div[contains(text(),'Spanish']"));
    public static final Target BUTTON_NEXT = Target.the("Boton que nos pasa al siguiente formulario localidad").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target BUTTON_NEXTDEVICES = Target.the("Boton que nos pasa al siguiente formulario dispositvos").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target CLICK_MOBILE = Target.the("Dar click en la lista de la marca de tu celular").located(By.xpath("//div[@id='mobile-device']//div[@class='ui-select-box']"));
    public static final Target SELECT_MOBILE = Target.the("Seleccionar marca de tu celular").located(By.xpath("//li[@class='ui-select-choices-group']//span[@class='ui-select-choices-row-inner']//div[contains(text(), 'Apple')]"));
    public static final Target CLICK_MODEL = Target.the("Dar click en la lista del modelo de tu celular").located(By.xpath("//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//div[@class='ui-select-container ui-select-bootstrap dropdown ng-empty ng-valid']"));
    public static final Target SELECT_MODEL = Target.the("Seleccionar modelo de tu celular").located(By.xpath("//li[@class='ui-select-choices-group']//span[@class='ui-select-choices-row-inner']//div[contains(text(),'iPhone 11')]"));
    public static final Target CLICK_OS = Target.the("Dar click en la lista de sistema operativo").located(By.name("handsetOSId"));
    public static final Target SELECT_OS = Target.the("Seleccionar el sistema operativo del celular").located(By.xpath("//li[@class='ui-select-choices-group']//span[@class='ui-select-choices-row-inner']//div[contains(text(), 'iOS 15.4.1')]"));
    public static final Target BUTTON_NEXTLASTSTEP = Target.the("Boton que nos pasa al ultimo formulario").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("Ingresar contraseña").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Ingresar confirmación de contraseña").located(By.id("confirmPassword"));
    public static final Target CLICK_CHECKBOXTERMS = Target.the("Aceptar los terminos y condiciones").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target CLICK_CHECKBOXPRIVACY = Target.the("Aceptar las politicas de privacidad y seguridad").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target BUTTON_COMPLETE = Target.the("Boton que finaliza el registro en la pagina").located(By.xpath("//a[@class='btn btn-blue']"));
}
