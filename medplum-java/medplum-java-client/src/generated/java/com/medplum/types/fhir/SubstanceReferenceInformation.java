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
  Optional<Uri> implicitRules();

  Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement();

  Optional<List<SubstanceReferenceInformation_Target>> target();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<SubstanceReferenceInformation_Classification>> classification();

  String resourceType();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<String> comment();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<SubstanceReferenceInformation_Gene>> gene();

  static ImmutableSubstanceReferenceInformation.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceReferenceInformation.builder();
  }
}
