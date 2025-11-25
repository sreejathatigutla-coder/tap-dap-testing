
@feature_wellbore_configuration
Feature: WellboreConfiguration

  Background: 
    Given the user is on the Wellbore Configuration Page

  @max-valid-values
  Scenario Outline: Validate Maximum Valid Values in MD Fields
    Given the user selects the Drilled Hole tab
    When the user enters "<top_md>" in the Top MD field
    And the user enters "<bottom_md>" in the Bottom MD field
    And the user observes the state of the other fields in the row
    And the user saves the configuration
    And the user refreshes the page
    Then the previously entered data is displayed correctly

    Examples:
      | top_md    | bottom_md  |
      | a * 1000  | a * 1000   |

  @minimum-valid-values
  Scenario Outline: Validate system handles minimum valid values in Top MD and Bottom MD
    When the user selects the Drilled Hole tab
    And the user enters "<top_md>" in the Top MD field
    And the user enters "<bottom_md>" in the Bottom MD field
    And the user observes the state of the other fields in the row
    And the user saves the configuration
    And the user refreshes the page
    Then the previously entered data is displayed correctly

    Examples:
      | top_md | bottom_md |
      | 0      | 0         |

  @feature_wellbore_configuration
  @validate_large_datasets
  Scenario Outline: Validate system performance with large datasets in Casing tab
    When the user selects the Casing tab
    And the user adds 20 rows with valid data
    And the user adds additional rows until the system reaches its limit
    And the user observes the performance of the application
    Then the configuration should be saved successfully
    And the page should refresh without errors
    And the previously entered data should be displayed correctly

    Examples:
      | <data> |
      | valid  |

  @validate_unusual_combinations
  Scenario Outline: Validate Casing Tab with Unusual Combinations
    When the user selects the Casing tab
    And the user enters unusual valid combinations in the Top MD field "<top_md>"
    And the user enters unusual valid combinations in the Bottom MD field "<bottom_md>"
    And the user enters valid data in the Length field "<length>"
    Then the other fields in the row are enabled for data entry
    And the user saves the configuration
    And the user refreshes the page
    Then the previously entered data is displayed correctly

    Examples:
      | top_md    | bottom_md | length |
      | 12345.67  | 54321.89  | 100    |

  @max-character-limit
  Scenario Outline: Validate Maximum Character Limits in Text Fields
    Given the user selects the Casing tab
    When the user enters "<casing>" in the Casing field
    And the user enters "<grade>" in the Grade field
    Then the user observes the state of the other fields in the row
    And the user saves the configuration
    And the user refreshes the page
    Then the data should be retained correctly

    Examples:
      | casing                                                                                                                                                                                                                     | grade                                                                                                                                                                                                                      |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @validate_special_characters
  Scenario Outline: Validate that the system can handle special characters in text fields without errors
    When the user selects the Casing tab
    And the user enters "<casing>" in the Casing field
    And the user enters "<grade>" in the Grade field
    And the user observes the state of the other fields in the row
    And the user saves the configuration
    And the user refreshes the page
    Then the previously entered data is displayed correctly

    Examples:
      | casing        | grade        |
      | !@#$%^&*     | !@#$%^&*     |
