package jove.controller;

import jove.entity.*;
import jove.service.ProgrammerService;
import jove.service.ProjectLeadService;
import jove.service.ProjectOrderService;
import jove.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/projectlead")
public class ProjectLeaderController {

    @Autowired
    private SoftwareService softwareService;

    @Autowired
    private ProjectLeadService projectLeadService;

    @Autowired
    private ProgrammerService programmerService;

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        ProjectLead theProjectLead = projectLeadService.getProjectLeadById(id);
        model.addAttribute("theProjectLead", theProjectLead);
        model.addAttribute("id", id);

        Software theSoftware = new Software();
        model.addAttribute("theSoftware", theSoftware);

        List<Programmer> programmers = theProjectLead.getSoftware().getListProgrammers();
        model.addAttribute("programmers", programmers);

        Software projectLeadSoftwares = softwareService.getSoftwareById(theProjectLead.getSoftware().getId());
        model.addAttribute("projectLeadSoftwares", projectLeadSoftwares);

        return "project-leader";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("theProjectLead") ProjectLead theProjectLead) {
        projectLeadService.updateProjectLead(theProjectLead);
        return "redirect:/projectleader/" + theProjectLead.getProjectLeadId();
    }

}
