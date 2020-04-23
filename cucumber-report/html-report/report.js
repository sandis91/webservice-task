$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "User logs in",
  "description": "",
  "id": "user-logs-in",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16060104300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User logs in",
  "description": "",
  "id": "user-logs-in;user-logs-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I login using email: \"email\" and password: \"password\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 22
    },
    {
      "val": "password",
      "offset": 44
    }
  ],
  "location": "GoogleSteps.i_login_using_email_and_password(String,String)"
});
formatter.result({
  "duration": 174144500,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitions.GoogleSteps.i_login_using_email_and_password(GoogleSteps.java:24)\r\n\tat ✽.Given I login using email: \"email\" and password: \"password\"(login.feature:5)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is data:,");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1837027500,
  "status": "passed"
});
});