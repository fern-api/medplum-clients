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
  Optional<Integer> numberOfSubunits();

  Optional<String> areaOfHybridisation();

  Optional<CodeableConcept> oligoNucleotideType();

  Optional<List<SubstanceNucleicAcid_Subunit>> subunit();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> sequenceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  static ImmutableSubstanceNucleicAcid.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceNucleicAcid.builder();
  }
}
