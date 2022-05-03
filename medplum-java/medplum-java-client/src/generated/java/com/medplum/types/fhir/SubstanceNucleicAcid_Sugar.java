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
  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<String> residueSite();

  Optional<String> id();

  static ImmutableSubstanceNucleicAcid_Sugar.Builder builder() {
    return ImmutableSubstanceNucleicAcid_Sugar.builder();
  }
}
