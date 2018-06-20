package com.jxjxjxm.apptest.service.impl;

import com.jxjxjxm.apptest.model.Job;
import com.jxjxjxm.apptest.model.JobDescription;
import com.jxjxjxm.apptest.service.JobService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class JobServiceImpl implements JobService{
    
    @Override
    public List<Job> getJobs() {
        List<Job> ret= new ArrayList<Job>();
        Job job1 = new Job();
 
        List<String> aux= new ArrayList<String>();
        JobDescription jobD1 = new JobDescription();
        jobD1.setRequirements(aux);
        aux= new ArrayList<String>();
        jobD1.setResponsibilities(aux);
        aux= new ArrayList<String>();
        aux.add("Minimum of 3 years of professional experience developing in the JavaScript ecosystem (Node.js, Express)"); 
        aux.add("Experience as a Full-Stack Developer, with a Back End + DevOps specialty (SQL/NoSQL/Elasticsearch => Node => React.js[ideal, not required])");
        aux.add("Senior level application knowledge, with an experience building, growing and maintaining a variety of different products");
        jobD1.setGenerals(aux); 
        job1.setTitle("DevOps Software Engineer 1");
        job1.setDescription(jobD1);
        ret.add(job1);
        return ret;
    }
}