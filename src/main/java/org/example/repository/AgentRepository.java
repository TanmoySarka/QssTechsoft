package org.example.repository;

import org.example.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    List<Agent> findByLocationAndSkillsIn(String location, List<String> skills);

}
