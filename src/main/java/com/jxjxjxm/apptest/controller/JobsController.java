package com.jxjxjxm.apptest.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jxjxjxm.apptest.service.JobService;
import java.util.List;
import com.jxjxjxm.apptest.model.Job;
@RestController
public class JobsController{
    
    private JobService jobService;
    public JobsController(JobService jobService){
        this.jobService = jobService;
    }

    @RequestMapping(value="/jobs")
    public List<Job> getJobs(){
        return jobService.getJobs();
    }
}