package Abstract;

import Entities.Users;

public interface UserService {
		public void register(Users user);
		public void updateData(Users user);
		public void deleteAccount(Users user);
}
