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
    as = ImmutableSubstancePolymer_MonomerSet.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer_MonomerSet {
  Optional<CodeableConcept> ratioType();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<SubstancePolymer_StartingMaterial>> startingMaterial();

  static ImmutableSubstancePolymer_MonomerSet.Builder builder() {
    return ImmutableSubstancePolymer_MonomerSet.builder();
  }
}
