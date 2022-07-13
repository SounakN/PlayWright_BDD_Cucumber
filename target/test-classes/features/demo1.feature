Feature: testing Playwright with Cucumber feature 1

  Description: Testing playwright with cucumber

#  Background:
#    Given User navigate to the URL
#    And Validates the title of the page to be "ParaBank | Welcome | Online Banking"
#    Then user logs in with the User name "Sounak" and Password "sounak"
  Scenario: Playwright Demo test 1 feature 1
    Given User navigate to the URL
    And Validates the title of the page to be "ParaBank | Welcome | Online Banking"
    Then user logs in with the User name "Sounak" and Password "sounak"
    Then user Clicks on "Open New Account"
    Then Validate the title of the page in Open Account to be "ParaBank | Open Account"

  Scenario: Playwright Demo test 2 feature 1
    Given User navigate to the URL
    And Validates the title of the page to be "ParaBank | Welcome | Online Banking"
    Then user logs in with the User name "Sounak" and Password "sounak"
    Then user Clicks on "Transfer Funds"
    Then Validate the title of the page in Fund Transfer to be "ParaBank | Transfer Funds"

#  Scenario: Playwright Demo test 2 feature 1
#    Then user Clicks on "Accounts Overview"
#    Then Validate the title of the page in Open Account to be "ParaBank | Accounts Overview"