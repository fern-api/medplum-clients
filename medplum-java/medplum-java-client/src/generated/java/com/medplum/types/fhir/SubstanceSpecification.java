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
  Optional<Code> language();

  Optional<Reference> referenceInformation();

  Optional<Meta> meta();

  Optional<List<SubstanceSpecification_Name>> name();

  Optional<SubstanceSpecification_Structure> structure();

  Optional<Id> id();

  Optional<String> description();

  Optional<Reference> sourceMaterial();

  Optional<List<SubstanceSpecification_Relationship>> relationship();

  Optional<CodeableConcept> status();

  Optional<List<Extension>> extension();

  Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight();

  Optional<Reference> polymer();

  Optional<Narrative> text();

  Optional<Identifier> identifier();

  Optional<String> comment();

  Optional<Reference> protein();

  Optional<CodeableConcept> domain();

  Optional<List<SubstanceSpecification_Code>> code();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<Reference> nucleicAcid();

  Optional<List<Reference>> source();

  Optional<CodeableConcept> type();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<SubstanceSpecification_Property>> property();

  Optional<List<SubstanceSpecification_Moiety>> moiety();

  static ImmutableSubstanceSpecification.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSpecification.builder();
  }
}
