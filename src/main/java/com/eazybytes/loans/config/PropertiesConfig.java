package com.eazybytes.loans.config;

import com.eazybytes.loans.dto.LoansContactInfoDto;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
public class PropertiesConfig {
}
