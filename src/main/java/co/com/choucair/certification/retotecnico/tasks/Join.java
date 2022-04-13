package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.uTestJoin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Join implements Task {
    public static Join onThePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestJoin.JOIN_BUTTON),
                Enter.theValue("Reto").into(uTestJoin.INPUT_FIRSTNAME),
                Enter.theValue("Tecnico").into(uTestJoin.INPUT_LASTNAME),
                Enter.theValue("retotecnicochoucair@gmail.com").into(uTestJoin.INPUT_EMAIL),
                Click.on(uTestJoin.SELECT_MONTH), Click.on(uTestJoin.SELECT_MONTHOPTIONS),
                Click.on(uTestJoin.SELECT_DAY), Click.on(uTestJoin.SELECT_DAYOPTIONS),
                Click.on(uTestJoin.SELECT_YEAR), Click.on(uTestJoin.SELECT_YEAROPTIONS),
                Click.on(uTestJoin.CLICK_LANGUAGES), //Click.on(uTestJoin.SELECT_LANGUAGE),
                Click.on(uTestJoin.BUTTON_NEXT),Click.on(uTestJoin.BUTTON_NEXTDEVICES),
                Click.on(uTestJoin.CLICK_MOBILE), Click.on(uTestJoin.SELECT_MOBILE),
                Click.on(uTestJoin.CLICK_MODEL), Click.on(uTestJoin.SELECT_MODEL),
                Click.on(uTestJoin.CLICK_OS), Click.on(uTestJoin.SELECT_OS),
                Click.on(uTestJoin.BUTTON_NEXTLASTSTEP),
                Enter.theValue("Retochoucair123*").into(uTestJoin.INPUT_PASSWORD),
                Enter.theValue("Retochoucair123*").into(uTestJoin.INPUT_CONFIRMPASSWORD),
                Click.on(uTestJoin.CLICK_CHECKBOXTERMS),
                Click.on(uTestJoin.CLICK_CHECKBOXPRIVACY),
                Click.on(uTestJoin.BUTTON_COMPLETE));
    }
}
