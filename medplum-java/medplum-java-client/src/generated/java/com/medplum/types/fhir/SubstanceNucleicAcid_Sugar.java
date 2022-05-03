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
  Optional<Identifier> identifier();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<String> residueSite();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSubstanceNucleicAcid_Sugar.Builder builder() {
    return ImmutableSubstanceNucleicAcid_Sugar.builder();
  }
}
