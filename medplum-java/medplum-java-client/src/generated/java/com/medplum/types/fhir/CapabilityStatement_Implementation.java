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
    as = ImmutableCapabilityStatement_Implementation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Implementation {
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> custodian();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> description();

  Optional<Url> url();

  static ImmutableCapabilityStatement_Implementation.Builder builder() {
    return ImmutableCapabilityStatement_Implementation.builder();
  }
}
