package br.com.tutorialWeb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
@ManagedBean
@RequestScoped
public class MyBean {

	
    // Init ----------------------------------------------------------------------------------------

    private HtmlInputText inputComponent;
    private String inputValue;
    private HtmlOutputText outputComponent;
    private String outputValue;

    // Constructors -------------------------------------------------------------------------------

    public MyBean() {
        log("constructed");
    }

    // Actions ------------------------------------------------------------------------------------

    public void inputChanged(ValueChangeEvent event) {
        log(event.getOldValue() + " to " + event.getNewValue());
    }

    public void action() {
        outputValue = inputValue;
        log("succes");
    }

    // Getters/setters ----------------------------------------------------------------------------

    public HtmlInputText getInputComponent() {
        log(inputComponent);
        return inputComponent;
    }

    public void setInputComponent(HtmlInputText inputComponent) {
        log(inputComponent);
        this.inputComponent = inputComponent;
    }

    public String getInputValue() {
        log(inputValue);
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        log(inputValue);
        this.inputValue = inputValue;
    }

    public HtmlOutputText getOutputComponent() {
        log(outputComponent);
        return outputComponent;
    }

    public void setOutputComponent(HtmlOutputText outputComponent) {
        log(outputComponent);
        this.outputComponent = outputComponent;
    }

    public String getOutputValue() {
        log(outputValue);
        return outputValue;
    }

    // Helpers ------------------------------------------------------------------------------------

    private void log(Object object) {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("MyBean " + methodName + ": " + object);
    }
    
    public void mudanca(ActionEvent e){
    	inputValue = e.getComponent().getClientId();
    	System.out.println("mudanca"+inputValue);
    }
}
