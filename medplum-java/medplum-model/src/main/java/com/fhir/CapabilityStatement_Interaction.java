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
    as = ImmutableCapabilityStatement_Interaction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Interaction {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> documentation();

  Optional<String> id();

  Optional<Capabilitystatement_interactionCode> code();

  static ImmutableCapabilityStatement_Interaction.Builder builder() {
    return ImmutableCapabilityStatement_Interaction.builder();
  }
}
