package com.ics95191.demo;

import com.ics95191.demo.Model.Matches;
import com.ics95191.demo.Model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "Stanley",url="http:// 10.51.10.111:2200",configuration = FeignConfiguration.class)
public interface FeignRestClient {
    @RequestMapping(method = RequestMethod.POST,value = "students")
    Student registerStudent(@RequestBody Student student);
    @RequestMapping(method = RequestMethod.POST,value = "gender")
    Matches postGender(@RequestBody Matches matches);




}
