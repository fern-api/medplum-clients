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
    as = ImmutableSubstanceSpecification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification {
  Optional<List<SubstanceSpecification_Property>> property();

  Optional<List<SubstanceSpecification_Name>> name();

  Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight();

  Optional<List<SubstanceSpecification_Moiety>> moiety();

  Optional<SubstanceSpecification_Structure> structure();

  Optional<List<ResourceList>> contained();

  Optional<List<SubstanceSpecification_Relationship>> relationship();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<Id> id();

  Optional<String> description();

  Optional<Reference> sourceMaterial();

  String resourceType();

  Optional<CodeableConcept> domain();

  Optional<Reference> polymer();

  Optional<List<Reference>> source();

  Optional<String> comment();

  Optional<Meta> meta();

  Optional<List<SubstanceSpecification_Code>> code();

  Optional<CodeableConcept> status();

  Optional<Code> language();

  Optional<Reference> protein();

  Optional<Reference> referenceInformation();

  Optional<Reference> nucleicAcid();

  Optional<CodeableConcept> type();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSpecification.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSpecification.builder();
  }
}
