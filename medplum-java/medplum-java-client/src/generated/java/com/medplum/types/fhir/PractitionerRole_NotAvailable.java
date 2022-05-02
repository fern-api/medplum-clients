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
    as = ImmutablePractitionerRole_NotAvailable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PractitionerRole_NotAvailable {
  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Period> during();

  Optional<List<Extension>> modifierExtension();

  static ImmutablePractitionerRole_NotAvailable.Builder builder() {
    return ImmutablePractitionerRole_NotAvailable.builder();
  }
}
