package jove.controller;

import jove.entity.*;
import jove.service.ProgrammerService;
import jove.service.ProjectLeadService;
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
    public String update(@ModelAttribute("theProjectLead") ProjectLead theProjectLead, @RequestParam("id") int id) {
        ProjectLead update = projectLeadService.getProjectLeadById(id);
        if (update != null) {
            update.setProjectLead_name(theProjectLead.getProjectLead_name());
            update.setUsername(theProjectLead.getUsername());
            update.setExperience(theProjectLead.getExperience());
            update.setKnown_language(theProjectLead.getKnown_language());
            update.setSpecializations(theProjectLead.getSpecializations());
            update.setDate_of_joining(theProjectLead.getDate_of_joining());
            projectLeadService.updateProjectLead(update);
        }
        return "redirect:/projectlead/" +id;
    }

}
