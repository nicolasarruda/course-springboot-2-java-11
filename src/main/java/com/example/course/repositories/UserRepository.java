package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;

// JPARepository já tem uma implementação padrão do tipo que vc 
// definir, por exemplo: <User, ...>
public interface UserRepository extends JpaRepository<User, Long> {

}
