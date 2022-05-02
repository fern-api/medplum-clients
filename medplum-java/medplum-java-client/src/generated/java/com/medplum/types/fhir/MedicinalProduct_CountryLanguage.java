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
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> jurisdiction();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept language();

  CodeableConcept country();

  static ImmutableMedicinalProduct_CountryLanguage.LanguageBuildStage builder() {
    return ImmutableMedicinalProduct_CountryLanguage.builder();
  }
}
