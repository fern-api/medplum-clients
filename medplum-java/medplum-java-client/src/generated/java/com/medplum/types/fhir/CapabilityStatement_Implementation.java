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

  Optional<Url> url();

  Optional<List<Extension>> extension();

  Optional<Reference> custodian();

  Optional<String> id();

  Optional<String> description();

  static ImmutableCapabilityStatement_Implementation.Builder builder() {
    return ImmutableCapabilityStatement_Implementation.builder();
  }
}
