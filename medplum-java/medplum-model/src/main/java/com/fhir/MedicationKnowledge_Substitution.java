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
    as = ImmutableMedicationKnowledge_Substitution.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Substitution {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Boolean> allowed();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept type();

  static ImmutableMedicationKnowledge_Substitution.TypeBuildStage builder() {
    return ImmutableMedicationKnowledge_Substitution.builder();
  }
}
