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
    as = ImmutableSubstancePolymer_DegreeOfPolymerisation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer_DegreeOfPolymerisation {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> degree();

  Optional<SubstanceAmount> amount();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableSubstancePolymer_DegreeOfPolymerisation.Builder builder() {
    return ImmutableSubstancePolymer_DegreeOfPolymerisation.builder();
  }
}
