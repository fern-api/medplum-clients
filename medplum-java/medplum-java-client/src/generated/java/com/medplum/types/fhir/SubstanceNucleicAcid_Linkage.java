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
    as = ImmutableSubstanceNucleicAcid_Linkage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceNucleicAcid_Linkage {
  Optional<String> id();

  Optional<String> connectivity();

  Optional<List<Extension>> extension();

  Optional<String> residueSite();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<String> name();

  static ImmutableSubstanceNucleicAcid_Linkage.Builder builder() {
    return ImmutableSubstanceNucleicAcid_Linkage.builder();
  }
}
