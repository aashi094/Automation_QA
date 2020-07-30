package StepDef;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;
    public LoginStep(BaseUtil base){
        this.base = base;
    }


        @Given("^I navigate to the login page$")
        public void iNavigateToTheLoginPage() {
            System.out.println("Navigate login page");

        }

        @And("^I entered following details for login$")
        public void iEnteredFollowingDetailsForLogin(DataTable table) {
            //List<List<String>> data = table.raw();
            //System.out.println(data.get(0).get(0));
            //System.out.println(data.get(0).get(1));

            List<User> users = new ArrayList<User>();
            users = table.asList(User.class);
            for (User user : users) {
                System.out.println("The username is :" + user.username);
                System.out.println("The password is :" + user.password);
            }

        }

    @And("^I entered ([^\"]*) and ([^\"]*)$")
    public void iEnteredUsernameAndPassword(String userName, String password) {
        System.out.println("The username is:" + userName );
        System.out.println("The password is:" + password );

    }

    @And("^I entered the users email address as Email:([^\"]*)$")
    public void iEnteredTheUsersEmailAddressAsEmailAdmin(String email) {
        System.out.println("The Email Address is :" + email);
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }


        @And("^I click login button$")
        public void iClickLoginButton() {
            System.out.println("Clicked");

        }

        @Then("^I should see the userform page$")
        public void iShouldSeeTheUserformPage() {
            System.out.println("The driver is:" + base.StepInfo);
            System.out.println("userpage");

        }
    }
