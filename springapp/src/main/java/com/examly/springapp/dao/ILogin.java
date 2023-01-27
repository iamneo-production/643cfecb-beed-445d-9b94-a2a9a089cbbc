package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Login;

public interface ILogin extends JpaRepository<Login,String>{

}
