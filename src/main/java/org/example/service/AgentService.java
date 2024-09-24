package org.example.service;

// src/main/java/com/servicerequest/service/AgentService.java



import org.example.entity.Agent;
import org.example.repository.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {
    private final AgentRepository agentRepository;

    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public List<Agent> findAvailableAgents(String location, List<String> skills) {
        return agentRepository.findByLocationAndSkillsIn(location, skills);
    }
}

