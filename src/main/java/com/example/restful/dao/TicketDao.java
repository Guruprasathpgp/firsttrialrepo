package com.example.restful.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restful.model.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer>{

}
