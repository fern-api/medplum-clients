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
  Optional<String> comment();

  Optional<List<ResourceList>> contained();

  Optional<List<SubstanceReferenceInformation_Gene>> gene();

  String resourceType();

  Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<SubstanceReferenceInformation_Target>> target();

  Optional<List<SubstanceReferenceInformation_Classification>> classification();

  Optional<Code> language();

  static ImmutableSubstanceReferenceInformation.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceReferenceInformation.builder();
  }
}
