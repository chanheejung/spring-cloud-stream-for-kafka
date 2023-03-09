package kr.pe.chani.springcloudstreamsub.events.handlers;


import kr.pe.chani.springcloudstreamsub.events.CustomChannels;
import kr.pe.chani.springcloudstreamsub.events.models.OrganizationChangeModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;


@Slf4j
@EnableBinding(CustomChannels.class)
public class OrganizationChangeHandler {


    @StreamListener("inboundOrgChanges")
    public void loggerSink(OrganizationChangeModel orgChange) {
        log.info("Received a message of type " + orgChange.getType());
        switch(orgChange.getAction()){
            case "GET":
                log.info("Received a GET event from the organization service for organization id {}", orgChange.getOrganizationId());
                break;
            case "SAVE":
                log.info("Received a SAVE event from the organization service for organization id {}", orgChange.getOrganizationId());
                break;
            case "UPDATE":
                log.info("Received a UPDATE event from the organization service for organization id {}", orgChange.getOrganizationId());
                break;
            case "DELETE":
                log.info("Received a DELETE event from the organization service for organization id {}", orgChange.getOrganizationId());
                break;
            default:
                log.error("Received an UNKNOWN event from the organization service of type {}", orgChange.getType());
                break;

        }
    }

}
