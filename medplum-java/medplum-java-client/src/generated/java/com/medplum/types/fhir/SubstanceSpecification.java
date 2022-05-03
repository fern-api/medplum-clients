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
  Optional<List<Extension>> modifierExtension();

  Optional<List<SubstanceSpecification_Name>> name();

  Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight();

  Optional<String> description();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<SubstanceSpecification_Moiety>> moiety();

  Optional<CodeableConcept> status();

  Optional<String> comment();

  Optional<Code> language();

  Optional<CodeableConcept> type();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> source();

  Optional<List<SubstanceSpecification_Code>> code();

  Optional<Reference> protein();

  Optional<SubstanceSpecification_Structure> structure();

  Optional<Uri> implicitRules();

  Optional<Identifier> identifier();

  Optional<Reference> sourceMaterial();

  Optional<CodeableConcept> domain();

  Optional<Reference> referenceInformation();

  Optional<List<SubstanceSpecification_Property>> property();

  Optional<Reference> nucleicAcid();

  Optional<Id> id();

  Optional<List<SubstanceSpecification_Relationship>> relationship();

  Optional<Reference> polymer();

  static ImmutableSubstanceSpecification.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSpecification.builder();
  }
}
