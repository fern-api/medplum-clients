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
    as = ImmutableDocumentReference_Context.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentReference_Context {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> facilityType();

  Optional<String> id();

  Optional<CodeableConcept> practiceSetting();

  Optional<List<Reference>> related();

  Optional<List<Reference>> encounter();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> event();

  Optional<Period> period();

  Optional<Reference> sourcePatientInfo();

  static ImmutableDocumentReference_Context.Builder builder() {
    return ImmutableDocumentReference_Context.builder();
  }
}
