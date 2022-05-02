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
  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> oligoNucleotideType();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<SubstanceNucleicAcid_Subunit>> subunit();

  Optional<CodeableConcept> sequenceType();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  String resourceType();

  Optional<String> areaOfHybridisation();

  Optional<List<ResourceList>> contained();

  Optional<Integer> numberOfSubunits();

  Optional<Narrative> text();

  static ImmutableSubstanceNucleicAcid.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceNucleicAcid.builder();
  }
}
