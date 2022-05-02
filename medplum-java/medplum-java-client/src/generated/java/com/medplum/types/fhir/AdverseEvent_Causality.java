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
    as = ImmutableAdverseEvent_Causality.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AdverseEvent_Causality {
  Optional<String> id();

  Optional<String> productRelatedness();

  Optional<CodeableConcept> assessment();

  Optional<CodeableConcept> method();

  Optional<Reference> author();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableAdverseEvent_Causality.Builder builder() {
    return ImmutableAdverseEvent_Causality.builder();
  }
}
