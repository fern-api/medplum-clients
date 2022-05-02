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
    as = ImmutableGraphDefinition_Compartment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GraphDefinition_Compartment {
  Optional<List<Extension>> modifierExtension();

  Optional<Graphdefinition_compartmentUse> use();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Graphdefinition_compartmentRule> rule();

  Optional<String> expression();

  Optional<Code> code();

  static ImmutableGraphDefinition_Compartment.Builder builder() {
    return ImmutableGraphDefinition_Compartment.builder();
  }
}
