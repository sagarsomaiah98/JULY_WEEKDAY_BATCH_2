$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/JANBASK/JULY_WEEKDAY_BATCH_2/AUG_24_BDD/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "there user logs in through Login Window by using Username as \"standard_user\" and Password as \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "login must be successful.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.launch_the_browser()"
});
formatter.result({
  "duration": 3006443800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 62
    },
    {
      "val": "secret_sauce",
      "offset": 94
    }
  ],
  "location": "LoginStepDefinition.there_user_logs_in_through_Login_Window_by_using_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 551000500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.login_must_be_successful()"
});
formatter.result({
  "duration": 204133000,
  "status": "passed"
});
});