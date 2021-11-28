package jove.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jove.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer>
{

}
