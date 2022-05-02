package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCapabilityStatement_Security.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Security {
  Optional<String> id();

  Optional<Markdown> description();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> cors();

  Optional<List<CodeableConcept>> service();

  static ImmutableCapabilityStatement_Security.Builder builder() {
    return ImmutableCapabilityStatement_Security.builder();
  }
}
