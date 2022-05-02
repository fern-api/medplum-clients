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
    as = ImmutableCapabilityStatement_Interaction1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Interaction1 {
  Optional<List<Extension>> modifierExtension();

  Optional<Capabilitystatement_interaction1Code> code();

  Optional<String> id();

  Optional<Markdown> documentation();

  Optional<List<Extension>> extension();

  static ImmutableCapabilityStatement_Interaction1.Builder builder() {
    return ImmutableCapabilityStatement_Interaction1.builder();
  }
}
