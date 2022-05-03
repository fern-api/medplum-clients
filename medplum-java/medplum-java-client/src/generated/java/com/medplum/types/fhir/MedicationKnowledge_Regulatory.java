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
    as = ImmutableMedicationKnowledge_Regulatory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Regulatory {
  Optional<List<MedicationKnowledge_Substitution>> substitution();

  Optional<List<Extension>> modifierExtension();

  Optional<MedicationKnowledge_MaxDispense> maxDispense();

  Optional<List<MedicationKnowledge_Schedule>> schedule();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Reference regulatoryAuthority();

  static ImmutableMedicationKnowledge_Regulatory.RegulatoryAuthorityBuildStage builder() {
    return ImmutableMedicationKnowledge_Regulatory.builder();
  }
}
