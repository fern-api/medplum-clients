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

  Optional<CodeableConcept> method();

  Optional<CodeableConcept> assessment();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> author();

  Optional<List<Extension>> extension();

  Optional<String> productRelatedness();

  static ImmutableAdverseEvent_Causality.Builder builder() {
    return ImmutableAdverseEvent_Causality.builder();
  }
}
