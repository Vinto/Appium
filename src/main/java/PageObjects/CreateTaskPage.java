package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends PageBase {
    public CreateTaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "editTextTitre")
    MobileElement taskNameText;

    @AndroidFindBy(id = "editTextNote")
    MobileElement taskDescriptionText;

    @AndroidFindBy(id = "action_save")
    MobileElement saveButton;

    public void enterTaskName(String taskName) {
        clear(taskNameText);
        sendText(taskNameText, taskName);
    }

    public void enterTaskDescription(String taskDescription) {
        clear(taskDescriptionText);
        sendText(taskDescriptionText, taskDescription);
    }

    public void clickSaveButton() {
        clear(saveButton);
    }
}
