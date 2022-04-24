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
    as = ImmutableMedicationDispense_Substitution.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationDispense_Substitution {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> reason();

  Optional<CodeableConcept> type();

  Optional<Boolean> wasSubstituted();

  Optional<List<Reference>> responsibleParty();

  Optional<String> id();

  static ImmutableMedicationDispense_Substitution.Builder builder() {
    return ImmutableMedicationDispense_Substitution.builder();
  }
}
