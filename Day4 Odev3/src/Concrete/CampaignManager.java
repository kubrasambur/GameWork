package Concrete;

import Abstract.CampaignService;
import Entities.Campaigns;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaigns campaign) {
		System.out.println("campaign " + campaign.getId() + " added");
		
	}

	@Override
	public void delete(Campaigns campaign) {
		System.out.println("campaign " + campaign.getId() + " deleted");
		
	}

	@Override
	public void update(Campaigns campaign) {
		System.out.println("campaign " + campaign.getId() + " updated");
		
	}

}
