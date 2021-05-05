package Entities;

public class Campaigns {
		private int id;
		private int percent;
		private String deadline;
		
		public Campaigns(int id, int percent, String deadline) {
			this.id = id;
			this.percent = percent;
			this.deadline = deadline;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getPercent() {
			return percent;
		}
		public void setPercent(int percent) {
			this.percent = percent;
		}
		public String getDeadline() {
			return deadline;
		}
		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}
		
}
