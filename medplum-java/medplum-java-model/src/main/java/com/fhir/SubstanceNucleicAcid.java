package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstanceNucleicAcid.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceNucleicAcid {
  Optional<List<ResourceList>> contained();

  Optional<code> language();

  Optional<CodeableConcept> oligoNucleotideType();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<CodeableConcept> sequenceType();

  Optional<Integer> numberOfSubunits();

  Optional<uri> implicitRules();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<SubstanceNucleicAcid_Subunit>> subunit();

  Optional<id> id();

  Optional<String> areaOfHybridisation();

  Optional<Meta> meta();

  static ImmutableSubstanceNucleicAcid.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceNucleicAcid.builder();
  }
}
