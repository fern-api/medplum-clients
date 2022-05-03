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
    as = ImmutableMedicinalProduct_Name.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_Name {
  Optional<String> productName();

  Optional<List<Extension>> extension();

  Optional<List<MedicinalProduct_CountryLanguage>> countryLanguage();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<MedicinalProduct_NamePart>> namePart();

  static ImmutableMedicinalProduct_Name.Builder builder() {
    return ImmutableMedicinalProduct_Name.builder();
  }
}
