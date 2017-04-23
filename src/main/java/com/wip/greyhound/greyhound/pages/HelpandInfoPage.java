package com.wip.greyhound.greyhound.pages;

import org.openqa.selenium.WebDriver;

public class HelpandInfoPage extends BasePage {
  String rewardsPoint = "#main nav div div a:nth-child(2)";

  public HelpandInfoPage(WebDriver driver) {
    super(driver);
  }

  public RoadRewardsPage GotoRoadRewards() {
    click(rewardsPoint);
    return new RoadRewardsPage(driver);
  }


}
