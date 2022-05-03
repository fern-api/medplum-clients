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
    as = ImmutableMedicationDispense_Substitution.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationDispense_Substitution {
  Optional<String> id();

  Optional<Boolean> wasSubstituted();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> responsibleParty();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> reason();

  static ImmutableMedicationDispense_Substitution.Builder builder() {
    return ImmutableMedicationDispense_Substitution.builder();
  }
}
