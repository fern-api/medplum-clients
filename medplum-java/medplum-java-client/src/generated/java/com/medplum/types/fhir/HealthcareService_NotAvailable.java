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
    as = ImmutableHealthcareService_NotAvailable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HealthcareService_NotAvailable {
  Optional<String> description();

  Optional<Period> during();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableHealthcareService_NotAvailable.Builder builder() {
    return ImmutableHealthcareService_NotAvailable.builder();
  }
}
