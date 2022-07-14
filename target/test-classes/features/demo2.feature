Feature: testing Playwright with Cucumber feature 2

  Description: Testing playwright with cucumber

#  Background:
#    Given User navigate to the URL
#    Then user logs in with the User name "Sounak" and Password "sounak"
#    And Validates the title of the page to be "ParaBank | Welcome | Online Banking"

  Scenario: Playwright Demo test 2 feature 2
    Given User navigate to the URL
    And Validates the title of the page to be "ParaBank | Welcome | Online Banking"
    Then user logs in with the User name "Sounak" and Password "sounak"
    Then user Clicks on "Accounts Overview"
    Then Validate the title of the page in Accounts Overview to be "ParaBank | Accounts Overview"

  Scenario: Playwright Demo test 1 feature 2
    Given User navigate to the URL
    And Validates the title of the page to be "ParaBank | Welcome | Online Banking"
    Then user logs in with the User name "Sounak" and Password "sounak"
    Then user Clicks on "Request Loan"
    Then Validate the title of the page in Request Loan to be "ParaBank | Loan Request"



#  Scenario: Playwright Demo test 2 feature 2
#    Then user Clicks on "Bill Pay"
#    Then Validate the title of the page in Open Account to be "ParaBank | Bill Pay"