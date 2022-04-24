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
    as = ImmutableMedicationKnowledge_Regulatory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Regulatory {
  Reference regulatoryAuthority();

  Optional<MedicationKnowledge_MaxDispense> maxDispense();

  Optional<List<MedicationKnowledge_Substitution>> substitution();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<MedicationKnowledge_Schedule>> schedule();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicationKnowledge_Regulatory.RegulatoryAuthorityBuildStage builder() {
    return ImmutableMedicationKnowledge_Regulatory.builder();
  }
}
