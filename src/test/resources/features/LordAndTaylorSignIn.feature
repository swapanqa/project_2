#This is Lord&Taylor Sign In functionality:

  Feature: LordAndTaylor SignIn Functionality

    Background:
      Given As a non-validated user
      When User navigate to site
      When User close emailPopUp button
      Then LordAndTaylor home page should display
      When User click SignIn link
      Then Browser should display SignIn page

    Scenario: 1. Valid email and valid password
      When User enter email as "hema_ahmad@yahoo.com"
      And User enter password as "Hema&123"
      And User click SignIn button
      Then Account page should display greeting message
      And User click SignOut button

    Scenario Outline: 2. Invalid email and valid password
      When User enter email as "<Email>"
      And User enter password as "<Password>"
      And User click SignIn button
      Then EmailError should display as "<ErrorMessage>"
      Examples:
      | Email                   | Password      | ErrorMessage                    |
      |                         | Hema&123      | This field is required.         |
      | hemaahmad@gmail         | Hema&123      | Enter a valid email address.    |

    Scenario Outline: 3. Valid email and invalid password
      When User enter email as "<Email>"
      And User enter password as "<Password>"
      And User click SignIn button
      Then PasswordError should display as "<ErrorMessage>"
      Examples:
      |Email                         |Password     |ErrorMessage             |
      |hema_ahmad@yahoo.com          |             |This field is required.  |

    Scenario Outline: 4. Either invalid email or invalid password
      When User enter email as "<Email>"
      And User enter password as "<Password>"
      And User click SignIn button
      Then Alert should display as "<AlertMessage>"
      Examples:
      | Email                | Password   | AlertMessage                                                          |
      | hemaahmad@gmail.com  | Hema&123   | Sorry, this does not match our records. Please try again.             |
      | hema_ahmad@yahoo.com | ant        | We're sorry, your entry does not match our records. Forgot Password?   |



