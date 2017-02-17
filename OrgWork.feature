Feature: As a user create and delete organisation
  Scenario Outline: I  create and delete one organisation
    Given I Login to catalyst using "<url>"
    And I enter  "<username>" on User name text box
    And I enter "<password>"  on Password testbox
    And I click on Login button
    And I click on the "SETTINGS" Option
    And I click on the "New OrgSetup" button
    And I enter "<Orgname>" in the Name edit box
    And I enter "<Cost>" in the Planned Cost edit box
    And I click on "Save" option
   ## I verify the created "Organisation" in present or not
    And I move the cursor on "Menu" link
    And I click on "Org Configuration" link
    And I click on "Organizations" link
    Then I verify the created "Organisation" in org table
    And I select the "Organization" and click on corresponding "Delete" button
    And I click on OK button on  popup
    Then I verify "<Organization>" deleted or not



    Examples:
      |  username   |     password    | url                              |   Orgname       |  Cost   |
      | superadmin  |   superadmin@123|http://neocatalyst.rlcatalyst.com/|     ftyo        |  40000  |