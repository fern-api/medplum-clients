package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> areaOfHybridisation();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> oligoNucleotideType();

  Optional<CodeableConcept> sequenceType();

  Optional<List<SubstanceNucleicAcid_Subunit>> subunit();

  Optional<Narrative> text();

  String resourceType();

  Optional<Integer> numberOfSubunits();

  static ImmutableSubstanceNucleicAcid.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceNucleicAcid.builder();
  }
}
