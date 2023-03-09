package kr.pe.chani.springcloudstreampub.events.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrganizationChangeModel{
    private String type;
    private String action;
    private String organizationId;
    private String correlationId;
}