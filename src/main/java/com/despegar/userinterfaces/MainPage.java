package com.despegar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {
    public static final Target BTN_HOTELS = Target.the("The button for looking for hotels").locatedBy("//span[contains(text(),'Hoteles')]");
    public static final Target BTN_ALOJAMIENTOS = Target.the("The button for select alojamientos").locatedBy("//label[contains(text(),'Alojamientos')]");
    public static final Target INP_DESTINATION = Target.the("The input for insert destination").locatedBy("//*[@id= 'searchbox-sbox-box-hotels']/div/div/div/div/div[3]/div[1]/div/div/div/input");
    public static final Target INP_INIT_DATE = Target.the("The input for insert initial date").locatedBy("//div[@id='searchbox-sbox-box-hotels']/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/input");
    public static final Target INP_INIT_DAY = Target.the("The input for insert initial day").locatedBy("//div[@id='component-modals']/div[4]/div[1]/div[2]/div[2]/div[3]/div[1]/div");
    public static final Target INP_END_DAY = Target.the("The input for insert end day").locatedBy("//div[@id='component-modals']/div[4]/div[1]/div[2]/div[1]/div[3]/div[15]/div");
    public static final Target BTN_APPLY = Target.the("The button for apply range of dates").locatedBy("//div[@id='component-modals']/div[4]/div[2]/div[1]/button");
    public static final Target INP_END_DATE = Target.the("The input for insert end date").locatedBy("//body/div[@id='home-ui-module-wrapper']/div[@id='SEARCHBOX']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public static final Target INP_ROOMS = Target.the("The input for insert room").locatedBy("//body/div[@id='home-ui-module-wrapper']/div[@id='SEARCHBOX']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/input[1]");
    public static final Target INP_PEOPLE = Target.the("The input for insert people").locatedBy("//body/div[@id='home-ui-module-wrapper']/div[@id='SEARCHBOX']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/input[1]");
    public static final Target BTN_SEARCH = Target.the("The button for start search hotels").locatedBy("//body/div[@id='home-ui-module-wrapper']/div[@id='SEARCHBOX']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]");
    public static final Target STR_ADVICE = Target.the("The advice indicating no results").locatedBy("//div[15]/div/div/div/span[@class='ac-group-title']");
}
