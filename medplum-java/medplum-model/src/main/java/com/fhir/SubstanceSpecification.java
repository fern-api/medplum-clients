package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Identifier> identifier();

  Optional<List<Reference>> source();

  Optional<CodeableConcept> type();

  Optional<code> language();

  Optional<Reference> sourceMaterial();

  Optional<Reference> polymer();

  Optional<List<SubstanceSpecification_Name>> name();

  Optional<List<SubstanceSpecification_Relationship>> relationship();

  Optional<Reference> protein();

  Optional<uri> implicitRules();

  Optional<String> comment();

  Optional<List<ResourceList>> contained();

  Optional<String> description();

  Optional<CodeableConcept> domain();

  Optional<List<SubstanceSpecification_Code>> code();

  Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight();

  Optional<List<SubstanceSpecification_Property>> property();

  Optional<SubstanceSpecification_Structure> structure();

  Optional<CodeableConcept> status();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<id> id();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<Meta> meta();

  Optional<Reference> referenceInformation();

  Optional<Reference> nucleicAcid();

  Optional<List<SubstanceSpecification_Moiety>> moiety();

  static ImmutableSubstanceSpecification.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceSpecification.builder();
  }
}
