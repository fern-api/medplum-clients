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
  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<List<SubstanceNucleicAcid_Subunit>> subunit();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> sequenceType();

  Optional<Integer> numberOfSubunits();

  String resourceType();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<String> areaOfHybridisation();

  Optional<CodeableConcept> oligoNucleotideType();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceNucleicAcid.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceNucleicAcid.builder();
  }
}
