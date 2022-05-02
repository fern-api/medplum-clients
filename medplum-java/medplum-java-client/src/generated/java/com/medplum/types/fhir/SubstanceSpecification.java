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
  Optional<CodeableConcept> type();

  Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight();

  Optional<Reference> sourceMaterial();

  Optional<Reference> polymer();

  Optional<Id> id();

  Optional<SubstanceSpecification_Structure> structure();

  Optional<Uri> implicitRules();

  Optional<List<SubstanceSpecification_Relationship>> relationship();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<String> comment();

  Optional<CodeableConcept> domain();

  Optional<Reference> referenceInformation();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<List<SubstanceSpecification_Property>> property();

  Optional<Reference> protein();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> source();

  Optional<List<SubstanceSpecification_Code>> code();

  Optional<Reference> nucleicAcid();

  Optional<Code> language();

  Optional<List<SubstanceSpecification_Moiety>> moiety();

  Optional<CodeableConcept> status();

  Optional<List<SubstanceSpecification_Name>> name();

  Optional<Identifier> identifier();

  static ImmutableSubstanceSpecification.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSpecification.builder();
  }
}
