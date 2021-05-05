package Entities;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.UserCheckManager;
import Concrete.UserManager;

public class Main {

	public static void main(String[] args) {
		
		Users user1 =new Users(345645,"Kübra","Sambur","29.03.2000");
		Users user2 =new Users(254655,"Berkay","Ergün","13.06.1999");
		
		Games game1 = new Games("Cs:go");
		Games game2 = new Games("Bussiness tour");
		
		Campaigns camp1 = new  Campaigns(1, 20, "01.01.01");
		Campaigns camp2 = new  Campaigns(2, 60, "02.02.02");
		
		UserCheckManager check = new UserCheckManager();
		check.check(user1);
		
		CampaignManager campmanag = new CampaignManager();
		campmanag.delete(camp1);
		
		CampaignManager campmanag1 = new CampaignManager();
		campmanag1.delete(camp2);
		
		UserManager user = new UserManager();
		user.register(user2);
		
		GameManager game = new GameManager();
		game.sell(user1, game1);
		
		GameManager games = new GameManager();
		games.sell(user2, game2);
	}

}
