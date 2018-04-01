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
      Then Account page should display greeting message

    Scenario: 1. Free shipping OVER $49 purchase from Beauty
      When User navigate Beauty department to Exfoliators category
      Then Exfoliators page should display
      When User click on Lancome exfoliator product
      Then Lancome product page should display
      When User select Lancome product size as "3.4 OZ."
      And User select Lancome product quantity as "2"
      And User select Lancome shipIt option
      And User click addToBag button
      And User click viewMyBagAndCheckOut
      Then BagPage should display
      When User verify totalItems on LancomeBagPage as "Items (2)"
      And User verify product name on LancomeBagPage as "Comforting Exfoliating Cream/3.4 oz."
      And User verify subTotal on LancomeBagPage as "$52.00"
      And User verify estimatedTotal on LancomeBagPage as "$61.95"
      And User click checkout button on bagPage
      Then Checkout page should display Lancome products
      When User verify product name on LancomeCheckoutPage as "Comforting Exfoliating Cream/3.4 oz."
      And User verify product quantity on LancomeCheckoutPage as "2"
      And User verify itemTotal on LancomeCheckoutPage as "$52.00"
      And User verify shipping on LancomeCheckoutPage as "FREE"
      And User verify verify tax on LancomeCheckoutPage as "$0.00"
      And User verify orderTotal on LancomeCheckoutPage as "$52.00"
      And User click SignOut button

     Scenario: 2. No free shipping UNDER $49 purchase from Beauty
       When User navigate Beauty department to Eyes category
       Then Eyes page should display
       When User click on Shiseido Eye product
       Then Shiseido product page should display
       When User select Shiseido product color as "Br602 Deep Brown"
       And User select Shiseido product quantity as "1"
       And User select Shiseido shipIt option
       And User click addToBag button
       And User click viewMyBagAndCheckOut
       Then Bag page should display
       When User verify totalItems on ShiseidoBagPage as "Items (1)"
       And User verify product name on ShiseidoBagPage as "Natural Eyebrow Pencil/0.1 oz."
       And User verify subTotal on ShiseidoBagPage as "$20.00"
       And User verify estimatedTotal on ShiseidoBagPage as "$25.95"
       And User click checkout button on bagPage
       Then Checkout page should display Shiseido products
       When User verify product name on ShiseidoCheckoutPage as "Natural Eyebrow Pencil/0.1 oz."
       And User verify product quantity on ShiseidoCheckoutPage as "1"
       And User verify itemTotal on ShiseidoCheckoutPage as "$20.00"
       And User verify shipping on ShiseidoCheckoutPage as "$5.95"
       And User verify verify tax on ShiseidoCheckoutPage as "$0.00"
       And User verify orderTotal on ShiseidoCheckoutPage as "$25.95"
       And User click SignOut button