package jove.controller;

import jove.entity.*;
import jove.service.ProgrammerService;
import jove.service.ProjectLeadService;
import jove.service.SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/programmer")
public class ProgrammerController {

    @Autowired
    private SoftwareService softwareService;

    @Autowired
    private ProgrammerService programmerService;

    @Autowired
    private ProjectLeadService projectLeadService;


    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        Programmer theProgrammer = programmerService.getProgrammerById(id);
        model.addAttribute("theProgrammer", theProgrammer);
        model.addAttribute("id", id);

        Software theSoftware = new Software();
        model.addAttribute("theSoftware", theSoftware);

        List<Software> softwares = softwareService.getAllSoftware();
        model.addAttribute("softwares", softwares);

        List<ProjectLead> projectLeadsofProject= new ArrayList<>();
        model.addAttribute("projectLeadsofProject", projectLeadsofProject);

        for (Software software : softwares) {
            List<Programmer> programmers = software.getListProgrammers();
            List<ProjectLead> projectLeads = software.getListProjectLeads();
            for (ProjectLead projectLead : projectLeads) {
                for (Programmer programmer : programmers) {
                    if (projectLead.getSoftware().getId() == programmer.getSoftware().getId()) {
                        projectLeadsofProject.add(projectLead);
                    }
                }
            }
        }

        ProjectLead theProjectLead = projectLeadService.getProjectLeadById(id);
        model.addAttribute("theProjectLead", theProjectLead);

        return "programmer";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("theProgrammer") Programmer theProgrammer, @RequestParam("id") int id) {
        Programmer update = programmerService.getProgrammerById(id);
        if (update != null) {
            update.setProgrammer_name(theProgrammer.getProgrammer_name());
            update.setUsername(theProgrammer.getUsername());
            update.setExperience(theProgrammer.getExperience());
            update.setKnown_language(theProgrammer.getKnown_language());
            update.setSpecializations(theProgrammer.getSpecializations());
            update.setDate_of_joining(theProgrammer.getDate_of_joining());
            programmerService.updateProgrammer(update);
        }
        return "redirect:/programmer/" +id;
    }


}
