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
  Optional<List<Extension>> modifierExtension();

  Optional<List<MedicationKnowledge_Schedule>> schedule();

  Reference regulatoryAuthority();

  Optional<List<MedicationKnowledge_Substitution>> substitution();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<MedicationKnowledge_MaxDispense> maxDispense();

  static ImmutableMedicationKnowledge_Regulatory.RegulatoryAuthorityBuildStage builder() {
    return ImmutableMedicationKnowledge_Regulatory.builder();
  }
}
