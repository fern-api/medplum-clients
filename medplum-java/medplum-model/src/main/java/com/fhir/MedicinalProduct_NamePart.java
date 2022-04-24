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
    as = ImmutableMedicinalProduct_NamePart.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_NamePart {
  Optional<String> part();

  Optional<List<Extension>> modifierExtension();

  Coding type();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProduct_NamePart.TypeBuildStage builder() {
    return ImmutableMedicinalProduct_NamePart.builder();
  }
}
