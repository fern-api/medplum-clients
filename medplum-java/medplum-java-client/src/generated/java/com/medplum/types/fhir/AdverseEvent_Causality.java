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
  Optional<Reference> author();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> assessment();

  Optional<String> productRelatedness();

  Optional<CodeableConcept> method();

  Optional<List<Extension>> extension();

  static ImmutableAdverseEvent_Causality.Builder builder() {
    return ImmutableAdverseEvent_Causality.builder();
  }
}
