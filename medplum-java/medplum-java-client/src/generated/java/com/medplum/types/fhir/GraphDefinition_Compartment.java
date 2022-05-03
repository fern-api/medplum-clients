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
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<Code> code();

  Optional<Graphdefinition_compartmentUse> use();

  Optional<String> expression();

  Optional<Graphdefinition_compartmentRule> rule();

  static ImmutableGraphDefinition_Compartment.Builder builder() {
    return ImmutableGraphDefinition_Compartment.builder();
  }
}
