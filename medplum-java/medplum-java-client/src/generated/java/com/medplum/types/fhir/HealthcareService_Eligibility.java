package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> extension();

  Optional<Markdown> comment();

  Optional<String> id();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> modifierExtension();

  static ImmutableHealthcareService_Eligibility.Builder builder() {
    return ImmutableHealthcareService_Eligibility.builder();
  }
}
