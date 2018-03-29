#This is Lord&Taylor promotional shipping requirements for customers.Feature:

  Feature: LordAndTaylor shipping promotion functionality

    Background:
      Given: As a validated user
      When User navigate to site
      When User close emailPopUp button
      Then LordAndTaylor home page should display
      When User click SignIn link
      Then Browser should display SignIn page
      When User enter email as "hema_ahmad@yahoo.com"
      And User enter password as "Hema&123"
      And User click SignIn button
      Then Account page should display

    Scenario: 1. Free shipping over $49 purchase from Beauty
      When User navigate Beauty department to Exfoliators category
      Then Exfoliators page should display
      When User click on exfoliator product
      Then Exfoliator product page should display
      When User select product size
      And User select product amount
      And User select shipIt option
      And User click addToBag button
      And User click viewMyBagAndCheckOut
      Then Bag page should display
      When User verify totalItems on bagPage
      And User verify product name on bagPage
      And User verify subTotal on bagPage
      And User verify estimatedTotal on bagPage
      And User click checkout button on bagPage
      Then Checkout page should display
      When User verify product name
      And User verify product quantity
      And User verify totalItem
      And User verify shipping
      And User verify verify tax
      And User verify totalOrder
