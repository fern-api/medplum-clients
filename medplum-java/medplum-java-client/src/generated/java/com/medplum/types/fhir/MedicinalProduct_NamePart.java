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
    as = ImmutableMedicinalProduct_NamePart.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct_NamePart {
  Coding type();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> part();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProduct_NamePart.TypeBuildStage builder() {
    return ImmutableMedicinalProduct_NamePart.builder();
  }
}
