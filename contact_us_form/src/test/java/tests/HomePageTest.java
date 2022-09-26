package tests;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class HomePageTest extends BaseTest {

   @Test
   public void testTrials() throws InterruptedException {
      assertEquals(homepage.getFirstText(), "Full-Fledged practice website for Automation Engineers", "Homepage is not opened properly");
      homepage.clickContactUsButton();
      contactPage.setnameInput("a");
      contactPage.setemailInput("a@hotmail.com");
      contactPage.setsubjectInput("aaaa");
      contactPage.setmessageInput("aaaa");
      contactPage.chooseFile("/Users/vngrs/Desktop/Screen Shot 2022-08-31 at 14.59.47.png");
      Thread.sleep(3000);
      contactPage.clickSubmitButton();
      contactPage.acceptSubmit();
      assertEquals(successPage.getSuccessText(), "Success! Your details have been submitted successfully.", "Success message error");
      successPage.clickHomeButton();
      assertEquals(homepage.getFirstText(), "Full-Fledged practice website for Automation Engineers", "Homepage is not opened properly");

   }


}
