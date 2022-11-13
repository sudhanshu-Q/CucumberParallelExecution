Feature: Verify Login in Firefox

Scenario: Verify Login to application

   Given Navigate to url "http://127.0.0.1/login.do;jsessionid=2g03nn89d6hvq"
   And Enter the username1 and password1
   |admin|manager|
   Then User navigate to homepage
   And Verify LogOut icon
   
