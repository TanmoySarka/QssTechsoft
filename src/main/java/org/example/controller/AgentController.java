package org.example.controller;

// src/main/java/com/servicerequest/controller/AgentController.java



import org.example.entity.Agent;
import org.example.service.AgentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agents")
public class AgentController {
    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping("/available")
    public List<Agent> getAvailableAgents(@RequestParam String location, @RequestParam List<String> skills) {
        return agentService.findAvailableAgents(location, skills);
    }
}
