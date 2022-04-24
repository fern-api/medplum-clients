package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> reason();

  Optional<String> id();

  Optional<Boolean> allowedBoolean();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> allowedCodeableConcept();

  static ImmutableMedicationRequest_Substitution.Builder builder() {
    return ImmutableMedicationRequest_Substitution.builder();
  }
}
