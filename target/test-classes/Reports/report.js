$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Verifying facebook details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying facebook login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As a user launching facebook",
  "keyword": "Given "
});
formatter.step({
  "name": "As a user enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "As a clcik on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user must verify about homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "selenium",
        "selenium123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying facebook login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As a user launching facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.as_a_user_launching_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user enter the \"selenium\" and \"selenium123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.as_a_user_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a clcik on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.as_a_clcik_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user must verify about homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_must_verify_about_homepage()"
});
formatter.result({
  "status": "passed"
});
});