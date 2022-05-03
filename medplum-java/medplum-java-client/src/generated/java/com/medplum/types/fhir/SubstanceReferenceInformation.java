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
  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<List<SubstanceReferenceInformation_Target>> target();

  Optional<Meta> meta();

  String resourceType();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<SubstanceReferenceInformation_Gene>> gene();

  Optional<List<Extension>> extension();

  Optional<String> comment();

  Optional<List<SubstanceReferenceInformation_Classification>> classification();

  Optional<List<ResourceList>> contained();

  Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement();

  static ImmutableSubstanceReferenceInformation.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceReferenceInformation.builder();
  }
}
