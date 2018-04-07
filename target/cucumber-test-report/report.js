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
  "duration": 5078559200,
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
  "duration": 4563465300,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_close_emailPopUp_button()"
});
formatter.result({
  "duration": 1084860900,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.lordandtaylor_home_page_should_display()"
});
formatter.result({
  "duration": 12296800,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_link()"
});
formatter.result({
  "duration": 5155717000,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.browser_should_display_SignIn_page()"
});
formatter.result({
  "duration": 996968700,
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
  "duration": 1112207000,
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
  "duration": 1016170800,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_button()"
});
formatter.result({
  "duration": 6836417400,
  "status": "passed"
});
formatter.match({
  "location": "AccountPageSteps.account_page_should_display_greeting_message()"
});
formatter.result({
  "duration": 3903838300,
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
  "duration": 5048656200,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageSteps.exfoliators_page_should_display()"
});
formatter.result({
  "duration": 1027680700,
  "status": "passed"
});
formatter.match({
  "location": "CategoryPageSteps.user_click_on_Lancome_exfoliator_product()"
});
formatter.result({
  "duration": 7202284200,
  "status": "passed"
});
formatter.match({
  "location": "LancomeProdPageSteps.lancome_product_page_should_display()"
});
formatter.result({
  "duration": 1017516100,
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
  "duration": 1052935500,
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
  "duration": 1901280100,
  "status": "passed"
});
formatter.match({
  "location": "LancomeProdPageSteps.user_select_Lancome_shipIt_option()"
});
formatter.result({
  "duration": 1068129500,
  "status": "passed"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_addToBag_button()"
});
formatter.result({
  "duration": 143436600,
  "status": "passed"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_viewMyBagAndCheckOut()"
});
formatter.result({
  "duration": 8274470100,
  "status": "passed"
});
formatter.match({
  "location": "BagPageSteps.bagpage_should_display()"
});
formatter.result({
  "duration": 951232200,
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
  "duration": 917806600,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cItems ([2])\u003e but was:\u003cItems ([4])\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.lordandtaylor.qa.framework.pages.ViewBagPage.verifyTotalItemsInBag(ViewBagPage.java:58)\r\n\tat com.lordandtaylor.qa.framework.steps.BagPageSteps.user_verify_totalItems_on_LancomeBagPage_as(BagPageSteps.java:20)\r\n\tat ✽.When User verify totalItems on LancomeBagPage as \"Items (2)\"(src/test/resources/features/LordAndTaylorShipPromo.feature:30)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "SimilarButtonsSteps.user_click_checkout_button_on_bagPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutPageSteps.checkout_page_should_display_Lancome_products()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "AccountPageSteps.user_click_SignOut_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 677919800,
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
  "duration": 3613360300,
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
  "duration": 57102300,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_navigate_to_site()"
});
formatter.result({
  "duration": 5713962800,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.user_close_emailPopUp_button()"
});
formatter.result({
  "duration": 1055366600,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationSteps.lordandtaylor_home_page_should_display()"
});
formatter.result({
  "duration": 11571700,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_link()"
});
formatter.result({
  "duration": 5662717000,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.browser_should_display_SignIn_page()"
});
formatter.result({
  "duration": 887991600,
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
  "duration": 1081644900,
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
  "duration": 946911500,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_click_SignIn_button()"
});
formatter.result({
  "duration": 6852224000,
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
  "duration": 888068500,
  "status": "passed"
});
formatter.after({
  "duration": 630693800,
  "status": "passed"
});
});