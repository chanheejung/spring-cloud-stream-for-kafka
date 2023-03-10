package kr.pe.chani.springcloudstreampub.controller;


import kr.pe.chani.springcloudstreampub.events.source.SimpleSourceBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value="/source")
public class PublishController {
    @Autowired
    SimpleSourceBean simpleSourceBean;

    @RequestMapping(value="/publish",method = RequestMethod.GET)
    public void getOrganization() {
        simpleSourceBean.publishOrgChange("UPDATE", "aaaaa");
    }

}
