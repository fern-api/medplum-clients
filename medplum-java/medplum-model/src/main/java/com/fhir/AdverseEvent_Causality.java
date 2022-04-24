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
    as = ImmutableAdverseEvent_Causality.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AdverseEvent_Causality {
  Optional<String> productRelatedness();

  Optional<Reference> author();

  Optional<CodeableConcept> method();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> assessment();

  Optional<List<Extension>> extension();

  static ImmutableAdverseEvent_Causality.Builder builder() {
    return ImmutableAdverseEvent_Causality.builder();
  }
}
