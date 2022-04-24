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
    as = ImmutableSubstanceReferenceInformation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceReferenceInformation {
  Optional<List<SubstanceReferenceInformation_Gene>> gene();

  Optional<List<Extension>> extension();

  Optional<List<SubstanceReferenceInformation_Target>> target();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<SubstanceReferenceInformation_GeneElement>> geneElement();

  Optional<String> comment();

  Optional<Narrative> text();

  Optional<uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<code> language();

  Optional<id> id();

  Optional<List<SubstanceReferenceInformation_Classification>> classification();

  static ImmutableSubstanceReferenceInformation.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceReferenceInformation.builder();
  }
}
