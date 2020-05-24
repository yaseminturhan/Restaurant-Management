/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Interfaces.UserInterfaces;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Model.Global;
import Model.UserModel;
import Interfaces.IDao;
import static java.nio.file.Files.lines;
import Interfaces.UserInterfaces;

/**
 *
 * @author yaseminturhan
 */

public class User extends FileModel implements UserInterfaces<UserModel>{
	
	private static final String FILE_NAME= "user.txt";

	@Override
	public void save(UserModel user, String tempId) {
		user.setId(Integer.parseInt(tempId));
		user.setDate(new Date().toString());
		super.writeFile(FILE_NAME, user.toString());
	}

	

	@Override
	public void update(String id, UserModel t) {
		String temp =id;
		delete(id);
		this.save(t,temp);
	}

	@Override
	public void delete(String id) {
		super.deleteLine(FILE_NAME, id);
		
	}

	@Override
	public List<UserModel> getAll() {
		ArrayList<UserModel> users = new ArrayList<>();
		for(String line : super.readLines(FILE_NAME)) {
			String[] attr = line.split("___");
			
			UserModel user = new UserModel(
					Integer.valueOf(attr[0]),
					attr[1],
					attr[2],
					attr[3],
					attr[4],
                                        attr[5]
                                        
					
			);
			users.add(user);
		}
		return users;
	}

	public ArrayList<ArrayList<String>> getAllForTable() {
		ArrayList<ArrayList<String>> datas = new ArrayList<>();
		for(UserModel user : this.getAll()) {
			ArrayList<String> data = new ArrayList<>();
			data.add(String.valueOf(user.getId()));
			data.add(user.getDate());
			data.add(user.getName());
			data.add(user.getSurname());
			data.add(user.getUsername());
			data.add(user.getPassword());
			datas.add(data);
		}
		return datas;
	}


	
	
        
       
    
     public boolean login(String userName, String password) {
		ArrayList<String> users = super.readLines(FILE_NAME);
		for(String line : users) {
			String[] attr = line.split("___");
			if(attr[4].equals(userName) && attr[5].equals(password)) {
				UserModel user = new UserModel(Integer.parseInt(attr[0]), attr[1], attr[2], attr[3], 
						attr[4], attr[5]);
				Global.user = user;
				return true;
			}
		}
		return false;
	}
        
        
    

}