package org.example.controller;

// src/main/java/com/servicerequest/controller/ServiceRequestController.java




import org.example.entity.ServiceRequest;
import org.example.service.ServiceRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class ServiceRequestController {
    private final ServiceRequestService serviceRequestService;

    public ServiceRequestController(ServiceRequestService serviceRequestService) {
        this.serviceRequestService = serviceRequestService;
    }

    @PostMapping
    public void createRequest(@RequestBody ServiceRequest request) {
        serviceRequestService.createServiceRequest(request);
    }

    @GetMapping
    public List<ServiceRequest> getAllRequests() {
        return serviceRequestService.getAllRequests();
    }
}
