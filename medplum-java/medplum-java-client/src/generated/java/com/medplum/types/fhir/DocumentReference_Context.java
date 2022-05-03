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
    as = ImmutableDocumentReference_Context.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentReference_Context {
  Optional<List<Reference>> encounter();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> practiceSetting();

  Optional<CodeableConcept> facilityType();

  Optional<Reference> sourcePatientInfo();

  Optional<Period> period();

  Optional<List<Reference>> related();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> event();

  static ImmutableDocumentReference_Context.Builder builder() {
    return ImmutableDocumentReference_Context.builder();
  }
}
