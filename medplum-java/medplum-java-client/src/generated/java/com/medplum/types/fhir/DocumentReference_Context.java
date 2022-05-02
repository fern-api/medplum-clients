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
  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> event();

  Optional<String> id();

  Optional<CodeableConcept> facilityType();

  Optional<List<Reference>> related();

  Optional<Period> period();

  Optional<CodeableConcept> practiceSetting();

  Optional<List<Reference>> encounter();

  Optional<Reference> sourcePatientInfo();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDocumentReference_Context.Builder builder() {
    return ImmutableDocumentReference_Context.builder();
  }
}
