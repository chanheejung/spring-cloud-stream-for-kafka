package kr.pe.chani.springcloudstreampub.events.source;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class SimpleSourceBean {
//    private Source source;

    private static final Logger logger = LoggerFactory.getLogger(SimpleSourceBean.class);
//
//    @Autowired
//    public SimpleSourceBean(Source source){
//        this.source = source;
//    }

    public void publishOrgChange(String action,String orgId){
//       logger.debug("Sending Kafka message {} for Organization Id: {}", action, orgId);
//        OrganizationChangeModel change =  new OrganizationChangeModel(
//                OrganizationChangeModel.class.getTypeName(),
//                action,
//                orgId,
//                "1234567890");
//
//        source.output().send(MessageBuilder.withPayload(change).build());
    }
}
