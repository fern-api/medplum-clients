package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMedicationRequest_Substitution.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationRequest_Substitution {
  Optional<String> id();

  Optional<CodeableConcept> reason();

  Optional<CodeableConcept> allowedCodeableConcept();

  Optional<Boolean> allowedBoolean();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicationRequest_Substitution.Builder builder() {
    return ImmutableMedicationRequest_Substitution.builder();
  }
}