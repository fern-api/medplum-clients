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
    as = ImmutableMedicinalProduct_CountryLanguage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_CountryLanguage {
  CodeableConcept language();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> jurisdiction();

  Optional<String> id();

  CodeableConcept country();

  static ImmutableMedicinalProduct_CountryLanguage.LanguageBuildStage builder() {
    return ImmutableMedicinalProduct_CountryLanguage.builder();
  }
}
