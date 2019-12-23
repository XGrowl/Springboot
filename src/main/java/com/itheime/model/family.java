package com.itheime.model;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Component
@Data
@Validated
@ConfigurationProperties(prefix = "family")
public class family {
 //   @Value("${family.family-name}")
    private String familyName;
    private  Father father;
    private Mother mother;
    private Child child;
}
