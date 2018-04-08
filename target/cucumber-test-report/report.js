$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/LordAndTaylorShipPromo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#This is Lord\u0026Taylor promotional shipping requirements for customers.Feature:"
    }
  ],
  "line": 3,
  "name": "LordAndTaylor shipping promotion functionality",
  "description": "",
  "id": "lordandtaylor-shipping-promotion-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5979006200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "Given: As a validated user",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User navigate to site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User close emailPopUp button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "LordAndTaylor home page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Browser should display SignIn page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enter email as \"hema_ahmad@yahoo.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enter password as \"Hema\u0026123\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Account page should display greeting message",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_to_site()"
});
formatter.result({
  "duration": 5965529400,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_close_emailPopUp_button()"
});
formatter.result({
  "duration": 1054903000,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.lordandtaylor_home_page_should_display()"
});
formatter.result({
  "duration": 14039700,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_link()"
});
formatter.result({
  "duration": 6140181400,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.browser_should_display_SignIn_page()"
});
formatter.result({
  "duration": 879791900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hema_ahmad@yahoo.com",
      "offset": 21
    }
  ],
  "location": "SignInSteps.user_enter_email_as(String)"
});
formatter.result({
  "duration": 1124922900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hema\u0026123",
      "offset": 24
    }
  ],
  "location": "SignInSteps.user_enter_password_as(String)"
});
formatter.result({
  "duration": 1053233100,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_button()"
});
formatter.result({
  "duration": 6796034400,
  "status": "passed"
});
formatter.match({
  "location": "AccountPageSteps.account_page_should_display_greeting_message()"
});
formatter.result({
  "duration": 3903553800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "1. Free shipping OVER $49 purchase from Beauty",
  "description": "",
  "id": "lordandtaylor-shipping-promotion-functionality;1.-free-shipping-over-$49-purchase-from-beauty",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@smoke"
    },
    {
      "line": 18,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User navigate Beauty department to Exfoliators category",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Exfoliators page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User click on Lancome exfoliator product",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Lancome product page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User select Lancome product size as \"3.4 OZ.\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User select Lancome product quantity as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User select Lancome shipIt option",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User click addToBag button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User click viewMyBagAndCheckOut",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "BagPage should display",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User verify totalItems on LancomeBagPage as \"Items (2)\"",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User verify product name on LancomeBagPage as \"Comforting Exfoliating Cream/3.4 oz.\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User verify subTotal on LancomeBagPage as \"$52.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User verify estimatedTotal on LancomeBagPage as \"$61.95\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User click checkout button on bagPage",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Checkout page should display Lancome products",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User verify product name on LancomeCheckoutPage as \"Comforting Exfoliating Cream/3.4 oz.\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User verify product quantity on LancomeCheckoutPage as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User verify itemTotal on LancomeCheckoutPage as \"$52.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User verify shipping on LancomeCheckoutPage as \"FREE\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User verify verify tax on LancomeCheckoutPage as \"$0.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User verify orderTotal on LancomeCheckoutPage as \"$52.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User click SignOut button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_Beauty_department_to_Exfoliators_category()"
});
formatter.result({
  "duration": 10245810300,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageSteps.exfoliators_page_should_display()"
});
formatter.result({
  "duration": 1015715200,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageSteps.user_click_on_Lancome_exfoliator_product()"
});
formatter.result({
  "duration": 8876625500,
  "status": "passed"
});
formatter.match({
  "location": "LancomeProdPageSteps.lancome_product_page_should_display()"
});
formatter.result({
  "duration": 964595700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3.4 OZ.",
      "offset": 37
    }
  ],
  "location": "LancomeProdPageSteps.user_select_Lancome_product_size_as(String)"
});
formatter.result({
  "duration": 1056661000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 41
    }
  ],
  "location": "LancomeProdPageSteps.user_select_Lancome_product_quantity_as(String)"
});
formatter.result({
  "duration": 1902170200,
  "status": "passed"
});
formatter.match({
  "location": "LancomeProdPageSteps.user_select_Lancome_shipIt_option()"
});
formatter.result({
  "duration": 1006739000,
  "status": "passed"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_addToBag_button()"
});
formatter.result({
  "duration": 175885200,
  "status": "passed"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_viewMyBagAndCheckOut()"
});
formatter.result({
  "duration": 8524339300,
  "status": "passed"
});
formatter.match({
  "location": "BagPageSteps.bagpage_should_display()"
});
formatter.result({
  "duration": 1029829000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Items (2)",
      "offset": 45
    }
  ],
  "location": "BagPageSteps.user_verify_totalItems_on_LancomeBagPage_as(String)"
});
formatter.result({
  "duration": 939869900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comforting Exfoliating Cream/3.4 oz.",
      "offset": 47
    }
  ],
  "location": "BagPageSteps.user_verify_product_name_on_LancomeBagPage_as(String)"
});
formatter.result({
  "duration": 949249600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$52.00",
      "offset": 43
    }
  ],
  "location": "BagPageSteps.user_verify_subTotal_on_LancomeBagPage_as(String)"
});
formatter.result({
  "duration": 944452900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$61.95",
      "offset": 49
    }
  ],
  "location": "BagPageSteps.user_verify_estimatedTotal_on_LancomeBagPage_as(String)"
});
formatter.result({
  "duration": 931085700,
  "status": "passed"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_checkout_button_on_bagPage()"
});
formatter.result({
  "duration": 5395201600,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.checkout_page_should_display_Lancome_products()"
});
formatter.result({
  "duration": 895676500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comforting Exfoliating Cream/3.4 oz.",
      "offset": 52
    }
  ],
  "location": "CheckoutPageSteps.user_verify_product_name_on_LancomeCheckoutPage_as(String)"
});
formatter.result({
  "duration": 1154920600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 56
    }
  ],
  "location": "CheckoutPageSteps.user_verify_product_quantity_on_LancomeCheckoutPage_as(String)"
});
formatter.result({
  "duration": 917875400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$52.00",
      "offset": 49
    }
  ],
  "location": "CheckoutPageSteps.user_verify_itemTotal_on_LancomeCheckoutPage_as(String)"
});
formatter.result({
  "duration": 913426700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FREE",
      "offset": 48
    }
  ],
  "location": "CheckoutPageSteps.user_verify_shipping_on_LancomeCheckoutPage_as(String)"
});
formatter.result({
  "duration": 906419500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$0.00",
      "offset": 50
    }
  ],
  "location": "CheckoutPageSteps.user_verify_verify_tax_on_LancomeCheckoutPage_as(String)"
});
formatter.result({
  "duration": 904472500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$52.00",
      "offset": 50
    }
  ],
  "location": "CheckoutPageSteps.user_verify_orderTotal_on_LancomeCheckoutPage_as(String)"
});
formatter.result({
  "duration": 2875936200,
  "status": "passed"
});
formatter.match({
  "location": "AccountPageSteps.user_click_SignOut_button()"
});
formatter.result({
  "duration": 12667609300,
  "status": "passed"
});
formatter.after({
  "duration": 693017600,
  "status": "passed"
});
formatter.before({
  "duration": 3710984400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "Given: As a validated user",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User navigate to site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User close emailPopUp button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "LordAndTaylor home page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Browser should display SignIn page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enter email as \"hema_ahmad@yahoo.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enter password as \"Hema\u0026123\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Account page should display greeting message",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_to_site()"
});
formatter.result({
  "duration": 5879303100,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_close_emailPopUp_button()"
});
formatter.result({
  "duration": 1041609300,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.lordandtaylor_home_page_should_display()"
});
formatter.result({
  "duration": 8932300,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_link()"
});
formatter.result({
  "duration": 6203028300,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.browser_should_display_SignIn_page()"
});
formatter.result({
  "duration": 871948500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hema_ahmad@yahoo.com",
      "offset": 21
    }
  ],
  "location": "SignInSteps.user_enter_email_as(String)"
});
formatter.result({
  "duration": 1229747300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hema\u0026123",
      "offset": 24
    }
  ],
  "location": "SignInSteps.user_enter_password_as(String)"
});
formatter.result({
  "duration": 1004001700,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_button()"
});
formatter.result({
  "duration": 6796265700,
  "status": "passed"
});
formatter.match({
  "location": "AccountPageSteps.account_page_should_display_greeting_message()"
});
formatter.result({
  "duration": 3887621300,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "2. No free shipping UNDER $49 purchase from Beauty",
  "description": "",
  "id": "lordandtaylor-shipping-promotion-functionality;2.-no-free-shipping-under-$49-purchase-from-beauty",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@debug"
    },
    {
      "line": 45,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "User navigate Beauty department to Eyes category",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Eyes page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "User click on Shiseido Eye product",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Shiseido product page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "User select Shiseido product color as \"Br602 Deep Brown\"",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "User select Shiseido product quantity as \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User select Shiseido shipIt option",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User click addToBag button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User click viewMyBagAndCheckOut",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Bag page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User verify totalItems on ShiseidoBagPage as \"Items (1)\"",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "User verify product name on ShiseidoBagPage as \"Natural Eyebrow Pencil/0.1 oz.\"",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User verify subTotal on ShiseidoBagPage as \"$20.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User verify estimatedTotal on ShiseidoBagPage as \"$25.95\"",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "User click checkout button on bagPage",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Checkout page should display Shiseido products",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "User verify product name on ShiseidoCheckoutPage as \"Natural Eyebrow Pencil/0.1 oz.\"",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "User verify product quantity on ShiseidoCheckoutPage as \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "User verify itemTotal on ShiseidoCheckoutPage as \"$20.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User verify shipping on ShiseidoCheckoutPage as \"$5.95\"",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "User verify verify tax on ShiseidoCheckoutPage as \"$0.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "User verify orderTotal on ShiseidoCheckoutPage as \"$25.95\"",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "User click SignOut button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_Beauty_department_to_Eyes_category()"
});
formatter.result({
  "duration": 6179372900,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageSteps.eyes_page_should_display()"
});
formatter.result({
  "duration": 935961600,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageSteps.user_click_on_Shiseido_Eye_product()"
});
formatter.result({
  "duration": 12253325400,
  "status": "passed"
});
formatter.match({
  "location": "ShiseidoProdPageSteps.shiseido_product_page_should_display()"
});
formatter.result({
  "duration": 993507300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Br602 Deep Brown",
      "offset": 39
    }
  ],
  "location": "ShiseidoProdPageSteps.user_select_Shiseido_product_color_as(String)"
});
formatter.result({
  "duration": 1008066800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    }
  ],
  "location": "ShiseidoProdPageSteps.user_select_Shiseido_product_quantity_as(String)"
});
formatter.result({
  "duration": 1921445900,
  "status": "passed"
});
formatter.match({
  "location": "ShiseidoProdPageSteps.user_select_Shiseido_shipIt_option()"
});
formatter.result({
  "duration": 1031633700,
  "status": "passed"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_addToBag_button()"
});
formatter.result({
  "duration": 140491500,
  "status": "passed"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_viewMyBagAndCheckOut()"
});
formatter.result({
  "duration": 9277792600,
  "status": "passed"
});
formatter.match({
  "location": "BagPageSteps.bag_page_should_display()"
});
formatter.result({
  "duration": 930862800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Items (1)",
      "offset": 46
    }
  ],
  "location": "BagPageSteps.user_verify_totalItems_on_ShiseidoBagPage_as(String)"
});
formatter.result({
  "duration": 918305600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Natural Eyebrow Pencil/0.1 oz.",
      "offset": 48
    }
  ],
  "location": "BagPageSteps.user_verify_product_name_on_ShiseidoBagPage_as(String)"
});
formatter.result({
  "duration": 932086200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$20.00",
      "offset": 44
    }
  ],
  "location": "BagPageSteps.user_verify_subTotal_on_ShiseidoBagPage_as(String)"
});
formatter.result({
  "duration": 912952900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$25.95",
      "offset": 50
    }
  ],
  "location": "BagPageSteps.user_verify_estimatedTotal_on_ShiseidoBagPage_as(String)"
});
formatter.result({
  "duration": 932417100,
  "status": "passed"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_checkout_button_on_bagPage()"
});
formatter.result({
  "duration": 5645423100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.checkout_page_should_display_Shiseido_products()"
});
formatter.result({
  "duration": 924960200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Natural Eyebrow Pencil/0.1 oz.",
      "offset": 53
    }
  ],
  "location": "CheckoutPageSteps.user_verify_product_name_on_ShiseidoCheckoutPage_as(String)"
});
formatter.result({
  "duration": 937066300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 57
    }
  ],
  "location": "CheckoutPageSteps.user_verify_product_quantity_on_ShiseidoCheckoutPage_as(String)"
});
formatter.result({
  "duration": 914797000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$20.00",
      "offset": 50
    }
  ],
  "location": "CheckoutPageSteps.user_verify_itemTotal_on_ShiseidoCheckoutPage_as(String)"
});
formatter.result({
  "duration": 914336200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$5.95",
      "offset": 49
    }
  ],
  "location": "CheckoutPageSteps.user_verify_shipping_on_ShiseidoCheckoutPage_as(String)"
});
formatter.result({
  "duration": 925673000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$0.00",
      "offset": 51
    }
  ],
  "location": "CheckoutPageSteps.user_verify_verify_tax_on_ShiseidoCheckoutPage_as(String)"
});
formatter.result({
  "duration": 904150400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$25.95",
      "offset": 51
    }
  ],
  "location": "CheckoutPageSteps.user_verify_orderTotal_on_ShiseidoCheckoutPage_as(String)"
});
formatter.result({
  "duration": 2833091600,
  "status": "passed"
});
formatter.match({
  "location": "AccountPageSteps.user_click_SignOut_button()"
});
formatter.result({
  "duration": 12653034200,
  "status": "passed"
});
formatter.after({
  "duration": 678258100,
  "status": "passed"
});
formatter.uri("src/test/resources/features/LordAndTaylorSignIn.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#This is Lord\u0026Taylor Sign In functionality:"
    }
  ],
  "line": 3,
  "name": "LordAndTaylor SignIn Functionality",
  "description": "",
  "id": "lordandtaylor-signin-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3639039800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "As a non-validated user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigate to site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User close emailPopUp button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "LordAndTaylor home page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Browser should display SignIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationSteps.as_a_non_validated_user()"
});
formatter.result({
  "duration": 57568400,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_to_site()"
});
formatter.result({
  "duration": 5731751500,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_close_emailPopUp_button()"
});
formatter.result({
  "duration": 1072254300,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.lordandtaylor_home_page_should_display()"
});
formatter.result({
  "duration": 13208800,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_link()"
});
formatter.result({
  "duration": 7021776300,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.browser_should_display_SignIn_page()"
});
formatter.result({
  "duration": 904157500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "1. Valid email and valid password",
  "description": "",
  "id": "lordandtaylor-signin-functionality;1.-valid-email-and-valid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@regression"
    },
    {
      "line": 14,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User enter email as \"hema_ahmad@yahoo.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enter password as \"Hema\u0026123\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Account page should display greeting message",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User click SignOut button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "hema_ahmad@yahoo.com",
      "offset": 21
    }
  ],
  "location": "SignInSteps.user_enter_email_as(String)"
});
formatter.result({
  "duration": 1092520100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hema\u0026123",
      "offset": 24
    }
  ],
  "location": "SignInSteps.user_enter_password_as(String)"
});
formatter.result({
  "duration": 1100893500,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_button()"
});
formatter.result({
  "duration": 6798926100,
  "status": "passed"
});
formatter.match({
  "location": "AccountPageSteps.account_page_should_display_greeting_message()"
});
formatter.result({
  "duration": 3033282600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[@class\u003d\u0027account-header__greeting\u0027]\"}\n  (Session info: chrome\u003d65.0.3325.181)\n  (Driver info: chromedriver\u003d2.37.543627 (63642262d9fb93fb4ab52398be4286d844092a5e),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027SHIFT-PC01\u0027, ip: \u0027192.168.0.10\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.543627 (63642262d9fb93..., userDataDir: C:\\Users\\SHIFTS~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 65.0.3325.181, webStorageEnabled: true}\nSession ID: 5a7dcdb8dee70880f1fcb3bee4615e75\n*** Element info: {Using\u003dxpath, value\u003d//h1[@class\u003d\u0027account-header__greeting\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat com.lordandtaylor.qa.framework.steps.AccountPageSteps.account_page_should_display_greeting_message(AccountPageSteps.java:34)\r\n\tat ✽.Then Account page should display greeting message(src/test/resources/features/LordAndTaylorSignIn.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AccountPageSteps.user_click_SignOut_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 740961900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "2. Invalid email and valid password",
  "description": "",
  "id": "lordandtaylor-signin-functionality;2.-invalid-email-and-valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@debug"
    },
    {
      "line": 23,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User enter email as \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enter password as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "EmailError should display as \"\u003cErrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "lordandtaylor-signin-functionality;2.-invalid-email-and-valid-password;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password",
        "ErrorMessage"
      ],
      "line": 30,
      "id": "lordandtaylor-signin-functionality;2.-invalid-email-and-valid-password;;1"
    },
    {
      "cells": [
        "",
        "Hema\u0026123",
        "This field is required."
      ],
      "line": 31,
      "id": "lordandtaylor-signin-functionality;2.-invalid-email-and-valid-password;;2"
    },
    {
      "cells": [
        "hemaahmad@gmail",
        "Hema\u0026123",
        "Enter a valid email address."
      ],
      "line": 32,
      "id": "lordandtaylor-signin-functionality;2.-invalid-email-and-valid-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3675842900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "As a non-validated user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigate to site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User close emailPopUp button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "LordAndTaylor home page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Browser should display SignIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationSteps.as_a_non_validated_user()"
});
formatter.result({
  "duration": 59577100,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_to_site()"
});
formatter.result({
  "duration": 5857139700,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_close_emailPopUp_button()"
});
formatter.result({
  "duration": 1068021900,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.lordandtaylor_home_page_should_display()"
});
formatter.result({
  "duration": 6849800,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_link()"
});
formatter.result({
  "duration": 5793986900,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.browser_should_display_SignIn_page()"
});
formatter.result({
  "duration": 894282200,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "2. Invalid email and valid password",
  "description": "",
  "id": "lordandtaylor-signin-functionality;2.-invalid-email-and-valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@debug"
    },
    {
      "line": 23,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User enter email as \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enter password as \"Hema\u0026123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "EmailError should display as \"This field is required.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "SignInSteps.user_enter_email_as(String)"
});
formatter.result({
  "duration": 952283800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hema\u0026123",
      "offset": 24
    }
  ],
  "location": "SignInSteps.user_enter_password_as(String)"
});
formatter.result({
  "duration": 1001949200,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_button()"
});
formatter.result({
  "duration": 6786766900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This field is required.",
      "offset": 30
    }
  ],
  "location": "AccountPageSteps.emailerror_should_display_as(String)"
});
formatter.result({
  "duration": 892079000,
  "status": "passed"
});
formatter.after({
  "duration": 677232200,
  "status": "passed"
});
formatter.before({
  "duration": 3640951900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "As a non-validated user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigate to site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User close emailPopUp button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "LordAndTaylor home page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Browser should display SignIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationSteps.as_a_non_validated_user()"
});
formatter.result({
  "duration": 50843800,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_to_site()"
});
formatter.result({
  "duration": 6115009100,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_close_emailPopUp_button()"
});
formatter.result({
  "duration": 1078286900,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.lordandtaylor_home_page_should_display()"
});
formatter.result({
  "duration": 13054200,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_link()"
});
formatter.result({
  "duration": 6147899400,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.browser_should_display_SignIn_page()"
});
formatter.result({
  "duration": 862437500,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "2. Invalid email and valid password",
  "description": "",
  "id": "lordandtaylor-signin-functionality;2.-invalid-email-and-valid-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@debug"
    },
    {
      "line": 23,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User enter email as \"hemaahmad@gmail\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enter password as \"Hema\u0026123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "EmailError should display as \"Enter a valid email address.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hemaahmad@gmail",
      "offset": 21
    }
  ],
  "location": "SignInSteps.user_enter_email_as(String)"
});
formatter.result({
  "duration": 1055140000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hema\u0026123",
      "offset": 24
    }
  ],
  "location": "SignInSteps.user_enter_password_as(String)"
});
formatter.result({
  "duration": 1047269500,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_button()"
});
formatter.result({
  "duration": 6797435500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter a valid email address.",
      "offset": 30
    }
  ],
  "location": "AccountPageSteps.emailerror_should_display_as(String)"
});
formatter.result({
  "duration": 879778200,
  "status": "passed"
});
formatter.after({
  "duration": 667214500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 36,
  "name": "3. Valid email and invalid password",
  "description": "",
  "id": "lordandtaylor-signin-functionality;3.-valid-email-and-invalid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@smoke"
    },
    {
      "line": 35,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User enter email as \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User enter password as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "PasswordError should display as \"\u003cErrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 41,
  "name": "",
  "description": "",
  "id": "lordandtaylor-signin-functionality;3.-valid-email-and-invalid-password;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password",
        "ErrorMessage"
      ],
      "line": 42,
      "id": "lordandtaylor-signin-functionality;3.-valid-email-and-invalid-password;;1"
    },
    {
      "cells": [
        "hema_ahmad@yahoo.com",
        "",
        "This field is required."
      ],
      "line": 43,
      "id": "lordandtaylor-signin-functionality;3.-valid-email-and-invalid-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3652368200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "As a non-validated user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigate to site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User close emailPopUp button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "LordAndTaylor home page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Browser should display SignIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationSteps.as_a_non_validated_user()"
});
formatter.result({
  "duration": 45991500,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_to_site()"
});
formatter.result({
  "duration": 6649101700,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_close_emailPopUp_button()"
});
formatter.result({
  "duration": 1043330500,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.lordandtaylor_home_page_should_display()"
});
formatter.result({
  "duration": 8122400,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_link()"
});
formatter.result({
  "duration": 7013524400,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.browser_should_display_SignIn_page()"
});
formatter.result({
  "duration": 874163000,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "3. Valid email and invalid password",
  "description": "",
  "id": "lordandtaylor-signin-functionality;3.-valid-email-and-invalid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@smoke"
    },
    {
      "line": 35,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User enter email as \"hema_ahmad@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User enter password as \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User click SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "PasswordError should display as \"This field is required.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hema_ahmad@yahoo.com",
      "offset": 21
    }
  ],
  "location": "SignInSteps.user_enter_email_as(String)"
});
formatter.result({
  "duration": 1134201900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 24
    }
  ],
  "location": "SignInSteps.user_enter_password_as(String)"
});
formatter.result({
  "duration": 942453400,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_button()"
});
formatter.result({
  "duration": 6762099500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This field is required.",
      "offset": 33
    }
  ],
  "location": "AccountPageSteps.passworderror_should_display_as(String)"
});
formatter.result({
  "duration": 883684100,
  "status": "passed"
});
formatter.after({
  "duration": 656730300,
  "status": "passed"
});
});