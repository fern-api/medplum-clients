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
    as = ImmutableSubstanceNucleicAcid_Linkage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceNucleicAcid_Linkage {
  Optional<String> connectivity();

  Optional<Identifier> identifier();

  Optional<String> id();

  Optional<String> name();

  Optional<String> residueSite();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceNucleicAcid_Linkage.Builder builder() {
    return ImmutableSubstanceNucleicAcid_Linkage.builder();
  }
}
