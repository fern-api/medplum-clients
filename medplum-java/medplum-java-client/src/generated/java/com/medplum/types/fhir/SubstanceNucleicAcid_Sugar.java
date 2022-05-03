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
    as = ImmutableSubstanceNucleicAcid_Sugar.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceNucleicAcid_Sugar {
  Optional<String> residueSite();

  Optional<Identifier> identifier();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceNucleicAcid_Sugar.Builder builder() {
    return ImmutableSubstanceNucleicAcid_Sugar.builder();
  }
}
