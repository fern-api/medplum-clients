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
    as = ImmutableMedicinalProduct_CountryLanguage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_CountryLanguage {
  Optional<List<Extension>> extension();

  CodeableConcept country();

  CodeableConcept language();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> jurisdiction();

  static ImmutableMedicinalProduct_CountryLanguage.CountryBuildStage builder() {
    return ImmutableMedicinalProduct_CountryLanguage.builder();
  }
}
