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
    as = ImmutableHealthcareService_NotAvailable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HealthcareService_NotAvailable {
  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<Period> during();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableHealthcareService_NotAvailable.Builder builder() {
    return ImmutableHealthcareService_NotAvailable.builder();
  }
}
