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
    as = ImmutableMedicinalProductPharmaceutical_Characteristics.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical_Characteristics {
  Optional<List<Extension>> extension();

  CodeableConcept code();

  Optional<String> id();

  Optional<CodeableConcept> status();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicinalProductPharmaceutical_Characteristics.CodeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical_Characteristics.builder();
  }
}
