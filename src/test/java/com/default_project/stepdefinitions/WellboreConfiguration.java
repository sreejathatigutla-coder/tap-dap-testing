package com.default_project.stepdefinitions;

import com.default_project.utils.ElementUtils;
import org.junit.Assert;
import com.default_project.driverfactory.DriverFactory;
import com.default_project.pages.WellboreConfigurationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class WellboreConfiguration extends DriverFactory {
WellboreConfigurationPage wellboreConfigurationPage = new WellboreConfigurationPage(driver);
@Given("the user is on the Wellbore Configuration Page")
public void the_user_is_on_the_wellbore_configuration_page() {
wellboreConfigurationPage.navigateToWellboreConfigurationPage();
}
@Given("the user selects the Drilled Hole tab")
public void the_user_selects_the_drilled_hole_tab() {
wellboreConfigurationPage.selectDrilledHoleTab();
}
@When("the user enters {string} in the Top MD field")
public void the_user_enters_in_the_top_md_field(String top_md) {
wellboreConfigurationPage.enterTopMD(top_md);
}
@When("the user enters {string} in the Bottom MD field")
public void the_user_enters_in_the_bottom_md_field(String bottom_md) {
wellboreConfigurationPage.enterBottomMD(bottom_md);
}
@When("the user observes the state of the other fields in the row")
public void the_user_observes_the_state_of_the_other_fields_in_the_row() {
wellboreConfigurationPage.observeOtherFieldsState();
}
@When("the user saves the configuration")
public void the_user_saves_the_configuration() {
wellboreConfigurationPage.saveConfiguration();
}
@When("the user refreshes the page")
public void the_user_refreshes_the_page() {
wellboreConfigurationPage.refreshPage();
}
@Then("the previously entered data is displayed correctly")
public void the_previously_entered_data_is_displayed_correctly() {
wellboreConfigurationPage.isDataDisplayedCorrectly();
}
@When("the user selects the Casing tab")
public void the_user_selects_the_casing_tab() {
wellboreConfigurationPage.selectCasingTab();
}
@When("the user adds {int} rows with valid data")
public void the_user_adds_rows_with_valid_data(int numberOfRows) {
wellboreConfigurationPage.addRowsWithValidData(numberOfRows);
}
@When("the user adds additional rows until the system reaches its limit")
public void the_user_adds_additional_rows_until_the_system_reaches_its_limit() {
wellboreConfigurationPage.addAdditionalRowsUntilLimit();
}
@Then("the configuration should be saved successfully")
public void the_configuration_should_be_saved_successfully() {
wellboreConfigurationPage.isConfigurationSavedSuccessfully();
}
@Then("the page should refresh without errors")
public void the_page_should_refresh_without_errors() {
wellboreConfigurationPage.isPageRefreshedWithoutErrors();
}
@When("the user enters unusual valid combinations in the Top MD field {string}")
public void the_user_enters_unusual_valid_combinations_in_the_top_md_field(String top_md) {
wellboreConfigurationPage.enterTopMD(top_md);
}
@When("the user enters unusual valid combinations in the Bottom MD field {string}")
public void the_user_enters_unusual_valid_combinations_in_the_bottom_md_field(String bottom_md) {
wellboreConfigurationPage.enterBottomMD(bottom_md);
}
@When("the user enters valid data in the Length field {string}")
public void the_user_enters_valid_data_in_the_length_field(String length) {
wellboreConfigurationPage.enterLength(length);
}
@Then("the other fields in the row are enabled for data entry")
public void the_other_fields_in_the_row_are_enabled_for_data_entry() {
wellboreConfigurationPage.areOtherFieldsEnabled();
}
@When("the user enters {string} in the Casing field")
public void the_user_enters_in_the_casing_field(String casing) {
wellboreConfigurationPage.enterCasing(casing);
}
@When("the user enters {string} in the Grade field")
public void the_user_enters_in_the_grade_field(String grade) {
wellboreConfigurationPage.enterGrade(grade);
}
@Then("the data should be retained correctly")
public void the_data_should_be_retained_correctly() {
wellboreConfigurationPage.isDataRetainedCorrectly();
}
@When("the user enters special characters in the Casing field {string}")
public void the_user_enters_special_characters_in_the_casing_field(String casing) {
wellboreConfigurationPage.enterCasing(casing);
}
@When("the user enters special characters in the Grade field {string}")
public void the_user_enters_special_characters_in_the_grade_field(String grade) {
wellboreConfigurationPage.enterGrade(grade);
}