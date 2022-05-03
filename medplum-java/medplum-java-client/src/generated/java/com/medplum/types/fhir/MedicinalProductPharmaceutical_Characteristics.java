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
    as = ImmutableMedicinalProductPharmaceutical_Characteristics.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical_Characteristics {
  Optional<CodeableConcept> status();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  static ImmutableMedicinalProductPharmaceutical_Characteristics.CodeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical_Characteristics.builder();
  }
}
