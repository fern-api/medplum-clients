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
    as = ImmutablePractitionerRole_NotAvailable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PractitionerRole_NotAvailable {
  Optional<Period> during();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  static ImmutablePractitionerRole_NotAvailable.Builder builder() {
    return ImmutablePractitionerRole_NotAvailable.builder();
  }
}
