package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableHealthcareService_Eligibility.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HealthcareService_Eligibility {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> extension();

  Optional<markdown> comment();

  static ImmutableHealthcareService_Eligibility.Builder builder() {
    return ImmutableHealthcareService_Eligibility.builder();
  }
}
