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
    as = ImmutableSubstanceReferenceInformation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation {
  Optional<List<SubstanceReferenceInformation_Gene>> gene();

  Optional<List<SubstanceReferenceInformation_Target>> target();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<SubstanceReferenceInformation_Classification>> classification();

  Optional<List<Extension>> extension();

  Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement();

  String resourceType();

  Optional<String> comment();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSubstanceReferenceInformation.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceReferenceInformation.builder();
  }
}
